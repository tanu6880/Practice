package CRUD_application;

import org.testng.annotations.Test;

import java.beans.PropertyEditorSupport;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class function_work {


    public static void create(Student s) throws SQLException
    {
        Connection con = DB_conn.connect();
        String query = All_query.Insert;
        PreparedStatement preparedStatement = con.prepareStatement(query);
        preparedStatement.setInt(1,s.getRoll());
        preparedStatement.setString(2,s.getF_name());
        preparedStatement.setString(3,s.getL_name());
        preparedStatement.setLong(4,s.getMob());
        preparedStatement.setString(5,s.getEmail());

        System.out.println("\n ps = "+preparedStatement+"\n"+s.getmessage());
        preparedStatement.execute();
        preparedStatement.close();

    }

    public static LinkedList<Student> read() throws SQLException
    {
        LinkedList<Student> std = new LinkedList<Student>();
        Connection con = DB_conn.connect();
        String query = All_query.select;
        PreparedStatement preparedStatement = con.prepareStatement(query);
        ResultSet result = preparedStatement.executeQuery();
        System.out.println("Roll      f_name         l_name           mob           email ");
        while(result.next())
        {
            Student st = new Student(result.getInt("roll"),result.getString("f_name"),result.getString("l_name"),result.getLong("mob"),result.getString("email"));
            std.add(st);
        }

        preparedStatement.close();
        return std;
    }

    public static void update(int roll, String name) throws SQLException
    {
        Connection con = DB_conn.connect();
        String query = All_query.Update;
        PreparedStatement preparedStatement = con.prepareStatement(query);
        preparedStatement.setString(1,name);
        preparedStatement.setInt(2,roll);
        preparedStatement.executeUpdate();

        System.out.println("Succusfully updated ...! ");
    }
    public static void delete(int roll) throws SQLException
    {
        Connection con = DB_conn.connect();
        String query = All_query.Delete;
        PreparedStatement preparedStatement = con.prepareStatement(query);
        preparedStatement.setInt(1,roll);
        preparedStatement.executeUpdate();

        System.out.println("Succusfully deleted...! ");
    }

}
