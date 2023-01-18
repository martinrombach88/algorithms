public class Calculator {
    //The calculator takes class instances as fields. 
    //Once a user has instantiated a carpet and a floor,
    //they can pass the variables into this class as params.
    private Carpet carpet;
    private Floor floor;

    //Here the constructor uses an instance of floor and carpet to create a calculator.
    //Without a carpet and a floor, an instance of calculator cannot exist.
    public Calculator(Floor floor, Carpet carpet) {
        this.carpet = carpet;
        this.floor = floor;
    }

    //Method named getTotalCost without any parameters, it needs to return the calculated total cost to cover the floor with a carpet.
    public double getTotalCost() {
       //Here you call methods from the instances of Carpet and Floor
       //used to instantiated Calculator 
       return floor.getArea() * carpet.getCost();
    }
}
