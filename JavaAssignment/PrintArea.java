package JavaAssignment;

import java.util.Scanner;

//Ask user to give two double input for length and breadth of a rectangle and print area type casted to int
public class PrintArea {
    public static void main(String[] args) {

        double l ,b,areaofrect;
        int areatypecaseted;
        System.out.println("\n Calculating Area of Rectangle in double and typecasting in int");
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter length of the rectangle");
        l = sc.nextDouble();
        System.out.println("\n Enter breadth of the rectangle");
        b = sc.nextDouble();
        areaofrect = l*b;
        System.out.println("\n Area of Reactangle in double is :"+ areaofrect);
        areatypecaseted = (int)areaofrect;
        System.out.println("\n Area of Rectangle in int is : " + areatypecaseted);

    }
}
