package streams;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * sample code of book Effective Java 3rd edition Item45: Use streams judiciously
 * use iteration
 * @author fengyang
 * @since 2018/1/14
 */
public class AnagramsIteration {
    public static void main(String[] args)  throws IOException{
        File dictionary=new File("dictionary.txt");
        int minGroupSize=Integer.parseInt("2");
        Map<String,Set<String>> groups=new HashMap<>();
        try(Scanner s=new Scanner(dictionary)){
            while(s.hasNext()){
                String word=s.next();
                groups.computeIfAbsent(alphabetize(word),(unused)->new TreeSet<>()).add(word);
            }
        }
        for(Set<String> group:groups.values()){
            if(group.size()>=minGroupSize){
                System.out.println(group.size()+":"+group);
            }
        }
    }

    public static String alphabetize(String s){
        char[] a=s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
