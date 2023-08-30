package Exception_Handling;

public class Try_catch_example {
    public static void main(String[] args) {
        try
        {
            int data = 50/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Rest of the code");
        }
    }
}
