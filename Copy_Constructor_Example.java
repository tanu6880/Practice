package org.example.practice;

class SchoolData
{
    private String name;
    private int standard;
    private long roll;

    public SchoolData(String name ,int standard,long roll)
    {
        this.name = name;
        this.standard = standard;
        this.roll = roll;
    }

    public SchoolData(SchoolData Schooldata)
    {
        name = Schooldata.name;
        standard = Schooldata.standard;
        roll = Schooldata.roll;
    }

    public String GetName()
    {
        return name;
    }

    public  int GetStandard()
    {
        return standard;
    }

    public long GetRoll()
    {
        return roll;
    }



}
public class Copy_Constructor_Example {

    public static void main(String []args)
    {
        SchoolData s1 = new SchoolData("Tanu",12,10000001);
        SchoolData s2 = new SchoolData(s1);
        System.out.println("Name is : "+s2.GetName());
        System.out.println("class is : "+s2.GetStandard());
        System.out.println("Roll number is : "+s2.GetRoll());
    }
}
