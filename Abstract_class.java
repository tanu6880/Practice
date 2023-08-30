package org.example.practice;

abstract class Bikes
{
    abstract void run();
    int price;
    Bikes()
    {
        price = 1000000;
    }
}
class honda extends Bikes
{
    void run()
    {
        System.out.println("price is : "+price);
        System.out.println("Running Safely");
    }
}
abstract public class Abstract_class {
    public static void main(String[] args) {
      //  Bikes B1 = new Bikes() ; error
        // only obj can not create of abstract class otherwise can create constructor , member, method even main body
        Bikes B1 = new honda();
        honda obj = new honda();
        obj.run();
        B1.run();


    }
}
