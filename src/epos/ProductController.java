package epos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProductController extends Controller {
    private static Connection con;
    
    public ProductController()
    {
        con = super.getConnection();
    }
    
    public static Product retrieveDetails(String productName)
    {
        // Gets the information about a specific product.
        
        // creates a new product to return to view.
        Product queriedProduct = new Product();
        try
        {
            // queries database for product
            Statement myStatement = con.createStatement();
            ResultSet rs = myStatement.executeQuery("SELECT * FROM Products WHERE Product Name='" + productName + "'");
            rs.next();
            
            // sets product attributes.
            queriedProduct.setName(productName);
            queriedProduct.setImage(rs.getString("Image Path"));
            queriedProduct.setPrice(rs.getString("Price"));
            queriedProduct.setID(rs.getString("ID"));
        }
        catch (SQLException e)
        {
            System.out.println("in ProductController.retrieveDetails(): " + e);
        }
        // returns product to be used in view.
        return queriedProduct;
    }
    
    public static void insertProduct(Product product)
    {
        // inserts a new product to the products table.
        
        try
        {
            Statement myStatement = con.createStatement();
        
            String name = product.getName();
            String image = product.getImage();
            String price = product.getPrice();
            
            // executes sql query to ensure the product doesn't already exist.
            ResultSet rs = myStatement.executeQuery("SELECT * FROM Products WHERE ProductName='" + name + "'");
            // throws error if the product is already in the table.
            if (rs.next())
            {
                throw new Error();
            }
            
            // executes update if the product doesn't already exist.
            myStatement.executeUpdate("INSERT INTO Products"
                    + " (ProductName, Price, ImagePath)"
                    + " VALUES ('" + name + "', '" + price + "', '" + image + "')");
            
            // shows message to user.
            JOptionPane.showMessageDialog(null, "Product Added.");
        }
        catch (SQLException e)
        {
            System.out.println("in insertProduct(): " + e);
        }
        catch (Error e)
        {
            JOptionPane.showMessageDialog(null, "Error: Product Already Exists.");
        }
    }
    
    public static void deleteProduct(String name)
    {
        // removes product from products table.
        
        try
        {
            Statement myStatement = con.createStatement();
            // removes the product with the matching name.
            myStatement.executeUpdate("DELETE * FROM Products WHERE ProductName='" + name + "'");
            
            // shows message to user.
            JOptionPane.showMessageDialog(null, "Product Removed.");
        }
        catch(SQLException e)
        {
            System.out.println("in deleteProduct(): " + e);
        }
    }
    
    public static ArrayList<String> retrieveProductNames()
    {
        // retrieves the name of every product name and returns an arraylist.
        
        ArrayList<String> products = new ArrayList<>();
        
        try
        {
            // gets every product name.
            Statement myStatement = con.createStatement();
            ResultSet rs = myStatement.executeQuery("SELECT * FROM Products");
            
            while (rs.next())
            {
                // adds product name to list.
                products.add(rs.getString("ProductName"));
            }
        }
        catch (SQLException e)
        {
            System.out.println("in retrieveProductNames(): " + e);
        }
        // returns product name list.
        return products;
    }
    
    public static ArrayList<Product> retrieveProducts()
    {
        // returns an arraylist of every product object.
        
        ArrayList<Product> productList = new ArrayList<>();
        try
        {
            // selects every product.
            Statement myStatement = con.createStatement();
            ResultSet rs = myStatement.executeQuery("SELECT * FROM Products");
            
            while (rs.next())
            {
                // creates a product name, sets its attributes and adds it to the arraylist.
                Product nextProduct = new Product();
                nextProduct.setName(rs.getString("ProductName"));
                nextProduct.setImage(rs.getString("ImagePath"));
                nextProduct.setPrice(rs.getString("Price"));
                
                productList.add(nextProduct);
            }
        }
        catch (SQLException e)
        {
            System.out.println("in retrieveProducts(): " + e);
        }
        return productList;
    }
}
