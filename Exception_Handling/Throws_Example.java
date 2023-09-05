package Exception_Handling;

import org.testng.annotations.Test;

public class Throws_Example {
    @Test
    static int GetNum(String std) throws NumberFormatException//yh throws bt rha hai ki hame ise handle karna hai
    {
        int l = Integer.parseInt(std);
        return l;
    }

    public static void main(String[] args) {

       try
       {
           System.out.println(GetNum("123"));
       }
       catch(NumberFormatException e)
       {
           System.out.println(e.getMessage());
       }
       System.out.println("kam Huaa");
    }
}
