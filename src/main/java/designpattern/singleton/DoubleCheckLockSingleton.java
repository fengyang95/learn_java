package designpattern.singleton;

public class DoubleCheckLockSingleton {
    private volatile static DoubleCheckLockSingleton instance=null;
    private DoubleCheckLockSingleton(){}

    public static DoubleCheckLockSingleton getInstance(){
        if(instance==null){
            synchronized (DoubleCheckLockSingleton.class){
                if(instance==null){
                    instance=new DoubleCheckLockSingleton();
                }
            }
        }
        return instance;
    }
}
