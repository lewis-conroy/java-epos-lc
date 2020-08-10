package epos;

import java.util.ArrayList;

// Keeps track of the EPOS session.
// holds statistics in order to checkout
// and create a user report.

public class Epos {
    private static int customersServed = 0;
    private static double averageSale = 0.00;
    private static double minimumSale = 0.00;
    private static double maximumSale = 0.00;
    private static double totalTakings = 0.00;
    
    public static ArrayList<Double> transactionList = new ArrayList<>();
    public static ArrayList<Double> priceList = new ArrayList<>();
    public static ArrayList<Double> checkoutList = new ArrayList<>();
    
    // Convenience method
    public static void incrementCustomersServed() { customersServed++; }
    
    public static void setCustomersServed(int num) { customersServed = num; }
    public static void setAverageSale(double num) { averageSale = num; }
    public static void setMinimumSale(double num) { minimumSale = num; }
    public static void setMaximumSale(double num) { maximumSale = num; }
    public static void setTotalTakings(double num) { totalTakings = num; }
    
    public int getCustomersServed() { return customersServed; }
    public double getAverageSale() { return averageSale; }
    public double getMinimumSale() { return minimumSale; }
    public double getMaximumSale() { return maximumSale; }
    public double getTotalTakings() { return totalTakings; }

}
