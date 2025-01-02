package meaningfulnames;

/**
 * A simple class to handle grocery payments by calculating 
 * the total amount based on the price and quantity of items.
 * 
 * <p>This example demonstrates clean coding principles, 
 * including the use of meaningful names for variables, methods, 
 * and classes.</p>
 * 
 * @author Zuhaira Zakaria (ZuhairaTech)
 * @since 2025-01-02
 */

public class GroceryPayment {
	/**
     * The running total amount for all grocery items.
     */
    private double totalAmount;

    /**
     * Initializes a new GroceryPayment instance with a total amount of 0.0.
     */
    public GroceryPayment() {
        this.totalAmount = 0.0; //this.
    }

    /**
     * Adds an item to the total by calculating its cost.
     * 
     * @param price   The price of a single item.
     * @param quantity The number of items being purchased.
     */
    public void addItem(double price, int quantity) {
        double itemTotal = price * quantity;
        this.totalAmount += itemTotal; //this. and +=
        System.out.println("Added item. Current total: $" + this.totalAmount);
    }

    /**
     * Retrieves the total amount of all items added.
     * 
     * @return The total amount as a double.
     */
    public double getTotalAmount() {
        return this.totalAmount;
    }

    /**
     * The main method to demonstrate the functionality of the GroceryPayment class.
     * 
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
    	GroceryPayment groceryPayment = new GroceryPayment(); // gPay -> groceryPayment (optional)
        groceryPayment.addItem(2.5, 4); // Add 4 items, each costing $2.5
        groceryPayment.addItem(1.5, 6); // Add 6 items, each costing $1.5
        System.out.println("Final total: $" + groceryPayment.getTotalAmount());
    }
}

