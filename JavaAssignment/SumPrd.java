package JavaAssignment;

import java.util.Scanner;
// Take two integer inputs from user. First calculatethe sum of two then product of two.
// Finally, print the sumand product of both obtained results
public class SumPrd {
    public static void main(String[] args) {
        int num1 ,num2,sum=0,prd=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter number1");
        num1 = sc.nextInt();
        System.out.println("\n Enter number2");
        num2 = sc.nextInt();
        sum = num1+num2;
        prd=num1*num2;
        System.out.println("\n Sum of two Numbers :" + sum);
        System.out.println("\n Product of two numbers : " + prd);
    }

}
