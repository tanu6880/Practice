package CRUD_application;

public class All_query {
    static String Insert = "Insert into Student (roll,f_name,l_name,mob,email) values(?,?,?,?,?)";
    static String Update = "Update Student set f_name = ? where roll = ?";
    static String Delete = "Delete from Student where roll = ? ";
    static String select = "select * from Student";

}
