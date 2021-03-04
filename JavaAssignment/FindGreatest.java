package JavaAssignment;

import java.sql.SQLOutput;
import java.util.Scanner;

//Take two int values from user and print greatest among them
public class FindGreatest {

    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Print Greatest Number among two int values");
        System.out.println("\n Enter Number1");
        num1 = sc.nextInt();
        System.out.println("\n Enter Number2");
        num2 = sc.nextInt();
        if(num1>num2)
            System.out.println("\n Number Greates is :"+ num1);
        else
            System.out.println("\n Number Greates is :"+ num2);
    }
}
