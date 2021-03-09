package Library;

import java.util.Scanner;

public class Staff {

    public int age;
    public String fname;
    public String lname;

    Scanner inp =new Scanner(System.in);

    public Staff()
    {
        System.out.println("\n Enter Age");
        this.age =inp.nextInt();
        System.out.println("\n Enter First Name");
        this.fname =inp.next();
        System.out.println("\n Enter Last Name");
        this.lname = inp.next();
    }

    public int getAge() {
        return age;
    }

    public String getFname()
    {
        return fname;
    }
    public String getLname()
    {
        return lname;
    }
}
