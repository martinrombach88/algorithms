public interface Mappable {
    //Output is mock data for JSON geographical elements
    //Output:
    //"properties" : { "type" : "POINT", "label": "Sydney Town Hall (GOVERNMENT)", "marker": "RED STAR", "name": "Sydney Town Hall", "usage": "GOVERNMENT"}

    //constant string value = JSON_PROPERTY equal to "properties":{%s} (use a text block)
    String JSON_PROPERTY = """
            "properties":{%s}
            """;

    //3 forced methods -
    //return a label, return a geometry type, return marker
    String getLabel();
    String getType();
    String getMarker();
    //These are passed to toJSON in a string built by the class.

    //default method toJSON that prints type, label and marker.
    //Final output is a concatenated string
    default void toJSON(String string) {
        System.out.printf(JSON_PROPERTY, string);
    }
}

//To create the markers and 'usage' sections, enums need to be made.
enum Type {POINT, LINE
}
enum Marker {RED_STAR, GREEN_DOTTED, BLUE_THICK
}
enum Usage {GOVERNMENT, FIBER_OPTIC, HOSPITAL, ENTERTAINMENT, SEWER_LINE, METRO_LINE
}
