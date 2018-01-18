package effectivejava.examples.thirdedtion.item42;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousTest {
    public static void main(String[] args){
        List<String> words=new ArrayList<>();
        words.add("JDIFA");
        words.add("fjiafja8fjiasfjias");
        words.add("jiaffjiafjiasf");
        words.add("jifaif3");
        words.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(),o2.length());
            }
        });
        for(String word:words){
            System.out.println(word);
        }

        words.sort(( s1, s2)->Integer.compare(s2.length(),s1.length()));
        for(String word:words){
            System.out.println(word);
        }

        StringBuilder sum=new StringBuilder();
        words.forEach((x)->sum.append(x));
        System.out.println(sum);

    }
}
