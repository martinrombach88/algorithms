public class Building implements Mappable{
    //So now you need to be able to declare an instance of Building.
    //How is this achieved -> Building building = new Building.
    //What else needs to be done to populate the label/type/marker etc?

    @Override
    public String getType(Type type) {
        return "" + type;
    }

    @Override
    public String getLabel(String name, Usage usage) {
        return name + " (" + usage + ")";
    }



    @Override
    public String getMarker(Marker marker) {
        return "" + marker;
    }

    @Override
    public void toJSON() {
        Type type = Type.POINT;
        Marker marker = Marker.RED_STAR;
        String label = getLabel("Jangi Town Hall", Usage.GOVERNMENT);
        String name = "Jangi Town Hall";
        Usage usage = Usage.GOVERNMENT;
        String compiledString = """
               "type":{%s}
               "label":{%s}
               "marker":{%s}
               "name":{%s}
               "usage":{%s}
               """;

        System.out.printf(JSON_PROPERTY, compiledString, type, label, marker, name, usage);
    }
}
