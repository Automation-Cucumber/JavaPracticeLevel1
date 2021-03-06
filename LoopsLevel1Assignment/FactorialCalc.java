package LoopsLevel1Assignment;

import java.util.Scanner;

//Factorial of any number n is represented by n! andis equal to 1*2*3*....*(n-1)*n. E.g.-
public class FactorialCalc {
    public static void main(String[] args) {

        int num,fact=1,i;
        //Calculate the factorial of the number
        System.out.println("\n Enter the number");
        Scanner sc =new Scanner(System.in);
        num=sc.nextInt();
        for( i =1 ; i<=num;i++)
            fact=fact*i;
        System.out.println("Factorial of" +num + "is :" + fact);

    }
}
