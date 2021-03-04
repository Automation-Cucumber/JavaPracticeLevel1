package JavaAssignment;
// Length and breadth of a rectangle are 5 and 7 respectively.
// Write a program to calculate the area and perimeter of the rectangle

public class AreaandPerimeter {
    public static void main(String[] args) {

        int l = 5 ,b = 7;
        int area,perimeter;
        area = l*b;   //area of rectangle
        perimeter = 2*(l+b); // perimeter of rectangle
        System.out.println("\n Area of rectangle is :" + area);
        System.out.println("\n Perimeter of rectangle is : " + perimeter);

    }
}
