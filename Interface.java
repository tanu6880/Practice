package org.example.practice;

interface print
{
    void show();
}
class A4 implements print
{
    public void show()
    {
        System.out.println("Hello Guys");
    }
}
public class Interface {
    public static void main(String[] args) {
        A4 obj = new A4();
        obj.show();
    }
}
