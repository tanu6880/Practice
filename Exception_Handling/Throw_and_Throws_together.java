package Exception_Handling;

import java.util.Scanner;

public class Throw_and_Throws_together {

    static void getlength() throws Exception
    {
        System.out.println("How much element do you want to create ; ");
        Scanner kb = new Scanner(System.in);
        int l = kb.nextInt();
        if(l<=0)
        {
            throw new Exception("can not be negative");
        }
        else
        {
            int arr[] = new int[l];
            System.out.println("your choice is very good....happy coding ! ");
            //System.out.println(arr[l]); check kar rhi thi main code ka try catch kam kar rha hai ya nhi
        }

    }

    public static void main(String[] args) {
        // agar thows ka matlb bhi nhi samja to tum try block hatana fir jisse tumhe yha error dikhega jisse pta clag jayga ki ki yh error isi ki vjh se aa rhi hai
        try
        {
            getlength();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Kam ho gya ...! ");
    }

}
