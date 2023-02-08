public class Appliance extends ProductForSale{
    public Appliance(double price, String description) {
        super(ProductType.ELECTRONICS, price, description);
    }

    public Appliance(ProductType type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
            System.out.println("Appliance Name: " + description);
            System.out.println("Category: " + type);
            System.out.println("Price: $" + price);
        }
    }


