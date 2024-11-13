// TestBank.java
public class TestBank {
    public static void main(String[] args) {
        // Create an instance of ICICI and calculate its transaction charge
        Bank iciciBank = new ICICI();
        System.out.println("ICICI Transaction Charge: " + iciciBank.calculateTransactionCharge());

        // Create an instance of HDFC and calculate its transaction charge
        Bank hdfcBank = new HDFC();
        System.out.println("HDFC Transaction Charge: " + hdfcBank.calculateTransactionCharge());
    }
}
