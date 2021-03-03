package Polymorphism;
//Create a class to print the area of a square and a rectangle.
// The class has two methods with the same name but different number of parameters.
// The method for printing area of rectangle has two parameters which are length and breadth
// respectively while the other method for printing area of square has one parameter which is side of square.

import java.util.Scanner;

public class AreaofSquareRect {

    //Method Overloading

    public double PrintArea(double l , double b)
    {
        double areaofrectangle =1;
        areaofrectangle = l*b;
        System.out.println("\n Area of Rectangle Is :" + areaofrectangle);
        return areaofrectangle;
    }

    public double PrintArea(double a)
    {
        double areaofsquare =1;
        areaofsquare =a*a;
        System.out.println("\n Area of Square is :" + areaofsquare);
        return areaofsquare;
    }

    public static void main(String[] args) {

        double l,b,a,areaofrect,areaofsquare;
        AreaofSquareRect ast =new AreaofSquareRect();
        Scanner sc =new Scanner(System.in);
        System.out.println("\n Enter the value of length and  breadth : ");
        l =sc.nextDouble();
        b=sc.nextDouble();
        System.out.println("\n Enter the value of Side of the Square");
        a=sc.nextDouble();
        System.out.println("\n Printing the Area of Rectangle and Square");
        areaofrect=ast.PrintArea(l,b);
        areaofsquare=ast.PrintArea(a);
    }
}
