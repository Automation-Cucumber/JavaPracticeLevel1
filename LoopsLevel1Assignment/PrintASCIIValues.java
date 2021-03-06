package LoopsLevel1Assignment;
//4.Print ASCII values and their equivalent characters.ASCII value vary from 0 to 255
public class PrintASCIIValues {
    public static void main(String[] args) {
        char ascii;
        int i;
        for(i=0;i<=255;i++)
        {
            System.out.println(" The ASCII value of " + (char)i + "  =  " + i);
        }

    }
}
