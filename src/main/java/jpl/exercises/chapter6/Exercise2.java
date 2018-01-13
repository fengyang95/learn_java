package jpl.exercises.chapter6;

import java.math.BigInteger;

/**
 *  求一个整数各位数字之和 ） 编写一个方法 ， 计算一个整数各位数字之和 。 使用下面的方法头 ：
 public static int sumDigits ( long n )
 */
public class Exercise2 {
    public static int sumDigits(long n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }

    public static void main(String[] args){
        long n1=198943;
        System.out.println(sumDigits(n1));
        long n2=32141241;
        System.out.println(sumDigits(n2));
        long n3=new Long("243214124112");
        System.out.println(sumDigits(n3));
    }
}
