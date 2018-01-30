package other.jad;

public class Test2{
    public static void main(String[] args) {
        String s1 = "ZJU";
        String s2 = new String("ZJU");
        String s3 = "ZJ";
        s3 += "U";
        String s4 = s2.intern();

        System.out.println(s1==s2); //1
        System.out.println(s1==s3); //2
        System.out.println(s1==s4); //3
    }
}
