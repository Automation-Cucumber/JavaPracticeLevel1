package JavaAssignment;
//A school has following rules for grading system:
//Below 25 - Fb. 25 to 45 - Ec. 45 to 50 - Dd. 50 to 60 - Ce. 60 to 80 - Bf. Above 80 - A
//  Ask user to enter marks and print the corresponding grade

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calcgrade {

    public static void main(String[] args) {
        float marksofstudent;
        Scanner sc = new Scanner(System.in);
        System.out.println( "\n Enter the marks of the student");
        marksofstudent = sc.nextFloat();
        if(marksofstudent >80)
            System.out.println("\n Grade A");
        else
            if(marksofstudent>60 && marksofstudent<80)
                System.out.println("\n Grade Bf");
            else
                if(marksofstudent>50 && marksofstudent<60)
                    System.out.println("\n Grade Ce");
                else
                    if(marksofstudent>45 && marksofstudent<50)
                        System.out.println("\n Grade Dd");
                else
                    if(marksofstudent>25 && marksofstudent<45)
                        System.out.println("\n Grade Ec");
                    else
                        System.out.println("\n Grade Fb");
    }

}
