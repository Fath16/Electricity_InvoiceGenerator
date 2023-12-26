package Electricity_InvoiceGenerator;

// Abstract class 
public abstract class User {
    private String username;
    private String password;

    // Constructor 
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter methods 
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // Override toString() to represent user information as a string
    @Override
    public String toString() {
        return "Username: " + username;
    }

    // Override equals() and hashCode() for proper object comparison and hashing
    @Override
    public boolean equals(Object obj) {
        if (this == obj) // Check if the objects are the same
            return true;
        if (obj == null || getClass() != obj.getClass()) // Check class equality
            return false;
        User user = (User) obj;
        return username.equals(user.username); // Compare usernames for equality
    }

    @Override
    public int hashCode() {
        return username.hashCode(); 
    }

    // Abstract method to retrieve the type of user (to be implemented by subclasses)
    public abstract String getUserType();
}
