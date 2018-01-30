package other;


public class Test3 {
    int xy=9;
    public void y(){}

    public void take(){
        int z=90;
        String s="jif";
        class Test{
            public void x(){
                take();
                y();
                xy+=3;
                System.out.println(s);
                System.out.println(z);
            }
        }
    }
    public static void main(String[] args){
        String[] strings=new String[10];
        for(int i=0;i<strings.length;++i){
            System.out.println(strings[i]);
        }
        System.out.println(Math.floor(-2.1));
    }
}
