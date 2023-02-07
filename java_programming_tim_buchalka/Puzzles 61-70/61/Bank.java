import java.util.ArrayList;

public class Bank {

    public String name;
    public ArrayList<Customer> customers;

    public Bank(String name, ArrayList<Customer> customers) {
        this.name = name;
        this.customers = customers;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(Customer customer) {
        //Add customer to customers list
        for (Customer target : customers) {
            if (customer == target) {
                System.out.println("Customer " + customer + "already exists.");
            }
            else {
                customers.add(customer);
            }
        }

    }

    public void addTransaction(String customerName, double transaction) {
        for (Customer customer : customers) {
            if (customer.name == customerName) {
                customer.transactions.add(transaction);
            }
            else {
                System.out.println("Customer not found.");
            }
        }
    }

    public void printStatement(String customerName) {
        //Print a statement including the customer name and transaction amounts.
        for (Customer customer : customers) {
            if (customer.name == customerName) {
                System.out.println("Name: " + customerName);
                System.out.println("Transactions: ");
                //The following code should unbox the transactions
                for (double transaction : customer.transactions) {
                    System.out.println(transaction);

                }
            }
        }
    }


}

