package JavaAssignment;

import java.util.Scanner;

//Write a program to convert Fahrenheit into Celsius
public class ConvertFahtocelsius {
    public static void main(String[] args) {

        double temp;
        System.out.println("\n Enter the temperature in Fahrenheit");
        Scanner sc =new Scanner(System.in);
        temp = sc.nextDouble();
        double c = (5*(temp-32))/9;
        System.out.println("\n Print temperature in Celsius is :" + c);
    }
}
