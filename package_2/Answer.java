package package_2;
import package_2.CustomException.InvalidObtainedMarksException;

import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        try
        {
            Scanner kb = new Scanner(System.in);
            int marks[] = new int[5];
            int totalmarks = 500;
            int obtainedmarks = 0;
            for(int i=0 ; i<5 ;i++)
            {
                System.out.println("Enter the "+i+1+" Marks : ");
                marks[i] = kb.nextInt();
                if(marks[i]>100 || marks[i]<0)
                {
                    throw new InvalidObtainedMarksException("Invalid");
                }
                else
                {
                    obtainedmarks += marks[i];
                }
            }
            double percentage = (obtainedmarks*100/totalmarks);
            System.out.println("Your percentage is : "+percentage);
        }
        catch(InvalidObtainedMarksException e)
        {
            System.out.println("Marks is Invalid .... !");
        }
    }
}
