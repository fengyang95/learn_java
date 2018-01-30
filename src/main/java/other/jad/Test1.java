package other.jad;

public class Test1 {
    public static void main(String[]args){
        Double a = new Double(127);
        Double b = 127d;
        Double c = Double.valueOf("127");

        System.out.println(a==b); //1
        System.out.println(a==c);  //2
        System.out.println(b==c);  //3
    }
}