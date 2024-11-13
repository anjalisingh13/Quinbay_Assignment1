// ICICI.java
public class ICICI extends Bank {

    // Override to calculate ICICI specific transaction charge
    @Override
    public double calculateTransactionCharge() {
        // Assuming ICICI adds an additional 5% charge on the base charge
        return getDefaultTransactionCharge() * 1.05;
    }
}
