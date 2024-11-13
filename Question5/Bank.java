// Bank.java
public class Bank {
    // Default transaction charge
    protected double defaultTransactionCharge = 10.0;

    // Method to get default transaction charge
    public double getDefaultTransactionCharge() {
        return defaultTransactionCharge;
    }

    // Method to calculate transaction charges (to be overridden in subclasses)
    public double calculateTransactionCharge() {
        return defaultTransactionCharge;
    }
}
