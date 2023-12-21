package Electricity_InvoiceGenerator;

public class Client extends User {
    public Client(String username, String password) {
        super(username, password);
    }

    @Override
    public String getUserType() {
        return "Client";
    }
}
