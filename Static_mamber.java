package org.example.practice;

class Student
{
    String name;
    int age;
    static int roll=100;
    static int count ;

    Student(String name,int age)
    {
        this.name = name;
        this.age = age;
        count ++;
        roll ++;
    }
    void display()
    {
        System.out.println("Name is : "+name);
        System.out.println("Age is : "+age);
    }
    static void printdetails()
    {
        System.out.println("roll is : "+roll);
    }
}

public class Static_mamber
{

    public static void main(String []args)
    {
        Student s1 = new Student("Tanu",21);
        s1.display();
        // Student.dispay(); --error
        Student.printdetails();
        System.out.println(Student.count);
        Student s2 = new Student("Tanishka",21);
        s2.display();
        Student.printdetails();
        System.out.println(Student.count);

    }

}
