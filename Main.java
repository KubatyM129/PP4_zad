public class Main {
    public static void main(String[] args) {
        
        Receipt test = new Receipt();
        test.newPayment("Clean Code, Robert C. Martin", 100, 8);
        test.newPayment("Applying UML and Patterns, C. Larman", 300, 8);
        test.newPayment("Shipping", 50, 23);
        test.printReceipt();

    }
}
