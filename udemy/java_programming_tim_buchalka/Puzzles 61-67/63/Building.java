public class Building implements Mappable{
    Type type;
    String name;
    Usage usage;
    Marker marker;

    public Building(String name, Usage usage) {
        this.type = type.POINT;
        this.name = name;
        this.usage = usage;
        this.marker = Marker.RED_STAR;
    }

    public Type getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public Usage getUsage() {
        return usage;
    }

    @Override
    public Marker getMarker() {
        return marker;
    }

    @Override
    public String getLabel() {
        return name + " (" + usage + ")";
    }

    @Override
    public String printProperties() {
        Type type = getType();
        Marker marker = getMarker();
        String name = getName();
        Usage usage = getUsage();
        String label = getLabel();
        String compiledString = """
               "type": "%s", "label": "%s", "marker": "%s", "name": "%s", "usage": "%s" 
               """.formatted(type, label, marker, name, usage);
        return compiledString;
    }

    public void toJSON() {
        //Using formatted, you can format a string in the same way as printf() in a variable.
        //JSON_PROPERTY expects compiledString as an argument.

        System.out.printf(JSON_PROPERTY, printProperties());
    }


}
