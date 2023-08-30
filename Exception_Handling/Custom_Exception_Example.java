package Exception_Handling;

import java.util.Scanner;

class NegativeSalaryException extends Exception
{
    public NegativeSalaryException(String msg)
    {
        super(msg);
    }
}
public class Custom_Exception_Example {
    public static void main(String[] args) throws NegativeSalaryException
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter Salary : ");
        int salary = kb.nextInt();
        if(salary<0)
        {
            try
            {
                throw new NegativeSalaryException("Salary can not be Negative ");
            }
            catch(NegativeSalaryException e)
            {
                System.out.println("Salary must not be Negative ");
            }
        }
        System.out.println("my Salary is : "+salary);


    }
}
