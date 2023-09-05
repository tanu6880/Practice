package Exception_Handling;

import org.testng.annotations.Test;

public class Nested_try_catch_block {
    public static void main(String[] args) {

        try
        {
            try
            {
                String s = "abc";
                int i = s.length();
            }
            catch(NumberFormatException a)
            {
                System.out.println(a);
            }
            try
            {
                int arr[] = new int[10];
                arr[10] = 100;
            }
            catch(ArithmeticException a)
            {
                System.out.println(a);
            }
        }
        catch(Exception ae)
        {
            System.out.println("Handled");
        }
        finally {
            System.out.println("always execute......!");
        }
        System.out.println("Normal flow exception handle by try catch block");
    }
}
