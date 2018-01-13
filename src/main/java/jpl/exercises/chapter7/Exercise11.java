package jpl.exercises.chapter7;

import java.util.Scanner;

/**
 * (统计学方面：计算标准差)编程练习题 5.45 计算数字的标准差。本题使用一个和它不同但等价
 * 的公式来计算 n 个数的标准差 。
 */
public class Exercise11 {
   /**
    Compute the deviation of double values
    */
    public static double deviation(double[] x){
        double meanValue=mean(x);
        double squareSum=0;
        for(double element:x){
            squareSum=squareSum+Math.pow((element-meanValue),2);
        }
        return Math.sqrt(squareSum/(x.length-1));
    }

    /**
     * Compute the mean of an array of double values V
      */
    public static double mean(double[] x){
        double sum=0;
        for(double element:x){
            sum+=element;
        }
        return sum/x.length;
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter ten number: ");
        double[] array=new double[10];
        for(int i=0;i<10;++i){
            array[i]=input.nextDouble();
        }
        System.out.println(String.format("The mean is %f",mean(array)));
        System.out.println(String.format("The standard deviation is %f",deviation(array)));
    }
}
