package javafundamentals;

import java.util.Scanner;

public class BirthdayDiscount {

    //Q4: public class ExtraBirthDayDiscount
    //If your day order is more than 1000 and its your bday you get cash back of 10% over above 1000
    //Take input as birthday of the user

    public static void main(String[] args) {

        int custOrder,cashBack;
        String status,birthdate;
        System.out.println("\n Enter the Customer Order");
        Scanner sc= new Scanner(System.in);
        custOrder = sc.nextInt();
        System.out.println("\n Enter the Birthdate of the Customer");
        birthdate = sc.next();
        if(custOrder>1000 && birthdate=="24Dec")
        {
            cashBack=(10*custOrder)/100;
            System.out.println("\n Customer gets Cashback of Rs:" + cashBack);
        }
        else
            System.out.println("\n Sorry Customer No Cash back");

    }

    }

