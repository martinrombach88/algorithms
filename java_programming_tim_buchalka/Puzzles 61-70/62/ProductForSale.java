public abstract class ProductForSale {
    //This class is abstract

    public ProductType type;
    public double price;
    public String description;

    public ProductForSale(ProductType type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public final double getSalesPrice(OrderItem orderItem) {
        ProductForSale productForSale = orderItem.productForSale();
        return productForSale.price * orderItem.quantity();
    }

    public final void printPricedLineItem(OrderItem orderItem) {
        ProductForSale product = orderItem.productForSale();
        System.out.printf("%d %s: $%s %n", orderItem.quantity(), product.description, product.getSalesPrice(orderItem));
    }

    public abstract void showDetails();

    //(enum) type
    //(double) price
    //description

    //method: getSalesPrice (concrete)
    //getSalesPrice(quantity) -> return price

    //method: printPricedLineItem (concrete)
    //printPricedLineItem(quantity) -> print quantity, line item price

    //method: showDetails (abstract)
    //print product details in a product page style
    //-type
    //-description
    //- price
}
