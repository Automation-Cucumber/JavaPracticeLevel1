package javafundamentals;

import java.util.Scanner;

public class Calcgrosspay {

    public static void main (String args[])
    {
        float basicpay,da,hra,medicalall;
        float grosspay = 0,hrsrate,totalpay;
        int hrsworked;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the basic pay of the employee");
        basicpay = sc.nextFloat();
        System.out.print("Enter the da percentage of the employee");
        da = sc.nextFloat();
        System.out.print("Enter the hra percentage of the employee");
        hra = sc.nextFloat();
        System.out.print("Enter the Medical Allowance of the employee");
        medicalall = sc.nextFloat();
        System.out.println("Enter the hours employee worked");
        hrsworked = sc.nextInt();
        System.out.println("Enter the hours rate of the employee worked");
        hrsrate= sc.nextFloat();
        hra = (hra*basicpay)/100;
        da = (da*basicpay)/100;
        totalpay = hrsrate*hrsworked;
        System.out.println("Total Pay of the employee is :" + totalpay);
        grosspay = basicpay+hra+da+medicalall+totalpay;
        System.out.println("Gross Pay of the employee is :" + grosspay);

    }
}
