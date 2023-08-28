package org.example.practice;

import java.util.Scanner;

class circle
{
    private int radius;
    private double area;
    private double perimeter;

    public circle()
    {
        System.out.println("Enter Radius : ");
        Scanner kb = new Scanner(System.in);
        int r = kb.nextInt();
        this.radius = r;
        this.area = 3.14*r*r;
        this.perimeter = 2*3.14*r;

    }

    public void Pintdetails()
    {
        System.out.println("Area of Circle : "+area);
        System.out.println("Perimeter of circle : "+perimeter);
    }


}
public class Default_Constructor_example {

    public static void main(String []args)
    {
        circle c1 = new circle();
        c1.Pintdetails();
        circle c2 = new circle();
        c2.Pintdetails();
    }
}
