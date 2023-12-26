package Electricity_InvoiceGenerator;

public class Client extends User {
    private String clientID;
    public Client(String clientID, String username, String password) {
        super(username, password);
        this.clientID = clientID;
    }
    public String getClientID() {
        return clientID;
    }

    @Override
    public String getUserType() {
        return "Client";
    }
}
