package org.example.practice;

class Employee
{
    private String name;
    private double salary;
    private String email;
    private String address;
    private int age;

    public Employee(String name,double salary,String email,String address,int age)
    {
        this.name = name;
        this.salary = salary;
        this.email = email;
        this.address = address;
        this.age = age;

    }
    public void ShowDetails()
    {
        System.out.println("Name Is : "+name);
        System.out.println("Salary Is : "+salary);
        System.out.println("Email Is : "+email);
        System.out.println("Location Is : "+address);
        System.out.println("Age Is : "+age);
        System.out.println();
    }
}
public class Parameterize_contructor_example {

    public static void main(String []args)
    {
        Employee E1 = new Employee("Tanu1",150000,"t1@gmail.com","pune",21);
        Employee E2 = new Employee("Tanu2",150000,"t2@gmail.com","pune",21);
        Employee E3 = new Employee("Tanu3",150000,"t3@gmail.com","pune",21);
        Employee E4 = new Employee("Tanu4",150000,"t4@gmail.com","pune",21);

        E1.ShowDetails();
        E2.ShowDetails();
        E3.ShowDetails();
        E4.ShowDetails();

    }

}
