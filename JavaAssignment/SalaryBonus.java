package JavaAssignment;
//A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
// Ask user for their salary and year of service and print the net bonus amount.

import java.sql.SQLOutput;
import java.util.Scanner;

public class SalaryBonus {

    public static void main(String[] args) {
        double usersal=0,netBonusAmount;
        int yos = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter User Salary" + usersal);
        usersal = sc.nextDouble();
        System.out.println("Enter Yearofservice" + yos);
        yos=sc.nextInt();
        if (yos>5)
            usersal = usersal + ((5*usersal)/100);

        System.out.println("User Salary Is :" + usersal);

    }


}
