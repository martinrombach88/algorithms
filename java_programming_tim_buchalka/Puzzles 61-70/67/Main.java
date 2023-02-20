import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();
    private static Map<String, String> vocabulary = new HashMap<String, String>();

    public static void main(String[] args) {
        command();
    }
    //PSEUDO
    //Contain the scanner and while loop in the command method

    public static void command() {
        final String[] locationStrings = {"You are sitting in front of a computer learning Java", "You are standing at the end of a road before a small brick building", "You are at the top of a hill", "You are inside a building, a well house for a small spring", "You are in a valley beside a stream", "You are in the forest"};

        for (int i = 0; i < locationStrings.length; i++) {
            locations.put(i, new Location(i, locationStrings[i]));
        }

        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("EAST", "E");
        vocabulary.put("WEST", "W");

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);

        locations.get(2).addExit("N", 5);

        locations.get(3).addExit("W", 1);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);

        Scanner scanner = new Scanner(System.in);
        int loc = 1;
        while (true) {
            boolean found = false;
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for (String exit : exits.keySet()) {
                    System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            if (direction.length() > 1) {
                String[] words = direction.split(" ");
                for(String word: words) {
                    if(vocabulary.containsKey(word)){
                        direction = vocabulary.get(word);
                    }
                }
            }
            //Here your code needs to look at the vocabulary set.
            //How do you do that?


            for (String exit : exits.keySet()) {
                if (exit.contains(direction)) {
                    loc = exits.get(exit);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("You cannot go in that direction");
            } else {
                found = false;
            }

        };

    }
}