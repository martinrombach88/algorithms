public class c43 {
    //Create 3 different types of constructors.
    //See images for details

    public static void main(String[] args) {
        

        Customer Martin = new Customer("Martin", "martinrombach88@gmail.com", 5000);
        System.out.println("Constructor 1 - Standard");
        System.out.println(Martin.getName());
        System.out.println(Martin.getEmail());
        System.out.println(Martin.getCreditLimit());

        Customer Default = new Customer();
        System.out.println("Constructor 2 - Default");
        System.out.println(Default.getName());
        System.out.println(Default.getEmail());
        System.out.println(Default.getCreditLimit());

        Customer Steve = new Customer("Steve", "steve@minecraft.com");
        System.out.println("Constructor 3 - Less Parameters");
        System.out.println(Steve.getName());
        System.out.println(Steve.getEmail());
        System.out.println(Steve.getCreditLimit());
    }
}