import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Movie bladeRunner = new Movie(20, "Blade Runner");
        bladeRunner.showDetails();
        Appliance silverCrest = new Appliance(180, "Silvercrest Mini Rice Cooker");
        silverCrest.showDetails();
        Toy jigglypuff = new Toy(30, "Pokemon Jigglypuff Plush Doll");
        jigglypuff.showDetails();
        ArrayList<ProductForSale> cProducts = new ArrayList<>(List.of(bladeRunner, silverCrest, jigglypuff));
        ArrayList<OrderItem> order = new ArrayList<>();
        Store Coupang = new Store(cProducts, order);
        Coupang.displayProduct(bladeRunner);
        Movie paulBlart = new Movie (1, "Paul Blart Mall Cop");
        Coupang.displayProduct(paulBlart);

    }
}
