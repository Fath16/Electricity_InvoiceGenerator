package Electricity_InvoiceGenerator;

// Client class inherits from User
public class Client extends User {
    private String clientID;

    // Constructor for Client
    public Client(String clientID, String username, String password) {
        super(username, password);
        this.clientID = clientID;
    }

    // Getter method for clientID
    public String getClientID() {
        return clientID;
    }

    // Override the abstract method from the User class to specify the user type as "Client"
    @Override
    public String getUserType() {
        return "Client";
    }

    // Demonstrate method overloading
    public void printUserInfo() {
        System.out.println("Client Information: " + toString());
    }

    // Demonstrate method overriding
    @Override
    public String toString() {
        return super.toString() + ", ClientID: " + clientID;
    }
}
