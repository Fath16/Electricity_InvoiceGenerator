# Electricity_InvoiceGenerator
**Introduction** <br>
 Our purpose of an Electricity Invoice Generator is to facilitate the calculation of total invoice amounts, save invoices to a file, view invoices, view invoice history and generation of invoices for electricity consumption. This system automates the process of computing the total amount owed based on the amount of electricity used by a client.

## Table of Contents
- [Features](#features)
- [Classes and Objects](#classes-and-objects)
- [Inheritance](#inheritance)
- [Polymorphism](#polymorphism)
- [Encapsulation](#encapsulation)
- [Abstraction](#abstraction)
- [Exception Handling](#exception-handling)
- [File I/O](#file-io)
- [Anonymous Inner Class / Functional Interface / Lambda Expression](#anonymous-inner-class--functional-interface--lambda-expression)
- Static methods(#static-methods)

### Features
**1. Authentication**<br/>
- Log in
- Register

**2. Staff Operations**<br/>
- Generate Invoice
- View Invoice History<br/>

**3. Client Operations**<br/>
- View Invoice<br/>


### Classes and Objects
The project includes several classes:
- Authentication: Manages user login and registration.
- Client: Represents clients with specific identifiers and authentication.
- Invoice: Stores invoice information, including client details and total amount.
- InvoiceGeneratorSystem: Main class orchestrating the system's functionality.
- Staff: Represents staff members with authentication credentials.
- User: Abstract class serving as a base for Staff and Client classes.


### Inheritance 
**Superclass and Subclass**
In the ElectricityInvoiceGenerator code, inheritance is demonstrated through the User, Staff, and Client classes. User serves as the superclass, and Staff and Client are subclasses inheriting  from User. 

    public class Staff extends User {
        public Staff(String username, String password) {
            super(username, password);
        }
        @Override
        public String getUserType() {
            return "Staff";
        }
    }
Staff inherits the properties and methods of the User class and provides its implementation of the getUserType method.

**Constructor**
In the User class, a parameterized constructor is defined:

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
This constructor initializes the username and password fields when a User object is created. The Staff and Client classes use constructor chaining by invoking the superclass constructor using super(username, password);.


### Polymorphism 
**Method Overriding**
- In the ElectricityInvoiceGenerator code, method overloading is demonstrated in the calculateTotalAmount method:

      private double calculateTotalAmount(double consumption) {
          double ratePerKWh = 0.10;
          return consumption * ratePerKWh;
      }
      
      private double calculateTotalAmount(double consumption, double discount) {
          double ratePerKWh = 0.10;
          return (consumption * ratePerKWh) - discount;
      }
  This indicates the calculateTotalAmount method is overloaded to accommodate an additional discount parameter, providing flexibility for different scenarios.
- In the User class, the toString method is overridden in the Client class:

      public class User {
          
          @Override
          public String toString() {
              return "User: " + username;
          }
      }
- In the Client class:

      public class Client extends User {
      
          @Override
          public String toString() {
              return super.toString() + ", ClientID: " + clientID;
          }
      }
  This demonstrates polymorphism through method overriding, allowing each subclass to provide its implementation of the toString method.

### Encapsulation 
**Access Modifiers**
- Public: Public access modifiers are used for methods that need to be accessed from any other class or package. For example, the getUsername method in the User class:
  
      public String getUsername() {
       return username;
      }

- Private: Private access modifiers are applied to fields and methods that should only be accessible within the same class. For example, in the Invoice class:

      private String clientUsername;
      private double totalAmount;
      
      private void saveInvoiceToFile(Invoice invoice) {
       
      }
### Abstraction 
- Abstract Class (User):
  The class User is declared as an abstract class, which means it cannot be instantiated on its own. It serves as a base class for more specific user types like Staff and Client. The User class   contains abstract methods, and it also provides a common structure for its subclasses:

      public static abstract class User {
          private String username;
          private String password;
      
          // Abstract method
          public abstract String getUserType();
      
      }
   Abstract Method (getUserType): The method getUserType is declared as abstract in the User class. This method is meant to be implemented by its subclasses (Staff and Client). Abstract methods    do not have an implementation in the abstract class and must be overridden by concrete subclasses.
- Overriding Abstract Method (getUserType in Staff and Client):
  Both Staff and Client classes, which are subclasses of User, provide their own implementations for the abstract method getUserType:
  
      public class Staff extends User {
      
          @Override
          public String getUserType() {
              return "Staff";
          }
      }
  
      public class Staff extends User {
      
          @Override
          public String getUserType() {
              return "Staff";
          }
      }

### Exception Handling
In the ElectricityInvoiceGenerator code,exception handling ensures graceful error management:
- File not found issue is addressed using try and catch blocks.
- Mistyped input issues are handled using NumberFormatException in various input scenarios.

      private int readIntFromScanner(Scanner scanner) {
          try {
              return scanner.nextInt();
          } catch (java.util.InputMismatchException e) {
              System.out.println("Invalid input. Please enter a valid integer.");
              scanner.nextLine(); // Consume the invalid input
              return readIntFromScanner(scanner); // Retry reading
          }
      }

### File I/O 
File I/O is utilized to store and retrieve invoice information:

    private void saveInvoiceToFile(Invoice invoice) {
        try (FileWriter fileWriter = new FileWriter("invoice_history.txt", true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            printWriter.println(invoice);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error saving invoice to file.");
        }
    }
This method writes invoice information to the "invoice_history.txt" file, utilizing FileWriter and PrintWriter. A try-with-resources block ensures proper resource management.


### Anonymous Inner Class / Functional Interface / Lambda Expression
A lambda expression is utilized in the Authentication class to define a functional interface (LoginProcess) for user authentication:

    @FunctionalInterface
    interface LoginProcess {
        boolean login(Scanner scanner, Map<String, ? extends User> userMap);
    }

Lambda expressions are then used for different login processes, demonstrating concise and flexible code.

### Static methods
Static methods are employed in the ElectricityInvoiceGenerator code:

    public static void printUserInfo(User user) {
     System.out.println(user);
    }

The printUserInfo method is static, allowing it to be called without creating an instance of the class. This method prints user information to the console.








 




