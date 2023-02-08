public class Toy extends ProductForSale{

    public Toy(double price, String description) {
        super(ProductType.CHILDREN, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Toy Name: " + description);
        System.out.println("Category: " + type);
        System.out.println("Price: $" + price);
    }

}
