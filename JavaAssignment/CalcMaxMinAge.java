package JavaAssignment;
//Take input of age of 3 people by user and determine oldest and youngest among them.

import java.util.Scanner;

public class CalcMaxMinAge {
    public static void main(String[] args) {
        int age1,age2,age3;
        Scanner sc =new Scanner(System.in);
        System.out.println("\n Enter the Age1");
        age1 = sc.nextInt();
        System.out.println("\n Enter the Age2");
        age2 = sc.nextInt();
        System.out.printf("\n Enter the Age3");
        age3 = sc.nextInt();
        if(age1>age2 && age1>age3)
            System.out.println("\n Age1 is the oldest");
        else
            if(age2>age3 && age2>age1)
                System.out.println("\n Age2 is the oldest");
            else
                System.out.println("\n Age3 is oldest");
        if(age1<age2 && age1<age3)
            System.out.println("\n Age1 is the youngest");
        else
        if(age2<age3 && age2<age1)
            System.out.println("\n Age2 is the youngest");
        else
            System.out.println("\n Age3 is youngest");
    }
}
