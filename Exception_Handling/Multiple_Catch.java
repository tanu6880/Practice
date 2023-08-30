package Exception_Handling;

public class Multiple_Catch {
    public static void main(String[] args) {
        try
        {
            //int data = 50/0; //ArithmeticException
            String s = "abc";
            int i = Integer.parseInt(s); // Numberformatexception
            int a[] = new int[5];
            a[10] = 100; //ArrayIndexoutofBoundation
            int arr[] = new int[-5]; //Negativearraysizeexception
            String std = null;
            int l = std.length(); // NullpointerException

        }
        catch(ArithmeticException e)
        {
            System.out.println("rest of the code.....handle arithmetic exception");
        }
        catch(NumberFormatException E)
        {
            System.out.println("rest of the code....handle number format exception");
        }
        catch(IndexOutOfBoundsException ae)
        {
            System.out.println("rest of the code...Index out of bounds exception");
        }
        catch(NegativeArraySizeException qa)
        {
            System.out.println("rest of the code..Negative Array size Exception");
        }
        catch(NullPointerException s)
        {
            System.out.println("rest of the code...null pointer exception");
        }
        catch(Exception e)
        {
            System.out.println("parant handler");
        }
    }
}
