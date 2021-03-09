package Library;

import java.util.Scanner;

public class Books {

    public String isbn;
    public String isBookRented;
    public String author;
    Scanner inp = new Scanner(System.in);
    public Books()
    {
        System.out.println("\n Enter the Serial No of Book :");
        this.isbn = inp.next();
        System.out.println("\n Enter isBookRented(Y/N):");
        this.isBookRented=inp.next();
        System.out.println("\n Enter the Author Name:");
        this.author = inp.next();
    }


    public  String getISBN(){
        return isbn;
    }

    public String getIsBookRented()
    {
        return isBookRented;
    }

    public  String getAuthor()
    {
        return author;
    }
}
