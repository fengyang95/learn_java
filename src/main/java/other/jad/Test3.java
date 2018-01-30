package other.jad;

public class Test3 {
    public static void main(String[] args) {
        CloneT c = new CloneT();
        CloneT c1 = (CloneT)c.clone();
        c1.b.setA(3);
        c1.ii = 3;
        System.out.println(c1==c);              //1
        System.out.println(c1.b==c.b);        //2
        System.out.println(c.toString()+c1.toString());	  //3
    }
}
class Base implements Cloneable{
    int a = 1;
    public String toString(){
        return String.valueOf(a);
    }
    public void setA(int a){
        this.a = a;
    }
    public int getA(){
        return a;
    }
}

class CloneT implements Cloneable{
    transient int i;
    private int pi;
    static int num;
    Integer ii = new Integer(1);
    transient Base b = new Base();

    public CloneT(){
        num++;
    }
    public Object clone(){
        try{
            return super.clone();
        }catch(CloneNotSupportedException e){
            System.out.println("clone not supported!");
            return null;
        }
    }

    public String toString(){
        return String.valueOf(i)+String.valueOf(pi)+String.valueOf(num)+String.valueOf(ii)+String.valueOf(b.getA());
    }
}
