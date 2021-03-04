package JavaAssignment;

import java.util.Scanner;

//Write a program to take two integer inputs from userand print sum and product of them.
public class Inputnumadd {
    public static void main(String[] args) {

        int num1 ,num2,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter number1");
        num1 = sc.nextInt();
        System.out.println("\n Enter number2");
        num2 = sc.nextInt();
        sum = num1+num2;
        System.out.println("\n Sum of two Numbers :" + sum);
    }

}
