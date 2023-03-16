public class BankAccount {
    
    //Class fields
    //When an instance is made, it has these.
    //It's a form -> form filled relationship.
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber;


    //Constructor
    //This is the constructor for the BankAccount.
    //A default method is called automatically when you create a class,
    //But generally a constructor with parameters is the most practical.
    //A params constructor can be generated with the right click Java Code Generators.

    //Parameters constructor
    //This constructor function takes parameters, doing the same job as setters and getters.
    //It makes for nicer code.
    public BankAccount(int accountNumber, double accountBalance, String customerName, String email, int phoneNumber){
        System.out.println("Account constructor with parameters called.");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //Constructor Chaining
    //Using the this() function, you can call another overloaded constructor within a different constructor.
    //This calls the constructor method above, assigns default values, then prints a message.
    //If you call BankAccount emptyAccount = new BankAccount(); without params, this code is used.

    //Good rule of thumb -- Only use params and 'this', don't use setters here
    // It's bad practice to use setters within a constructor, because of inheritors and 
    // other methods which might make these setters not work. 
    public BankAccount() {
        this(0, 0, "Default Name", "Default Address", 0);
        System.out.println("Empty constructor called.");
    }

    //Overloaded Constructor
    //You can make as many constructors that you want, as long as the params are different.
    public BankAccount(String customerName, String email, int phoneNumber) {
        //Here we call the original constructor with a default set.
        //When using this constructor, only three fields need to be entered.
        //In line 50, the original constructor is called. 
        this(9999, 100.55, customerName, email, phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //Setter and Getter Methods
    //Once the class has fields, Setters and Getters can be generated automatically
    //Right click, scroll down and find the java functions at the bottom
    //You can also use the constructor function to make setters, so they are often 
    //not needed unless you want extra validation code.

    //Getters
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    //Setters
    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //Class Methods
    //Custom methods can be built to interact with the class fields

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