# Electricity_InvoiceGenerator
**Introduction** <br>
 Our purpose of an Electricity Invoice Generator is to facilitate the calculation of total invoice amounts, save invoices to a file, view invoices, view invoice history and generation of invoices for electricity consumption. This system automates the process of computing the total amount owed based on the amount of electricity used by a client.

## Table of Contents
- [Classes and Objects](#classes-and-objects)
- [Inheritance](#inheritance)
- [Polymorphism](#polymorphism)
- [Encapsulation](#encapsulation)
- [Abstraction](#abstraction)
- [Exception Handling](#exception-handling)
- [File I/O](#file-i/o)
- [Anonymous Inner Class / Functional Interface / Lambda Expression](-functional-interface)
  


 
 
**Classes and Objects** <br>
- Client and Staff: this class extends the user class to represent the user type of invoice system. it contains username and password in each class to identify the user.<br>
- User: this abstract class represents a generic user that contains username and password fields. <br>
- Invoice: this class stores information about the client and total amount for an invoice. and it provides methods to retrieve the client’s name and total amount.<br>
- InvoiceGeneratorSystem: this main class provides the main functionality for the system. It implements methods for initializing users, generating invoices, saving invoice to files, viewing invoices, and calculating total amounts of electricity usage.<br>

**Inheritance** <br>
- The Client and Staff classes inherit from the User class, demonstrating the inheritance principle. <br>
- The Client class overrides the toString() method, while the Staff class overrides the getUserType() method.

**Polymorphism** <br>
- Polymorphism is showcased through method overloading and overriding. <br>
- The Client class features method overloading with printUserInfo(). <br>
- The Client and Staff classes demonstrate method overriding with toString() and 
getUserType().<br>

**Encapsulation** <br>
 Encapsulation is achieved by using private access modifiers for the username and password fields in the User class, controlling access to sensitive  
data.<br>

**Abstraction** <br>
- Abstraction is implemented through the creation of an abstract class User, which contains an abstract method getUserType().<br>
- Subclasses (Client and Staff) provide concrete implementations of this method.<br>

**Exception Handling** <br>
- Exception handling is incorporated into the project with the readIntFromScanner method in the InvoiceGeneratorSystem class.<br>
- It catches InputMismatchException to ensure valid user input.<br>

**File I/O** <br>
 File I/O is utilized in the InvoiceGeneratorSystem class to store and retrieve invoice information in/from a file (invoice_history.txt).<br>

**Anonymous Inner Class / Functional Interface / Lambda Expression** <br>
 A functional interface named LoginProcess is used with lambda expressions in the runSystem method to provide a flexible and concise way to handle 
login processes.







 




