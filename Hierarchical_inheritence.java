package org.example.practice;

class Laptop
{
    String name;
    String size;
    int ram;
    boolean ssd;

    void show()
    {
        System.out.println("Name is : "+name);
        System.out.println("Size is : "+size);
        System.out.println("SSD is : "+ssd);
        System.out.println("RAM is : "+ram);
        System.out.println();
    }
}
class HP extends Laptop
{
    public HP(String name,String size,int ram,boolean ssd)
    {
        this.name = name;
        this.size = size;
        this.ram = ram;
        this.ssd = ssd;
    }
}
class Lanovo extends Laptop
{
    public Lanovo(String name,String size,int ram,boolean ssd)
    {
        this.name = name;
        this.size = size;
        this.ram = ram;
        this.ssd = ssd;
    }
}
class Apple extends Laptop
{
    public Apple(String name,String size,int ram,boolean ssd)
    {
        this.name = name;
        this.size = size;
        this.ram = ram;
        this.ssd = ssd;
    }
}
public class Hierarchical_inheritence {
    public static void main(String[] args) {

        HP h1 = new HP("HP LAPTOP","23*34",32,true);
        h1.show();
        Lanovo L1 = new Lanovo("Lanovo LAPTOP","23*34",32,true);
        L1.show();
        Apple A1 = new Apple("apple","23*34",32,true);
        A1.show();
    }

}
