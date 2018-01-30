package other.jad;

class A1 {
    public int data=5;
    private int pd = 6;
    public void print() {
        System.out.println(data+pd);
        f();
    }
    protected void f() {
        System.out.println("A::f()");
    }
}
class B1 extends A1 {
    public int data=2;
    private int pd = 3;
    public void print() {
        super.print();
        System.out.println(data+pd);
    }
    protected void f() {
        System.out.println("B::f()");
    }
}
public class TestAB {
    public static void main(String[] args) {
        A1 a = new B1();
        a.print();
    }
}