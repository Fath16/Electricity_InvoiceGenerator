package Electricity_InvoiceGenerator;

public class Staff extends User {
    public Staff(String username, String password) {
        super(username, password);
    }

    @Override
    public String getUserType() {
        return "Staff";
    }
}
