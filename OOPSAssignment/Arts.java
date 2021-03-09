package OOPSAssignment;
import Library.*;

public class Arts implements College {
     public String departmentName;
     public String rentedBookCount1,backCount;
     Books theBooks[] = new Books[50];
     public static int bookCount;
     public static int rentBookCount1;

     public void setDepartmentName(String Arts)
     {
      this.departmentName = "Arts"   ;
     }
     public String getDepartmentName()
     {
         return departmentName;
     }

     public void addBook(Books b)
     {
         if (bookCount < 50)
         {
             theBooks[bookCount] = b;
             rentedBookCount1 = rentedBookCount1 + 1;
         }

          else
         {     backCount = backCount + 1;
         System.out.println("No space to add more books");}

     }
     public int artBookCount()
     {
         return bookCount;
     }
     public int rentedBookCount()
     {
         return rentBookCount1;
     }
}
