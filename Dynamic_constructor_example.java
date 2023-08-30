package org.example.practice;

class CustomOrder
{
    private int arr[];
    public int length=0;

    public CustomOrder(int n)
    {
        this.length=n;
        arr = new int[length];
    }
    public void print()
    {
        int num = 0;
        for(int i=0; i<length; i++)
        {
            arr[i] = num +10;
            System.out.print(arr[i]+" ");
            num = arr[i];
        }
    }
}

public class Dynamic_constructor_example {

    public static void main(String []args)
    {
        CustomOrder CO1 = new CustomOrder(5);
        CO1.print();
    }
}
