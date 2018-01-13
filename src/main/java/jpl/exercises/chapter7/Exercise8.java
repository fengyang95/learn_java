package jpl.exercises.chapter7;

/**
 *(求数组的平均值)编写两个重载的方法,使用下面的方法头返回一个数组的平均数:
 *public static int average ( int [] array)
 *public static double average ( double [] array)
 * @author  fengyang
 * @since 2018/1/10
 */
public class Exercise8 {
    public static int average(int[] array){
        int sum=0;
        for(int element:array){
            sum+=element;
        }
        return sum;
    }

    public static double average(double[] array){
        double sum=0;
        for(double element:array){
            sum+=element;
        }
        return sum;
    }

    public static void main(String[] args){
        int[] intArray={1,3,4,1,5,153};
        double[] doubleArray={1.0,3.0,4,1,5,153};
        System.out.println(average(intArray));
        System.out.println(average(doubleArray));
    }

}
