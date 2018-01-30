package other.jad;

class M{
    void f(M m){
        System.out.println("in M.f");
    }
    void g(M m){
        System.out.println("in M.g");
    }
}
class C extends M{
    void f(C c){
        System.out.println("in C.f");
    }
    void g(M c){
        System.out.println("in C.g");
    }
}
class H extends C{
    void f(H h){
        System.out.println("in H.f");
    }
    void g(M h){
        System.out.println("in H.g");
    }
}
public class T{
    public static void main(String[] args){
        M h = new H();
        C c = new H();
        c.f(h);  //1
        h.g(c);  //2
    }
}
