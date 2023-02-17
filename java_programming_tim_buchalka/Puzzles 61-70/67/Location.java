import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String[], Integer> exits;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<String[], Integer>();
        this.exits.put(new String[]{"Q", "Quit Game", "Quit", "I need to Quit"}, 0);
    }
    public void addExit(String[] directions, int location) {
        exits.put(directions,location);
    }
    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String[], Integer> getExits() {
        return new HashMap<String[], Integer>(exits);
    }
}
