package org.example.practice;

class Vehicle
{
    public String name;
    public double range;

    public void show()
    {
        System.out.println("Name is : "+ name);
        System.out.println("Range is : "+ range);
    }

}
class For_velar extends Vehicle
{
    public For_velar(String name, double range)
    {
        this.name=name;
        this.range=range;
    }
}
public class Interitence {

    public static void main(String []args)
    {
        For_velar F1 = new For_velar("TATA MOTER",5555000.76);
        F1.show();
    }
}
