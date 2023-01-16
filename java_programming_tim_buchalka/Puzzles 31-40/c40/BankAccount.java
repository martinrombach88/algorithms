public class BankAccount {
    
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber;


    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }


    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void displayCustomer() {
        System.out.println("Account for " + this.customerName);
        System.out.println("Account number: " + this.accountNumber);
        System.out.println("Account balance: " + this.accountBalance);
        System.out.println("Email: " + this.email);
        System.out.println("Phone Number: " + this.phoneNumber);
    }

    public void makeDeposit(double amount) {
        System.out.println("Balance is $" + this.accountBalance + ".");
        if (amount > 0) {
            this.accountBalance += amount;
            System.out.println("$" + amount + " deposit added to the account.");
            System.out.println("Remaining balance is now $" + this.accountBalance + ".");
        } else {
            System.out.println("Invalid deposit amount.");
        }

    }

    public void makeWithdrawal(double amount) {
        System.out.println("Balance is $" + this.accountBalance + ".");
        if (amount < 0) {
            System.out.println("Cannot withdraw $" + amount + ". Invalid amount.");
        } else if (amount > this.accountBalance) {
            System.out.println("Cannot withdraw $" + amount + ". Insufficient funds.");
        } else {
            this.accountBalance -= amount;
            System.out.println("Withdrawing $" + amount + " from your account.");
            System.out.println("Remaining balance is now $" + this.accountBalance);
        }
    }

}