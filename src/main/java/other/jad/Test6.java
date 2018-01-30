package other.jad;

import java.util.stream.IntStream;

public class Test6 {
    public static void main(String[] args){
        System.out.println(IntStream.range(2, 20).
                filter(x->IntStream.range(2, x).filter(k->x%k==0).sum()>0).
                sum());
    }
}
