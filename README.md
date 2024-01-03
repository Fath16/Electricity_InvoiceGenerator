# Electricity_InvoiceGenerator
**Introduction** <br>
Our purpose of an Electricity Invoice Generator is to facilitate the calculation of total invoice amounts, save invoices to a file, view invoices, view invoice history and generation of invoices for electricity consumption. This system automates the process of computing the total amount owed based on the amount of electricity used by a client.

## Table of Contents
- [Classes and Objects](#classes-and-objects)
- [Inheritance](#inheritance)
 
 
**Classes and Objects** <br>
- Client and Staff: this class extends the user class to represent the user type of invoice system. it contains username and password in each class to identify the user.<br>
- User: this abstract class represents a generic user that contains username and password fields. <br>
- Invoice: this class stores information about the client and total amount for an invoice. and it provides methods to retrieve the client’s name and total amount.<br>
- InvoiceGeneratorSystem: this main class provides the main functionality for the system. It implements methods for initializing users, generating invoices, saving invoice to files, viewing invoices, and calculating total amounts of electricity usage.<br>

 **Inheritance** <br>
 - The Client and Staff classes inherit from the User class, demonstrating the inheritance principle. <br>
 - The Client class overrides the toString() method, while the Staff class overrides the getUserType() method.

