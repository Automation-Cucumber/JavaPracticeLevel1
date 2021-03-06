package LoopsLevel1Assignment;

public class MultiplicationCalc {
    public static void main(String[] args) {

        int mult=24,mult1=50,mult2=29;
        int prd =1 ,prd2 =2,prd3=3;
        for (int i = 1;i<10;i++)
        {
            prd = mult*i;
            System.out.println("\n Multiplication Table of 24 :" + mult+"*"+i +"="+ mult);
            prd2 = mult1*i;
            System.out.println("\n Multiplication Table of 50 :" + mult1+"*"+i+"="+mult1);
            prd3 = mult2*i;
            System.out.println("\n Multiplication Table of 29 :" + mult2+"*"+i+"="+mult2);
        }

    }
}
