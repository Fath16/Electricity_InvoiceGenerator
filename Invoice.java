package Electricity_InvoiceGenerator;

// Invoice class to represent an invoice
public class Invoice {
    private String clientUsername;
    private double totalAmount;

    // Constructor for Invoice
    public Invoice(String clientUsername, double totalAmount) {
        this.clientUsername = clientUsername;
        this.totalAmount = totalAmount;
    }

    // Getter methods for Invoice
    public String getClientUsername() {
        return clientUsername;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    // Override toString() to represent invoice information as a string
    @Override
    public String toString() {
        return "Client: " + clientUsername + ", Total Amount: $" + totalAmount;
    }
}

