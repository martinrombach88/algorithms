public class Movie extends ProductForSale{

    public Movie(double price, String description) {
        super(ProductType.MEDIA, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Movie Name: " + description);
        System.out.println("Category: " + type);
        System.out.println("Price: $" + price);
    }
}
