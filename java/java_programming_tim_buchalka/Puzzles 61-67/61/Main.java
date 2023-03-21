import java.util.ArrayList;
import java.util.List;

//PSEUDO
//1. Build each aspect of an instance of each separately, to understand the array structure and init process.
// (Choose some values, and test);
//2. Put the separate parts together when you call Customer and/or Bank.
public class Main {
    public static void main(String[] args) {
        //Init an Array List:
        //Either new ArrayList<>() and then add(value) one by one
        //Or new ArrayList<>(List.of(1, 2, 3, 4)

        //Doubles need to be declared with 0.0 otherwise Java picks up integers
        ArrayList<Double> steveTransactions = new ArrayList<>(List.of(100.0, 200.0, -19.99, -41.80));
        Customer Steve = new Customer("Steve", steveTransactions);

        //Single line call
        Customer Jacob = new Customer("Jacob", new ArrayList<>(List.of(-60.00, 40.00, 20.00)));

        Bank Barclays = new Bank("Barclays", new ArrayList<>(List.of(Steve, Jacob)));


        Barclays.addCustomer(new Customer("Darren", new ArrayList<>(List.of(1000.00, 2000.00, -500.00))));
        Barclays.addTransaction("Darren", 50.00);
        Barclays.printStatement("Darren");
        Barclays.addTransaction("Bob", 10.00);
        Barclays.addCustomer(new Customer("Darren", new ArrayList<>(List.of(1000.00, 2000.00, -500.00))));
    }
}
