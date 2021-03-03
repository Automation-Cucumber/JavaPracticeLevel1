package Polymorphism;

//Create a class 'Degree' having a method 'getDegree' that prints "I got a degree".
// It has two subclasses namely 'Undergraduate' and 'Postgraduate' each having a method with the same name
// that prints "I am an Undergraduate" and "I am aPostgraduate" respectively. Call the method by creating
// an object of each of the three classes

 class Degree {

    public void getdegree()
    {
        System.out.println("\n I got a degree");
    }
}

 class Undergraduate extends Degree
{
    public void printdegree()
    {
        System.out.println("\n I am Undergraduate");
    }
}

 class Postgraduate extends Degree
{
    public void printdegree()
    {
        System.out.println("\n I am Postgraduate");
    }
}

 class College
{
    public static void main(String[] args) {
        Postgraduate pg =new Postgraduate();
        pg.printdegree();
        Undergraduate ug = new Undergraduate();
        ug.printdegree();
        Degree dg =new Degree();
        dg.getdegree();

    }
}
