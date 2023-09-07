package JDBC_Connection;

import java.sql.*;

public class DB_Connect {

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
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return conn;
    }

}
