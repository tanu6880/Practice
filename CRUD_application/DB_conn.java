package CRUD_application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_conn {
    static Connection conn = null;

    public static Connection connect()
    {
        try
        {
            String url = "jdbc:postgresql://localhost:5432/Tanu";
            String username = "postgres";
            String password = "1030";
            conn = DriverManager.getConnection(url,username,password);
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return conn;
    }

}
