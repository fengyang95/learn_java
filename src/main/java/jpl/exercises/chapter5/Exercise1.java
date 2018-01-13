package jpl.exercises.chapter5;

import java.util.Scanner;

/**
 *  统计正教和负數的个教然后计算这些教的平均值
 */
public class Exercise1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int number=0;
        int numberOfPositive=0;
        int numberOfNegative=0;
        double total=0;
        double average;
        System.out.print("Enter an integer, the input ends if it is 0: ");
        int x=input.nextInt();
        while(x!=0){
            if(x>0){
                numberOfPositive++;
            }else{
                numberOfNegative++;
            }
            number++;
            total+=x;
            x=input.nextInt();
        }
        try{
            average=total/number;
            System.out.println(String.format("The number of positive is %d",numberOfPositive));
            System.out.println(String.format("The number of negative is %d",numberOfNegative));
            System.out.println(String.format("The total is %f",total));
            System.out.println(String.format("The average is %f",average));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
