package other;

import java.util.ArrayList;

class Base {
    private Base() { System.out.println(0);}
    public Base(int i) {System.out.println(i);}
}

public class Test extends Base {
    public Test() {super(1);};
    public static void main(String argv[]){
        Test t = new Test();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Double> b = new ArrayList<>();
        System.out.println(a.getClass()==b.getClass());
        String s="hello world  ";
        String s2=s.trim();
        System.out.println(s.length());
        System.out.println(s2.length());

        Integer A = new Integer(3);
        Integer  B= 3;
        int C = 3;
        System.out.println(A==B);
        System.out.println(A==C);

    }


}
