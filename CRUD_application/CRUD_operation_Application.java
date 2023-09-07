package CRUD_application;

import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.Scanner;

public class CRUD_operation_Application {
    public static void main(String[] args) throws Exception{

        Scanner kb = new Scanner(System.in);
        char stop;
        do
        {
            System.out.println("Please select what do you want to choose : ");
            System.out.println("1. Create");
            System.out.println("2. Read");
            System.out.println("3. update");
            System.out.println("4. delete");

            System.out.print("Enter Your Choice : ");
            int choice = kb.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter Roll Number : ");
                    int roll = kb.nextInt();
                    System.out.print("Enter First Name  : ");
                    kb.nextLine();
                    String f_name = kb.nextLine();
                    System.out.print("Enter Last 1Name   : ");
                    String l_name = kb.nextLine();
                    System.out.print("Enter Mobile Num  : ");
                    long mob = kb.nextLong();
                    kb.nextLine();
                    System.out.print("Enter Email       : ");
                    String email = kb.nextLine();

                    Student s = new Student(roll,f_name,l_name,mob,email);
                    function_work.create(s);
                    break;
                case 2:
                    LinkedList<Student> std = function_work.read();
                    for (int i = 0; i < std.size(); i++) {
                        System.out.println(std.get(i).getmessage());
                    }
                    break;
                case 3:
                    System.out.print("Enter new Name : ");
                    kb.nextLine();
                    String name = kb.nextLine();
                    System.out.print("Enter roll number :");
                    int rol = kb.nextInt();
                    function_work.update(rol,name);
                    break;
                case 4:
                    System.out.print("Enter roll number :");
                    int sr = kb.nextInt();
                    function_work.delete(sr);
                    break;

                default:
                    System.out.println("please Enter valid option....!");

            }

            System.out.print(" If you want to Continue press 'y' or 'Y' otherwise please press any key : ");
            stop = kb.next().charAt(0);
        }
        while(stop == 'y' || stop == 'Y');


    }
}
