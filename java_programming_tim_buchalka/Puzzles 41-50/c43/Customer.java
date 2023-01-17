public class Customer {
    
    private String name;
    private String email;
    private int creditLimit;

    //Constructor 1 - Assign arguments directly to instance fields.
    public Customer(String name, String email, int creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
        System.out.println("Regular constructor called.");
    }

    //Constructor 2 - No Arguments Constructor (Default)
    public Customer() {
        this("Default user", "user@email.com", 100);
        System.out.println("Empty constructor called.");
    }

    //Constructor 3 - Name and Email Only
    public Customer(String name, String email) {
        this(name, email, 100);
        System.out.println("2 Param Constructor called.");
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public int getCreditLimit() {
        return this.creditLimit;
    }


}
