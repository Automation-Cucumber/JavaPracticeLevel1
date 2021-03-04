package JavaAssignment;

import java.util.Scanner;

//Take values of length and breadth of a rectangle from user and check if it is square or not
public class CheckArea {
    public static void main(String[] args) {

        double length,breadth;
        System.out.println("\n Input length and breadth of a rectangle from user and check if it is square or not ");
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter the length of the Rectangle");
        length = sc.nextDouble();
        System.out.println("\n Enter the breadth of the Rectangle");
        breadth = sc.nextDouble();
        if (length == breadth)
            System.out.println("\n length and breadth of a rectangle form a square");
        else
            System.out.println("\n length and breadth of a rectangle form a rectangle");
    }

}
