package Electricity_InvoiceGenerator;

// Staff class inherits from User
public class Staff extends User {
    public Staff(String username, String password) {
        super(username, password);    
    }

    // Override the abstract method from the User class to specify the user type as "Staff"
    @Override
    public String getUserType() {
        return "Staff";
    }
}
