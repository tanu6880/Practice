package org.example.practice;

class Bike
{
    public String name;
    public String color;

    public Bike()
    {
        name="KTM";
        color = "yellow-red";
    }
    public void show()
    {
        System.out.println("Name is : "+name);
        System.out.println("Color is : "+color);
    }

}
class Two_velar extends Bike
{

}

public class Simple_Inheritance {
    public static void main(String[] args) {
        Two_velar t1 = new Two_velar();
        t1.show();
    }
}
