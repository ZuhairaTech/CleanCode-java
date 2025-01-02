package exercises;

public class GroceryPayment {
    private double m_dsc;

    public GroceryPayment() {
        m_dsc = 0;
    }

    public void a(double p, int q) {
        double x = p * q;
        m_dsc = m_dsc + x;
        System.out.println("Added stuff. Total now: " + m_dsc);
    }

    public double getDsc() {
        return m_dsc;
    }

    public static void main(String[] args) {
        GroceryPayment gPay = new GroceryPayment();
        gPay.a(2.5, 4); // Add 4 items at $2.5 each
        gPay.a(1.5, 6); // Add 6 items at $1.5 each
        System.out.println("Final amount: " + gPay.getDsc());
    }
}
