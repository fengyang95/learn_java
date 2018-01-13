package jpl.exercises.chapter7;

import java.util.Random;

/**
 *(随机数选择器)编写一个方法，返回1到54之间的随机数，不包括传递到参数中的 numbers 。
 * 如下指定这个方法头：
 *public static int getRandom ( int . . . numbers )
 */
public class Exercise13 {
    public static int getRandom(int ... numbers){
        Random random=new Random();
        boolean[] ignore=new boolean[55];
        for(int num:numbers){
            if(num>=1&&num<=54){
                ignore[num]=true;
            }
        }
        boolean found=false;
        int result=0;
        while(!found){
            double tempNum=random.nextDouble()*53+1;
            result=(int)Math.round(tempNum);
            if(!ignore[result]){
                found=true;
            }
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(getRandom(3,5,14,51));
        System.out.println(getRandom(35,54,23));
    }
}
