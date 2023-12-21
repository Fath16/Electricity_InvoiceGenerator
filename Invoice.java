package Electricity_InvoiceGenerator;

public class Invoice {
    private String clientUsername;
    private double totalAmount;

    public Invoice(String clientUsername, double totalAmount) {
        this.clientUsername = clientUsername;
        this.totalAmount = totalAmount;
    }

    public String getClientUsername() {
        return clientUsername;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public String toString() {
        return "Client: " + clientUsername + ", Total Amount: $" + totalAmount;
    }
}
