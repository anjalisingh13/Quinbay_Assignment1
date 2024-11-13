// HDFC.java
public class HDFC extends Bank {

    // Override to calculate HDFC specific transaction charge
    @Override
    public double calculateTransactionCharge() {
        // Assuming HDFC adds an additional 7% charge on the base charge
        return getDefaultTransactionCharge() * 1.07;
    }
}
