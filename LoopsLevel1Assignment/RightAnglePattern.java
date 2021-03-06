package LoopsLevel1Assignment;

import java.util.Scanner;

public class RightAnglePattern {
    public static void main(String[] args) {

        int n;
        //Enter the Value of n
        Scanner sc= new Scanner(System.in);
        System.out.println("\n Enter the value of n");
        n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}

