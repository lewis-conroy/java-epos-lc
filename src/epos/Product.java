package epos;

// Product object for passing information
// to the product / sales controllers.

public class Product {
    private String name = "n/a";
    private String image = "n/a";
    private String price = "n/a";
    private String ID = "n/a";

    public void setName(String text) { name = text; }
    public void setImage(String text) { image = text; }
    public void setID(String text) { ID = text; }
    public void setPrice(String text) { price = text; }
    
    public String getName() { return name; }
    public String getImage() { return image; }
    public String getID() { return ID; }
    public String getPrice() { return price; }
}
