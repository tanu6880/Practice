package CRUD_application;

import java.util.LinkedList;

public class Student {

    private int roll;
    private String f_name ;
    private String l_name;
    private long mob;
    private String email;

    public Student(int roll, String f_name, String l_name, long mob, String email)
    {
        this.roll = roll;
        this.f_name = f_name;
        this.l_name = l_name;
        this.mob = mob;
        this.email = email;
    }

    public int getRoll() {
        return roll;
    }

    public long getMob() {
        return mob;
    }

    public String getEmail() {
        return email;
    }

    public String getF_name() {
        return f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public String getmessage()
    {
        return "roll-> "+roll+" f_name-> "+f_name+" l_name-> "+l_name+" mob-> "+mob+" email->"+email;

    }
}
