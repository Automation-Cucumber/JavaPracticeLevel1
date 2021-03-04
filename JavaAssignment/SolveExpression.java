package JavaAssignment;

import java.util.Scanner;

//Ifx = 2 y = 5 z = 0then find values of the following expressions:
// a. x == 2 b. x != 5c. x != 5 && y >= 5d. z != 0 || x == 2e. !(y < 10)
public class SolveExpression {

    public static void main(String[] args) {

        int x = 2 ,y = 5 , z = 0;
        int ch;
        Scanner sc =new Scanner(System.in);
        System.out.println("\n Enter the choice");
        ch=sc.nextInt();
        switch(ch)
        {
           case 1:
                  if(x==2)
                System.out.println("Value of Expression is True" );
                  break;
           case 2:
                 if(x!=5)
                System.out.println("Value of Expression is True");
                 break;
           case 3:
                  if(x != 5 && y >= 5)
                System.out.println("Value of Expression is False");
                  break;
            case 4:
                    if(z != 0 || x == 2)
                System.out.println("Value of Expression is False");
                    break;
            case 5:
                  if (!(y < 10))
                System.out.println("Value of Expression is False");
                  break;
            default:
                System.out.println("Wrong Entry");
        }


    }

}
