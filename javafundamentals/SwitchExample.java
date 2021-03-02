package javafundamentals;

import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args)
    {
        int num,ch;
        System.out.print("\n Switch Case Example");
       Scanner sc = new Scanner(System.in);
        System.out.print("\n Enter number");
                num =sc.nextInt();
        System.out.print("\n Enter User Choice");
        ch = sc.nextInt();
        switch(ch)

        {
            case 1:
                System.out.print("One");
                break;
            case 2:
                System.out.print("Two");
                break;
            case 3:
                System.out.print("Three");
                break;
            default:
                System.out.print("\n Wrong Choice Entered");
        }

    }


}
