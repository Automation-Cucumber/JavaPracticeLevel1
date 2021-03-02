package JavaAssignment;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

//A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
// Ask user for quantity
// Suppose, one unit will cost 100.Judge and print total cost for user
public class Printtotalcost {
    public static void main(String[] args) {

        double purchasedquantity,discount=0.0;
        double costofoneunit = 100.0,totalcost,Finalcost;
        System.out.println("\n Print Total Cost for User ");
        Scanner sc =new Scanner(System.in);
        System.out.println("\n Enter the Purchased Quantity by the User");
        purchasedquantity = sc.nextDouble();
        totalcost = purchasedquantity*costofoneunit;
        System.out.println("\n Total Cost of given Quantity is :" + totalcost);
        if(totalcost>1000.0)
            discount = (10*totalcost)/100;
        Finalcost = totalcost -discount;
        System.out.println("\n Total Discount Given to User is :" + discount);
        System.out.println("\n Final Cost given the User is :" + Finalcost);

    }
}
