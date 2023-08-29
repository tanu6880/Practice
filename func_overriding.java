package org.example.practice;

class pen1
{
    static int sr;
    void show()
    {
        sr ++;
        System.out.println("serial number : "+sr);
        System.out.println("pen 1 class function");
    }
}
class pen2 extends pen1
{
    void show()
    {
        sr ++;
        System.out.println("serial number : "+sr);
        System.out.println("pen 2 class function");
    }
}

public class func_overriding {
    public static void main(String[] args) {

        pen2 p1 = new pen2();
        p1.show();
        pen1 p2 = new pen1();
        p2.show();
        pen2 p3 = new pen2();
        p1.show();
        pen1 p4 = new pen1();
        p2.show();
    }
}
