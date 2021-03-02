package JavaAssignment;

import java.util.Scanner;

//A student will not be allowed to sit in exam if his/her attendance is less than 75%.
// Take following input from userNumber of classes held Number of classes attended.
// And print percentage of class attended
//Is student is allowed to sit in exam or not
//Modify the above question to allow student to sit if he/she has medical cause.
// Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly
public class CalcPercentage {
    public static void main(String[] args) {
        int NumberofclassesHeld,NumberofclassesAttended;
        double percentageofclassesAttended;
        Character MedicalCauseReason ;
        Scanner sc =new Scanner(System.in);
        System.out.println("\n Enter the total number of classes Held");
        NumberofclassesHeld = sc.nextInt();
        System.out.println("\n Enter the total number of classes Attended");
        NumberofclassesAttended =sc.nextInt();
        System.out.println("\n Enter the Medical Reason of the Student");
        MedicalCauseReason = sc.next().charAt(0);
        System.out.println("\n Print the value of Medical Reason " + MedicalCauseReason);
        percentageofclassesAttended = (NumberofclassesAttended*100)/NumberofclassesHeld;
        System.out.println("\n Attendance Percentage is : " + percentageofclassesAttended);
        if(percentageofclassesAttended>75 )
            System.out.println("\n Student is allowed to sit in exam");

        else if( percentageofclassesAttended<75)
            {
                if (MedicalCauseReason =='Y')
               System.out.println("\n Student is allowed to sit in exam with Medical Reasons");
            else
                if( MedicalCauseReason =='N')
               System.out.println("\n Student is not allowed to sit in the exam");
                else
                    System.out.println("\n Wrong Student");

            }

    }
}
