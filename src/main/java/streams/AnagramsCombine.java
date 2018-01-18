package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import static java.util.stream.Collectors.*;
import java.util.stream.Stream;

public class AnagramsCombine {
    public static void main(String[] args) throws IOException{
        Path dictionary= Paths.get("dictionary.txt");
        int minGroupSize=Integer.parseInt("2");

        try(Stream<String> words= Files.lines(dictionary)){
            words.collect(groupingBy(word->alphabetize(word)))
                    .values().stream()
                    .filter(group->group.size()>=minGroupSize)
                    .forEach(g->System.out.println(g.size()+":"+g));
        }
    }

    public static String alphabetize(String s){
        char[] a=s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
