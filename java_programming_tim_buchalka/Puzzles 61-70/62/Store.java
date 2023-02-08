import java.util.ArrayList;

public class Store {

        private ArrayList<ProductForSale> availableProducts;
        private ArrayList<OrderItem> order;

        public Store(ArrayList<ProductForSale> availableProducts, ArrayList<OrderItem> order) {
            this.availableProducts = availableProducts;
            this.order = order;
        }

        public ArrayList<ProductForSale> getAvailableProducts() {
            return availableProducts;
        }

        public ArrayList<OrderItem> getOrder() {
            return order;
        }

        public void displayProduct(ProductForSale productForSale) {
            if (availableProducts.contains(productForSale)) {
                productForSale.showDetails();
            } else {
                System.out.println("Product '" + productForSale.description + "' isn't available.");
            }
        }

        public void addItemToOrder(OrderItem orderItem) {
            ProductForSale product = orderItem.productForSale();
            if(!order.contains(orderItem)) {
                order.add(orderItem);
                System.out.print("Order added - ");
                product.printPricedLineItem(orderItem);
            } else {
                System.out.println("Item" + product.description + " already in order.");
            }
        }

        public void printOrder() {
            double total = 0.0;
            System.out.println("-".repeat(20));
            System.out.println("Your Order:");
            System.out.println();
            for (OrderItem orderItem : order) {
               ProductForSale product = orderItem.productForSale();
               product.printPricedLineItem(orderItem);
               total += product.getSalesPrice(orderItem);
            }
            System.out.println();
            System.out.println("Order Total: $" + total);
            System.out.println("-".repeat(20));
        }



//products for sale (manage a list, display product details
        //manage order (a list of order item objects)

        //private ArrayList<ProductForSale> products O
        //private ArrayList<OrderItem> orderItems O

        //getters O

        //method: displayProduct
        //print(products.index(n))

        //method: addItemToOrder
        //products.add(OrderItem)

        //method: printOrderedItems
        //print(orderItems)


}
