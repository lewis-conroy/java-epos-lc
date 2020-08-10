package epos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public final class UserController extends Controller {
    public static Connection con;
    
    public UserController()
    {
        // calls getConnection() from Controller superclass.
        con = super.getConnection();
    }

    public static ArrayList<String> retrieveUsernames()
    {
        // returns a list of every username.
        
        ArrayList<String> usernames = new ArrayList<>();
        
        try
        {
            // selects every record.
            Statement myStatement = con.createStatement();
            ResultSet rs = myStatement.executeQuery("SELECT * FROM Users");
            
            while (rs.next())
            {
                // adds each username to a list
                String username = rs.getString("Username");
                usernames.add(username);
            }
        }
        catch (SQLException e)
        {
            System.out.println("in retrieveUsers(): " + e);
        }
        return usernames;
    }
    
    public static String login(String username, String password)
    {
        // determines if the username exists in the database and compares their password.
        // if the password is correct, it returns the permission level of the user.
        
        String login = "incorrect"; //default login value for failed attempt.
        try
        {
            // selects the relevant user.
            Statement myStatement = con.createStatement();
            ResultSet rs = myStatement.executeQuery("SELECT * FROM Users WHERE Username='" + username + "'");
            rs.next();
            
            String databasePassword = rs.getString("Password");
            
            // checks to see if the password is correct.
            if (databasePassword.equals(password))
            {
                // sets login to the permission level.
                login = rs.getString("Permission");
                System.out.println("logged in: " + login);
            }
        }
        catch (SQLException e)
        {
            System.out.println("in login(): " + e);
        }
        // returns permission level.
        return login;
    }
    
    public static User retrieveDetails(String username)
    {
        // returns a user object of user information.
        
        // creates a new user object to be returned.
        User user = new User();
        try
        {
            // selects a specific user.
            Statement myStatement = con.createStatement();
            ResultSet rs = myStatement.executeQuery("SELECT * FROM Users WHERE Username='" + username + "'");
            rs.next();
            // sets the new user's fields.
            User.setFirstName(rs.getString("FirstName"));
            User.setSecondName(rs.getString("SecondName"));
            User.setUsername(rs.getString("Username"));
            User.setPassword(rs.getString("Password"));
            User.setPermission(rs.getString("Permission"));
            User.setID(rs.getString("ID"));
        }
        catch (SQLException e)
        {
            System.out.println("in retrieveDetails(): " + e);
        }
        return user;
    }
    
    public static void insertUser(User user)
    {
        // inserts a new user into the system.
        try
        {
            Statement myStatement = con.createStatement();
        
            // gets the user information to be inserted.
            String firstName = user.getFirstName();
            String secondName = user.getSecondName();
            String username = user.getUsername();
            String password = user.getPassword();
            String permission = user.getPermission();
            
            // checks that the user doesn't exist already.
            ResultSet rs = myStatement.executeQuery("SELECT * FROM Users WHERE Username='" + firstName + "'");
            if (rs.next())
            {
                // throws error if user exists to prevent duplicate users.
                throw new Error();
            }
            
            // inserts the user into the users table.
            myStatement.executeUpdate("INSERT INTO Users"
                    + " (FirstName, SecondName, Username, Password, Permission)"
                    + " VALUES ('" + firstName + "', '" + secondName + "', '" + username + "', '" + password + "', '" + permission + "')");
            
            JOptionPane.showMessageDialog(null, "User Added.");
        }
        catch (SQLException e)
        {
            System.out.println("in insertUser(): " + e);
        }
        catch (Error e)
        {
            JOptionPane.showMessageDialog(null, "Error: Username Already Exists.");
        }
    }
    
    public static void updateUser(String username, User user)
    {
        // alters the user's record based on their old username.
        
        // gets new information for the record.
        String firstName = user.getFirstName();
        String secondName = user.getSecondName();
        String newUsername = user.getUsername();
        String password = user.getPassword();
        String permission = user.getPermission();
        
        try
        {
            // inserts new information into the record based on its current username.
            Statement myStatement = con.createStatement();
            myStatement.executeUpdate("UPDATE Users SET "
                    + "FirstName='" + firstName
                    + "', SecondName='" + secondName
                    + "', Username='" + newUsername
                    + "', Password='" + password
                    + "', Permission='" + permission
                    + "' WHERE username='" + username + "'");
            
            JOptionPane.showMessageDialog(null, "User Updated.");
        }
        catch (SQLException e)
        {
            System.out.println("in updateUser(): " + e);
        }
    }
    
    public static void deleteUser(String username)
    {
        // removes a user from the database.
        
        try
        {
            // deletes a user based on their username.
            Statement myStatement = con.createStatement();
            myStatement.executeUpdate("DELETE * FROM Users WHERE Username='" + username + "'");
            
            JOptionPane.showMessageDialog(null, "User Deleted.");
        }
        catch (SQLException e)
        {
            System.out.println("in deleteUser(): " + e);
        }
    }
}
