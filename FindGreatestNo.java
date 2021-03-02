import java.util.Scanner;

public class FindGreatestNo {

    public static void main(String[] args) {
        {
            int num1,num2,num3;
            System.out.println("\n Enter three Numbers and find the greatest");
            Scanner sc= new Scanner(System.in);
            num1=sc.nextInt();
            num2=sc.nextInt();
            num3=sc.nextInt();
            if(num1>num2 && num1>num3)
                System.out.println("\n Number is greatest"+num1);
            else
                if(num2>num3 && num2>num1)
                    System.out.println("\n Number is greatest"+num2);
                else
                    System.out.println("\n Number is greatest"+num3);
        }
    }
}
