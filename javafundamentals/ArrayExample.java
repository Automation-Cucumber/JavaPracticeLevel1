package javafundamentals;

import java.util.Random;

public class ArrayExample {
    public static void main(String[] args) {
        int number[]=new int[10];
        Random random = new Random();

        for(int i = 0;i< number.length;i++)
        {
            number[i] = random.nextInt();
            System.out.println("\n Print the random numbers" + number[i]);
        }
    }
}
