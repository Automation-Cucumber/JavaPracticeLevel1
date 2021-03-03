      package InheritanceAssignment;

      import java.util.Scanner;

      class LaptopFeatures {

           static final String Name ="Lenovo";
           static final String Price = "$1000";
           static final String Pro ="i3" ;
           static final String Ram ="2GB";
           static final String Hard = "500GB";

          void DisplayFeatureConstant()
          {
              System.out.println("\n Name of the Laptop :" + Name);
              System.out.println("\n Name of the Price :" + Price);
              System.out.println("\n Name of the Processor :" + Pro);
              System.out.println("\n Name of the RAMTYPE :" + Ram);
              System.out.println("\n Name of the HARDDRIVE :" + Hard);

          }

          void DisplayFeatures(String Name, String Price, String Pro, String Ramtype, String Hardr) {
              System.out.println("\n Name of the Laptop :" + Name);
              System.out.println("\n Name of the Price :" + Price);
              System.out.println("\n Name of the Processor :" + Pro);
              System.out.println("\n Name of the RAMTYPE :" + Ramtype);
              System.out.println("\n Name of the HARDDRIVE :" + Hardr);
          }


      }

      class Createlaptop extends LaptopFeatures {
          String Name;
          String Price;
          String Pro;
          String Ram;
          String Hard;

          public static void main(String[] args) {
              LaptopFeatures cl = new LaptopFeatures();
              cl.DisplayFeatureConstant();
              LaptopFeatures c2 = new LaptopFeatures();
              c2.DisplayFeatures("Sony", "2000$", "i9", "8GB", "1TB");
          }

      }