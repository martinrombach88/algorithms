public class Main {
    public static void main(String[] args) {

        Refrigerator lgFridge = new Refrigerator(false);
        Dishwasher lgDishwasher = new Dishwasher(false);
        CoffeeMaker illyCoffeeMaker = new CoffeeMaker(false);
        SmartKitchen smartKitchen = new SmartKitchen(lgFridge, lgDishwasher, illyCoffeeMaker);

//        smartKitchen.doKitchenWork();

        //When Tim said 'Your application won't access the appliances directly', he meant
        //that your smart kitchen would have internal classes for the appliances, and a no-param constructor.
        //Using this approach, we can achieve the full functionality of the smart kitchen in one line,
        //without the need for multiple constructor calls to the appliances.

        //Also, using 'setKitchenState', we can give the class greater functionality.

        SmartKitchen secondSmartKitchen = new SmartKitchen();
        secondSmartKitchen.setKitchenState(true, true, false);
        secondSmartKitchen.doKitchenWork();
    }
}
