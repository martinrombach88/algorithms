import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Initialise products
        Movie bladeRunner = new Movie(20, "Blade Runner DVD");
        Appliance silverCrest = new Appliance(180, "Silvercrest Mini Rice Cooker");
        Toy jigglypuff = new Toy(30, "Pokemon Jigglypuff Plush Doll");
        System.out.println("-".repeat(20));

        //Prepare list for store
        ArrayList<ProductForSale> cProducts = new ArrayList<>(List.of(bladeRunner, silverCrest, jigglypuff));
        ArrayList<OrderItem> order = new ArrayList<>();

        //Initialise a store
        Store coupang = new Store(cProducts, order);
        System.out.println("Coupang Store - List of Products");
        coupang.displayProduct(bladeRunner);
        coupang.displayProduct(silverCrest);
        coupang.displayProduct(jigglypuff);
        Movie paulBlart = new Movie (1, "Paul Blart Mall Cop DVD");
        coupang.displayProduct(paulBlart);
        System.out.println("-".repeat(20));

        //Order items from the store
        OrderItem bladeRunnerDVD = new OrderItem(1, bladeRunner);
        OrderItem jigglypuffDoll = new OrderItem(1, jigglypuff);
        coupang.addItemToOrder(bladeRunnerDVD);
        coupang.addItemToOrder(jigglypuffDoll);
        coupang.printOrder();
    }
}
