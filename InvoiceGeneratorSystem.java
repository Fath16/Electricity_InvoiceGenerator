package Electricity_InvoiceGenerator;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Anonymous Inner Class
public class InvoiceGeneratorSystem {
    private Map<String, Staff> staffMap = new HashMap<>();
    private Map<String, Client> clientMap = new HashMap<>();
    private Map<String, Invoice> invoiceMap = new HashMap<>();

    @FunctionalInterface
    interface LoginProcess {
        boolean login(Scanner scanner, Map<String, ? extends User> userMap);
    }

    public static void main(String[] args) {
        InvoiceGeneratorSystem system = new InvoiceGeneratorSystem();
        system.initializeUsers();
        system.runSystem();
    }

    private void initializeUsers() {
    }

    private void runSystem() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Staff Login");
            System.out.println("2. Client Login");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();

            LoginProcess loginProcess;

            switch (choice) {
                case 1:
                    loginProcess = (inputScanner, userMap) -> {
                        System.out.print("Enter staff username: ");
                        String username = inputScanner.next();
                        System.out.print("Enter staff password: ");
                        String password = inputScanner.next();

                        Staff staff = (Staff) userMap.get(username);
                        return staff != null && staff.getPassword().equals(password);
                    };
                    break;
                case 2:
                    loginProcess = (inputScanner, userMap) -> {
                        System.out.print("Enter client username: ");
                        String username = inputScanner.next();
                        System.out.print("Enter client password: ");
                        String password = inputScanner.next();

                        Client client = (Client) userMap.get(username);
                        return client != null && client.getPassword().equals(password);
                    };
                    break;
                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
                    continue;
            }

            boolean isLoggedIn = loginProcess.login(scanner, choice == 1 ? staffMap : clientMap);
            if (isLoggedIn) {
                System.out.println((choice == 1 ? "Staff" : "Client") + " login successful.");
                if (choice == 1) {
                    generateInvoice(scanner);
                } else {
                    viewInvoice(clientMap.keySet().iterator().next());
                }
            } else {
                System.out.println("Invalid credentials. Please try again.");
            }
        }
    }

    private void generateInvoice(Scanner scanner) {
        System.out.print("Enter client username: ");
        String clientUsername = scanner.next();
        System.out.print("Enter electricity consumption (in kWh): ");
        double consumption = scanner.nextDouble();

        double totalAmount = calculateTotalAmount(consumption);
        Invoice invoice = new Invoice(clientUsername, totalAmount);
        invoiceMap.put(clientUsername, invoice);

        saveInvoiceToFile(invoice);

        System.out.println("Invoice generated successfully.");
    }

    private void saveInvoiceToFile(Invoice invoice) {
        try (FileWriter fileWriter = new FileWriter("invoice_history.txt", true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {

            printWriter.println(invoice);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error saving invoice to file.");
        }
    }

    private void viewInvoice(String clientUsername) {
        Invoice invoice = invoiceMap.get(clientUsername);
        if (invoice != null) {
            System.out.println("Invoice for " + clientUsername + ":");
            System.out.println("Total Amount: $" + invoice.getTotalAmount());
        } else {
            System.out.println("No invoice found for the client.");
        }

        viewInvoiceHistory();
    }

    private void viewInvoiceHistory() {
        System.out.println("\nInvoice History:");
        try (Scanner fileScanner = new Scanner(new File("invoice_history.txt"))) {
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Invoice history file not found.");
        }
        System.out.println();
    }

    private double calculateTotalAmount(double consumption) {
        double ratePerKWh = 0.10;
        return consumption * ratePerKWh;
    }
}

