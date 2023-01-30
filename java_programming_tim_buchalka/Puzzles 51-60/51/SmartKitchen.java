public class SmartKitchen {
    private Refrigerator refrigerator;
    private Dishwasher dishwasher;
    private CoffeeMaker coffeeMaker;

    public SmartKitchen(Refrigerator refrigerator, Dishwasher dishwasher, CoffeeMaker coffeeMaker) {
        this.refrigerator = refrigerator;
        this.dishwasher = dishwasher;
        this.coffeeMaker = coffeeMaker;
    }

    //This second constructor is a much better approach which creates a smart kitchen without
    //building the classes for the appliances each time. By making new instances of the appliances
    //when the SmartKitchen is instantiated, you can instantiate the Smart Kitchen in one line.
    public SmartKitchen() {
        refrigerator = new Refrigerator(false);
        dishwasher = new Dishwasher(false);
        coffeeMaker = new CoffeeMaker(false);
    }

    public void addWater() {
        //While setting the true tag individually accomplishes the goal,
        //creating a setter method gives greater functionality.
        //With it, all, some or none of the methods can be called through the params.
//        this.refrigerator.hasWorkToDo = true;
        this.refrigerator.orderFood();
    }

    public void pourMilk() {
//        this.coffeeMaker.hasWorkToDo = true;
        this.coffeeMaker.brewCoffee();
    }

    public void loadDishwasher() {
//        this.dishwasher.hasWorkToDo = true;
        this.dishwasher.doDishes();
    }

    //Here we
    public void setKitchenState(boolean fridgeFlag, boolean coffeeFlag, boolean dishwasherFlag) {
        this.refrigerator.hasWorkToDo = fridgeFlag;
        this.coffeeMaker.hasWorkToDo = coffeeFlag;
        this.dishwasher.hasWorkToDo = dishwasherFlag;
    }
    public void doKitchenWork() {
        this.loadDishwasher();
        this.pourMilk();
        this.addWater();
    }
}

class Refrigerator {
    protected boolean hasWorkToDo;
    public Refrigerator(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }


    protected void orderFood() {
        if (hasWorkToDo){
            System.out.println("Ordering food.");
            hasWorkToDo = false;
        }
    }
}

class Dishwasher {
    protected boolean hasWorkToDo;
    protected Dishwasher(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    protected void doDishes() {
        if (hasWorkToDo){
            System.out.println("Washing dishes.");
            hasWorkToDo = false;
        }
    }
}

class CoffeeMaker {
    protected boolean hasWorkToDo;
    protected CoffeeMaker(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    protected void brewCoffee() {
        if (hasWorkToDo){
            System.out.println("Making Coffee");
            hasWorkToDo = false;
        }

    }
}

