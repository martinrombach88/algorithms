public class c40 { 
    //Object Oriented Challenge
    //Create a new class for bank account
    //Create fields: account number, account balance, customer name, email, phone number
    //Create methods for printing details, withdrawal and deposit
    //Withdrawal method removes money from the account. It can't withdraw more than the balance.
    //Deposit method adds money to the account.

    public static void main(String[] args) {
        //Here we call the constructor function.
        //A class can have multiple constructor functions and has a default that constructs without params.
        //If you have multiple constructors, it's called Constructor Overloading.
        
        //Constructor with Parameters
        //If we create our own, the instance can be built from params
        //rather than individual setter calls 
        BankAccount myAccount = new BankAccount(12345678, 9000, "Martin", "martinrombach88@gmail.com", 01076307131);
        
        //Default Constructor and Setters
        //If we use the default (don't make our own in the class), we just get an instance
        // BankAccount myAccount = new BankAccount();
        // We would then use individual setter calls:
        // myAccount.setAccountNumber(12345678);
        // myAccount.setAccountBalance(9000);
        // myAccount.setCustomerName("Martin");
        // myAccount.setEmail("martinrombach88@gmail.com");
        // myAccount.setPhoneNumber(01076307131);

        //Constructor Chaining
        BankAccount emptyAccount = new BankAccount();
        BankAccount threeParamAccount = new BankAccount("Three", "three@email.com", 333);

        //Get Methods 
        System.out.println("Param Account - Get Methods:");
        System.out.println(myAccount.getCustomerName());
        System.out.println(myAccount.getEmail());
        

        //Class Methods 
        System.out.println("");
        System.out.println("Param Account - Class Methods:");
        myAccount.displayCustomer();
        myAccount.makeDeposit(50); //Account balance 9050
        myAccount.makeWithdrawal(50); //Account balance 9000
        myAccount.makeWithdrawal(10000); //Error - Insufficient funds
        myAccount.makeWithdrawal(55.55); //Account balance $8944.45


        System.out.println("Empty Account Methods:");
        System.out.println(emptyAccount.getCustomerName());
        System.out.println(emptyAccount.getEmail());
        emptyAccount.displayCustomer();
        threeParamAccount.displayCustomer();
        
    }


}
