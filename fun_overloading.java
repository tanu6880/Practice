package org.example.practice;

class demo_func_overloading
{
    static void func(int a,int b)
    {
        System.out.println(a+b);
    }
    static void func(double a , double b)
    {
        System.out.println(a+b);
    }
    static void func(char a , char b)
    {
        System.out.println(a + " " + b);
    }
    static void func(double a , double b,double c)
    {
        System.out.println(a+b+c);
    }
    static void func(int a , double b)
    {
        System.out.println(a+b);
    }
    static void func(double a , int b)
    {
        System.out.println(a+b);
    }
    /*static int func(double a , int b)---error return type
    {
        return a+b;
    }*/

}
public class fun_overloading {
    public static void main(String[] args) {
        demo_func_overloading.func(12,14);
        demo_func_overloading.func(2.3,2.5);
        demo_func_overloading.func('t','s');
        demo_func_overloading.func(2.3,2.5,6.7);
        demo_func_overloading.func(2,2.5);
        demo_func_overloading.func(2.3,2);
    }
}
