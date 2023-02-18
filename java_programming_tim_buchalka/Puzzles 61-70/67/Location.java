import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<String, Integer>();


        //Here you can definitely change Q to QUIT and it works. However, you need to make it receive multiple inputs.
        //Inputs should be QUIT, and accept the split Q as well as Concat strings I want to Quit/Quit Game
        this.exits.put("QUIT", 0);
    }
    public void addExit(String directions, int location) {
        exits.put(directions,location);
//        System.out.println(exits);
    }
    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
