package Exception_Handling;
public class Throw_example_for_cheked_compile_time
{
    public static void main(String[] args)
    {
         valid(13);
    }
    public static void valid(int age)
    {
        // isme yha try catch lagana hi pdega handle ke kiye kyoki chekhed ke liye ham throws abhi use nhi karna chate to hame is epahel hi handle karna pdega verna yh error hai program me
        if (age < 18)
        {
           try
           {
               throw new Exception("not valid");
           }
           catch(Exception e)
           {
               System.out.println("Caught exception in throwExceptionFunction: " + e.getMessage());
           }
        } else {
            System.out.println("Valid for voting");
        }
    }
}
