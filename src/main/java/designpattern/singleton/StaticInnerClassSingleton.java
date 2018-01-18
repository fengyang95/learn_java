package designpattern.singleton;

import javax.print.DocFlavor;

public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton(){}

    private static class SingletonHolder{
        private static StaticInnerClassSingleton instance=new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return SingletonHolder.instance;
    }

}
