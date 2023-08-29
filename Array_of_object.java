package org.example.practice;

import java.util.Scanner;

class Tanu
{
    String name;
    int age;

    public void input()
    {
        System.out.print("Name is : ");
        Scanner k = new Scanner(System.in);
        name = k.nextLine();
        System.out.print("age is : ");
        age = k.nextInt();
    }
    public void display()
    {
        System.out.println("Name is : "+name);
        System.out.println("age is : "+age+"\n");
    }
}

public class Array_of_object {
    public static void main(String[] args) {

        System.out.print("How many tanu want you create : ");
        Scanner kl = new Scanner(System.in);
        int l = kl.nextInt();

        Tanu arr[] = new Tanu[l];
        for(int i=0;i<l;i++)
        {
            arr[i] = new Tanu();
            arr[i].input();
        }
        for(int i=0 ;i<l;i++)
        {
            arr[i].display();
        }
    }
}
