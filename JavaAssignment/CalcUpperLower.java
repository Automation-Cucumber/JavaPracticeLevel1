package JavaAssignment;

import java.util.Scanner;

public class CalcUpperLower {
    public static void main(String[] args) {

        Character ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter the Character");
        ch=sc.next().charAt(0);
        if(ch>='A' && ch<='Z')
            System.out.println("\n Upper Case Letter : " + ch);
        else
            if(ch>='a' && ch<='z')
                System.out.println("\n Lower Case Letter : " + ch);
            else
                System.out.println("\n Not Uppercase or LowerCase Letter");
    }
}
