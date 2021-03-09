package Library;

import java.util.Scanner;

public class Furniture {

    public String type;
    public String material;

    Scanner inp =new Scanner(System.in);
    public Furniture()
    {
        System.out.println("\n Enter Type of furniture (chair/tables/racks):");
        this.type=inp.next();
        System.out.println("\n Enter the Material of furniture(iron/wood:");
        this.material =inp.next();
    }
    public String getType()
    {
        return type;
    }
    public String getMaterial()
    {
        return  material;
    }
}
