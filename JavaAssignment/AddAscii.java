package JavaAssignment;

//Write a program to add 3 to the ASCII value of thecharacter 'd' and print the equivalent character.
public class AddAscii {
    public static void main(String[] args) {

        int character = 'd';
        int addcharacter = character + 3;
        char c = (char)addcharacter;
        System.out.println("\n Print the value and equivalent character : "+ addcharacter
                + "Equivalent Character is:"+c);

    }
}
