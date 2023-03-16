public class Main {
    //Output:
    //"properties" : { "type" : "POINT", "label": "Sydney Town Hall (GOVERNMENT)", "marker": "RED STAR", "name": "Sydney Town Hall", "usage": "GOVERNMENT"}
    public static void main(String[] args) {

        //Create two classes implementing the interface
        Building house = new Building("Gimpo City Hall", Usage.GOVERNMENT);
        UtilityLine internet = new UtilityLine("Fiber Optic Internet", Usage.FIBER_OPTIC);
        house.toJSON();
        internet.toJSON();
    }


}
