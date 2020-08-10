package epos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Superclass for controllers as they both require the getConenction() method.

public class Controller {
    public static Connection getConnection()
    {
        // Connects to database.
        
        Connection con = null;
        try
        {
            con = DriverManager.getConnection("jdbc:ucanaccess://Data\\Data.accdb");
        }
        catch (SQLException e)
        {
            System.out.println("in getConnection(): " + e);
        }
        return con;
    }
}
