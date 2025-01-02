package meaningfulnames;

public class PaymentAtGrocery {
    private double totalAmount;

    public PaymentAtGrocery() {
        this.totalAmount = 0.0;
    }

    public void addItem(double price, int quantity) {
        double itemTotal = price * quantity;
        this.totalAmount += itemTotal;
        System.out.println("Added item. Current total: $" + this.totalAmount);
    }

    public double getTotalAmount() {
        return this.totalAmount;
    }

    public static void main(String[] args) {
        PaymentAtGrocery groceryPayment = new PaymentAtGrocery();
        groceryPayment.addItem(2.5, 4); // Add 4 items, each costing $2.5
        groceryPayment.addItem(1.5, 6); // Add 6 items, each costing $1.5
        System.out.println("Final total: $" + groceryPayment.getTotalAmount());
    }
}

