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

### Polymorphism 
- Polymorphism is showcased through method overloading and overriding. <br>
- The Client class features method overloading with printUserInfo(). <br>
- The Client and Staff classes demonstrate method overriding with toString(), equal() and 
getUserType().<br>

### Encapsulation 
 Encapsulation is achieved by using private access modifiers for the username and password fields in the User class, controlling access to sensitive data.<br>

### Abstraction 
- Abstraction is implemented through the creation of an abstract class User, which contains an abstract method getUserType().<br>
- Subclasses (Client and Staff) provide concrete implementations of this method.<br>

### Exception Handling
- Exception handling is incorporated into the project with the readIntFromScanner method in the InvoiceGeneratorSystem class.<br>
- It catches InputMismatchException to ensure valid user input.<br>

### File I/O 
 File I/O is utilized in the InvoiceGeneratorSystem class to store and retrieve invoice information in/from a file (invoice_history.txt).<br>

### Anonymous Inner Class / Functional Interface / Lambda Expression
 A functional interface named LoginProcess is used with lambda expressions in the runSystem method to provide a flexible and concise way to handle 
login processes.







 




