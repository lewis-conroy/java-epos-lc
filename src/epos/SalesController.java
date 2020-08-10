/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epos;

import static epos.UserController.con;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lewis
 */
public class SalesController extends Controller {
    
    public SalesController()
    {
        // constructor calls the getConnection super method.
        con = super.getConnection();
    }
    
    public static double retrieveTotal(String username)
    {
        // retrieves the total of a user's transactions.
        
        double total = 0.0;
        try
        {
            // selects every record submitted by a specific user.
            Statement myStatement = con.createStatement();
            ResultSet rs = myStatement.executeQuery("SELECT * FROM Sales WHERE Username='" + username + "'");
            
            total = 0.0;
            while (rs.next())
            {
                // adds up the total of all transactions.
                String stringVal = rs.getString("Sale");
                total += Double.parseDouble(stringVal);
            }
        }
        catch (SQLException e)
        {
            System.out.println("in retrieveTotal(): " + e);
        }
        return total;
    }
    
    public static void submitSale(User user, double total)
    {
        // inserts a sale to the sales table.
        
        try
        {
            // inserts sale
            Statement myStatement = con.createStatement();
            myStatement.executeUpdate("INSERT INTO Sales"
                + "(Username, Sale) "
                + " VALUES ('" + user.getUsername() + "', '" + String.valueOf(total) + "')");
        }
        catch (SQLException e)
        {
            System.out.println("in submitSale(): " + e);
        }
    }
    
    public static void resetSystem()
    {
        // deletes every record in sales table.
        try
        {
            // deletes everything.
            Statement myStatement = con.createStatement();
            myStatement.executeUpdate("DELETE * FROM Sales");
        }
        catch (SQLException e)
        {
            System.out.println("in resetSystem(): " + e);
        }
    }
}
