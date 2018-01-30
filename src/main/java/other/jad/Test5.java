package other.jad;

public class Test5 {
    static void f() throws Exception {
        throw new RuntimeException();
    }
    public static void main(String[] args) {
        try {
            f();
            System.out.print("A");
        } catch (RuntimeException ex) {
            System.out.print("B");
        } catch (Exception ex1) {
            System.out.print("C");
        } finally {
            System.out.print("D");
        }
        System.out.print("E");
    }
}
