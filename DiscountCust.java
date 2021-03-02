import java.sql.SQLOutput;
import java.util.Scanner;

public class DiscountCust {

    //Q3 : public class CustomerDiscountForADay {
    //    // if total order of customer is more than 1000, upgrade them to Gold status
    //    //Else give message to them they are short by 1000-amount they have ordered

    public static void main(String[] args) {

        int custOrder;
        String status;
        System.out.println("\n Enter the Customer Order");
        Scanner sc= new Scanner(System.in);
        custOrder = sc.nextInt();
        if(custOrder>1000) {
            status = "Gold";
            System.out.println("\n Customer your Status is Gold" + status);
        }
        else
            System.out.println("\n Customer is short by 1000 - amount they have ordered");

    }

}
