package LoopsLevel1Assignment;

public class PatternOneZero {
    public static void main(String[] args) {
        int i, j;
        for (i = 5; i > 0; i = i - 1)
        {
            for (j = 1; j <= i; j++)
            {
                if (j % 2 == 0) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
        }
    }