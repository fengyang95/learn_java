package other;

public class Test6 {
    int i=2;
    class A {
        int k = i;
        void f() { k=k+i; }
    }
    void f() {
        A a = new A();
        for (i=0; i<10; i++ )
            a.f();
        System.out.println(a.k);
    }
    public static void main(String[] args) {
        Test6 m = new Test6();
        m.f();
    }
}
