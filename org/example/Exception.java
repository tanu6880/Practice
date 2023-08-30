package org.example;

public class Exception {
    public static void main(String[] args) {
        try
        {
            int data = 50/0;
            System.out.println("System rest of the code insise try");
        }
        catch(ArithmeticException e)
        {
            System.out.println("System rest of the code");
        }
    }
}
