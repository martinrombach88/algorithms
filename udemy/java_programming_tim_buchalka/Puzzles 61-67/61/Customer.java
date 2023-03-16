import java.util.ArrayList;

public class Customer {

    public String name;
    public ArrayList<Double> transactions;
    //Double is the object
    //double is the primitive
    //ArrayLists need the object to be declared. The following line doesn't work.
//    private ArrayList<double> transactions;


    public Customer(String name, ArrayList<Double> transactions) {
        this.name = name;
        this.transactions = transactions;
    }


}
