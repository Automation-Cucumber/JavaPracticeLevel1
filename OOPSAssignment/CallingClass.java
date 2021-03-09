package OOPSAssignment;

import Library.Books;
import Library.Furniture;
import Library.Staff;

import java.util.Scanner;
import java.util.Arrays;

public class CallingClass{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int noEngBooks = 0;
        int noArtBooks = 0;
        int noFurniture = 0;
        int noStaff = 0;

        System.out.println("Enter Number of Engineering Books you want to enter:");
        noEngBooks = input.nextInt();
        input.nextLine();

        System.out.println("Enter Number of Art Books you want to enter:");
        noArtBooks = input.nextInt();
        input.nextLine();

        System.out.println("Enter Number of Furniture you want to enter:");
        noFurniture = input.nextInt();
        input.nextLine();

        System.out.println("Enter Number of Staff you want to enter:");
        noStaff = input.nextInt();
        input.nextLine();

        Books engBooks[] = new Books[noEngBooks];

        Books artBooks[] = new Books[noArtBooks];

        Furniture theFurniture[] = new Furniture[noFurniture];

        Staff theStaff[] = new Staff[noStaff];

        int totalBooks = 0;
        int totalRentedBooks = 0;

        int noOfChairs = 0;

        int noOfStaff = 0;

        int eldestMember[] = new int[noStaff];

        Engineering eng = new Engineering();
        Arts art = new Arts();

        for (int i = 0; i < engBooks.length; i++){
            System.out.println("Enter Engineering Book Details");
            engBooks[i] = new Books();
            eng.addBook(engBooks[i]);
        }

        for (int i = 0; i < artBooks.length; i++){
            System.out.println("Enter Art Book Details");
            artBooks[i] = new Books();
            art.addBook(artBooks[i]);
        }

        for (int i = 0; i < theFurniture.length; i++){
            System.out.println("Enter Furniture Details");
            theFurniture[i] = new Furniture();
        }

        for (int i = 0; i < theStaff.length; i++){
            System.out.println("Enter Staff Details");
            theStaff[i] = new Staff();

        }

        totalBooks = eng.engBookCount() + art.artBookCount();
        totalRentedBooks = eng.rentedBookCount() + art.rentedBookCount();

        System.out.println("Total number of books in College are " + totalBooks);

        System.out.println("Total number of rented books in College are " + totalRentedBooks);

        for (int j = 0; j < theFurniture.length; j++){
            if(theFurniture[j].getType().equalsIgnoreCase("chair"))
                noOfChairs++;
        }

        System.out.println("Number of chairs in Library are " + noOfChairs);

        System.out.println("Number of Staff in Library are " + theStaff.length);

        for (int k = 0; k < theStaff.length; k++){
            eldestMember[k] = theStaff[k].getAge();
        }

        Arrays.sort(eldestMember);
        System.out.println("Eldest member in Library is " + eldestMember[eldestMember.length-1]);
    }
}