package Polymorphism;

import java.util.Scanner;

//Create a class named 'PrintNumber' to print various numbers of
// different datatypes by creating different methods with the same name 'println' having a parameter for each data type
class PrintNumber {

        //Method Overloading

       public  void println(int data)
        {
            System.out.println("\n Print the number is :" + data);
        }

        void println( int data, char c)
        {

            System.out.println("\n Print the number is : " + data);
            System.out.println("\n Print the Character is :" + c);
        }

        void println( float a, double b, int c)
        {
            System.out.println("\n Print the number is :" + a);
            System.out.println("\n Print the number is :" + b);
            System.out.println("\n Print the number is :" + c);
        }

    public static void main(String[] args) {

         PrintNumber pn = new PrintNumber();
          pn.println(40);
          pn.println(30,'A');
          pn.println(10,36.89,23);

    }
    }
