package other.jad;

public class Test4 {
    public static void main(String[] args){
        Integer[] a = {1,2,3,4,5,6,7,8,9,10};
        for ( int k: a) {
            k++;
        }
        int sum = 0;
        for ( int k: a) {
            sum += k;
        }
        System.out.println(sum);
    }
}
