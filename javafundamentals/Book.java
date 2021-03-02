package javafundamentals;

import java.util.Scanner;

public class Book {

     String Name;
     String ISBN;
     int pages;
     String Author;
      int noofbooks=0;


    public Book()
    {
    noofbooks++;
    }

    public Book(String Name,String ISBN,int pages,String Author)
    {
        this.Name = Name;
        this.ISBN = ISBN;
        this.pages = pages;
        this.Author = Author;
    }

    public int getCountBooks()
    {
       return noofbooks;
    }
}
