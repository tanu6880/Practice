package org.example.practice;

class tannu
{
    int x;
    public void show()
    {
        System.out.println("THis is came from tannu class");
    }
    tannu(int x)
    {
        this.x = x;
    }
}
class lavisha extends tannu
{
    int y;
     lavisha(int x,int y)
     {
         super(x);
         this.y=y;
     }
     public void show()
     {
         System.out.println("THis is came from lavisha class");
         System.out.println("X is : "+x+" y is "+y);
         super.show();
     }
}
public class Super_example {
    public static void main(String[] args) {
        lavisha l = new lavisha(13,45);
        l.show();
    }
}
