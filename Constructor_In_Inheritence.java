package org.example.practice;

class A
{
    A()
    {
        System.out.println("Message of class A");
    }
}
class B extends A
{
    B()
    {
        System.out.println("Message of class B");
    }
}
class C extends B
{
    C()
    {
        System.out.println("Message of class C");
    }
}
class D extends C
{
    D()
    {
        System.out.println("Message of class D");
    }
}
public class Constructor_In_Inheritence {
    public static void main(String[] args) {

        D obj = new D();
    }
}
