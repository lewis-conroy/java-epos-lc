package epos;

// User class holds the information about
// the user currently logged into the
// system.

public class User {
    private static String firstName = "";
    private static String secondName = "";
    private static String username = "";
    private static String password = "";
    private static String permission = "";
    private static String ID = "";
    
    public static void setFirstName(String text) { firstName = text; }
    public static void setSecondName(String text) { secondName = text; }
    public static void setUsername(String text) { username = text; }
    public static void setPassword(String text) { password = text; }
    public static void setPermission(String text) { permission = text; }
    public static void setID(String text) { ID = text; }
    
    public String getFirstName() { return firstName; }
    public String getSecondName() { return secondName; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getPermission() { return permission; }
    public String getID() { return ID; }
}
