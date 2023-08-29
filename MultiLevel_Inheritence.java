package org.example.practice;

class Google_Product
{
    void fun1()
    {
        System.out.println("I am fun1 in Google_product ");
    }

}
class Amazon_product extends Google_Product
{
    void fun2()
    {
        System.out.println("I am fun2 in Amazon_product");
    }
}
class other_company_product extends Amazon_product
{
    void fun3()
    {
        System.out.println("I am fun3 in other_company_product ");
    }
}
public class MultiLevel_Inheritence {
    public static void main(String[] args) {
        other_company_product product1 = new other_company_product();
        product1.fun1();
        product1.fun2();
        product1.fun3();
    }
}
