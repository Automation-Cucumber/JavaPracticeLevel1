package LoopsLevel1Assignment;

//Write a program to find greatest common divisor (GCD)or highest common factor (HCF) of given two numbers
public class GCDCalc {
    public static void main(String[] args) {
        int x = 16, y = 4, gcd = 1;

        for (int i = 1; i <= x && i <= y; i++)
        {
            if(x%i==0 && y%i==0)
                gcd = i;
        }

        System.out.printf("GCD of %d and %d is: %d", x, y, gcd);
    }
    }



