package org.example.practice;

class Base
{
    int x;
    Base(int x)
    {
        this.x = x;
    }
}
class derived extends Base
{
    int y;
    derived(int x,int y)
    {
        super(x);
        this.y = y;
    }
    void print()
    {
        System.out.println("X " + x +", Y "+y);
    }

}
public class parameterized_cons_inheritence {
    public static void main(String[] args) {
        derived d1 = new derived(2,3);
        d1.print();
    }

}
