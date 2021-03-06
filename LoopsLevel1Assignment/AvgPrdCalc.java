package LoopsLevel1Assignment;

import java.util.Scanner;

//Take integer inputs from user until he/she presses q ( Ask to press q to quit after every integer input).
// Print average and product of all numbers
// Ask to press q to quit after every integer input Print average and product of all numbers
public class AvgPrdCalc {
    public static void main(String[] args) {

        String choice = "";
        int total = 0;
        int prd = 1;
        int count = 0;
        Scanner input = new Scanner(System.in);

        while(!choice.equals("q")){
            System.out.println("Enter a number or q to quit");
            choice = input.next();

            if(!choice.equals("q")){
                int number = Integer.parseInt(choice);
                total = total+number;
                prd = prd*number;
                count++;
            }
        }

        System.out.println("Product is: "+prd+"\nAverage is: "+((float)total/count));

    }
}