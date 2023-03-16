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
        customers.add(customer);

        //Validation:
        //While validation is beyond the scope of the challenge,
        //it can be added to review.

        //Issues:
        //Changing the ArrayList while iterating over it
        //returns a ConcurrentModificationException,
        //so you need to get around that.
    }

    public void addTransaction(String customerName, double transaction) {
        for (Customer customer : customers) {
            if (customer.name.equals(customerName)) {
                customer.transactions.add(transaction);
                return;
            }

        }
        System.out.println("Customer not found.");
    }

    public void printStatement(String customerName) {
        //Print a statement including the customer name and transaction amounts.
        for (Customer customer : customers) {
            if (customerName.equals(customer.name)) {
                System.out.println("Customer: " + customerName);
                System.out.println("Transactions: ");
                //The following code unboxes the transactions
                for (double transaction : customer.transactions) {
                    System.out.println(transaction);
                }
            }
        }
    }


}

