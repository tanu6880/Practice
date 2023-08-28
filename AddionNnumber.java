package org.example.practice;

import java.util.Scanner;

public class AddionNnumber {
    public static void main(String []args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter N Number : ");
        int num = kb.nextInt();
        int sum = 0;

        for ( int i = 0 ; i < num ; i++)
        {
            System.out.print("Enter " + (i+1) + " Number : ");
            int n = kb.nextInt();
            sum += n;
        }

        System.out.println("Sum of N number : " + sum);
    }
}
