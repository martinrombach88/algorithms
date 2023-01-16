public class c40 { 
    //Object Oriented Challenge
    //Create a new class for bank account
    //Create fields: account number, account balance, customer name, email, phone number
    //Create methods for printing details, withdrawal and deposit
    //Withdrawal method removes money from the account. It can't withdraw more than the balance.
    //Deposit method adds money to the account.

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.setAccountNumber(12345678);
        myAccount.setAccountBalance(9000);
        myAccount.setCustomerName("Martin");
        myAccount.setEmail("martinrombach88@gmail.com");
        myAccount.setPhoneNumber(01076307131);

        myAccount.displayCustomer();

        myAccount.makeDeposit(50); //Account balance 9050
        myAccount.makeWithdrawal(50); //Account balance 9000
        myAccount.makeWithdrawal(10000); //Error - Insufficient funds
        myAccount.makeWithdrawal(55.55); //Account balance $8944.45
    }

}
