package OOPSAssignment;

import Library.*;
import java.util.Scanner;

public class Engineering implements College {

       public String departmentName;
       Books theBooks[] = new Books[50];
       public static int bookCount;
       public static int rentBookCount;

       public void setDepartmentName( String Engineering){
           this.departmentName = "Engineering";
        }

       public  String getDepartmentName()
       {
           return departmentName;
       }

       public void addBook(Books b)
       {
           if(bookCount<50) {
               theBooks[bookCount] = b;
               if (theBooks[bookCount].getIsBookRented().equals('Y')) {
                   rentBookCount++;
               }
               bookCount++;
           }
           else
                {
                   System.out.println("No Space to add more books");
               }
           }
        public int engBookCount()
           {
               return bookCount;

           }
           public int rentedBookCount()
           {
               return rentBookCount;
           }
       }






