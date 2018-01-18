package designpattern.singleton;

public class LazySingleton {
    private LazySingleton(){}

    private static LazySingleton lazySingleton=null;
    public static synchronized LazySingleton getInstance(){
        if(lazySingleton==null){
            lazySingleton=new LazySingleton();
        }
        return lazySingleton;
    }
}
