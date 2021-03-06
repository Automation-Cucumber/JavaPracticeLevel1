package LoopsLevel1Assignment;

import java.util.Scanner;

public class AverageUsingLoop {
    public static void main(String[] args) {

        int num;
        double total =0.0,avg;
        Scanner sc =new Scanner(System.in);
        //Using for loop to input 10 integers
        for(int i = 0;i<10;i++)
        {
            System.out.println("\n Enter the numbers");
           num =sc.nextInt();
           total =total+num;
        }
        avg =total/10;
        System.out.println("\n Total of 10 Integer Values is =" + total );
        System.out.println("\n Average of 10 Integer Value is =" +avg);
    }
}
