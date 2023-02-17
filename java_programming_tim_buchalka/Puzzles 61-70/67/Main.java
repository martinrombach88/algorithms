import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
//    Implement the command() method in the Main class to allow players to type full words, or phrases, then move to the correct location based upon their input.
//    The player should be able to type commands such as "Go West", "run South", "I need to Quit this game" or just "East" and the program will move to the appropriate location if there is one.
//    The console should display its current location, then it should prompt the user with: "Available exits are ", and its available exits. For example:


    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //CHANGE - Refactor of Strings to loop in, and refactor of exits to include new input strings.
        String[] locationStrings = {"You are sitting in front of a computer learning Java", "You are standing at the end of a road before a small brick building", "You are at the top of a hill", "You are inside a building, a well house for a small spring", "You are in a valley beside a stream", "You are in the forest"};

        //These are identical, so really your arrays should contain North, South, East, West
        //and split out the first letter from it
        //You can accept Go/Run/Walk + Direction as an input and convert

        String[] northExits = {"N", "North", "Go North", "Run North", "Walk North"};
        String[] southExits = {"S", "South", "Go South", "Run South", "Walk South"};
        String[] eastExits = {"E", "East", "Go East", "Run East", "Walk East"};
        String[] westExits = {"W", "West", "Go West", "Run West", "Walk West"};

        for (int i = 0; i < locationStrings.length; i++) {
            locations.put(i, new Location(i, locationStrings[i]));
        }

        locations.get(1).addExit(westExits, 2);
        locations.get(1).addExit(eastExits, 3);
        locations.get(1).addExit(southExits, 4);
        locations.get(1).addExit(northExits, 5);
        locations.get(2).addExit(northExits, 5);
        locations.get(3).addExit(westExits, 1);
        locations.get(4).addExit(northExits, 1);
        locations.get(4).addExit(westExits, 2);
        locations.get(5).addExit(southExits, 1);
        locations.get(5).addExit(westExits, 2);

        int loc = 1;
        while(true) {
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0) {
                break;
            }
            //Change String to String[]
            Map<String[], Integer> exits = locations.get(loc).getExits();
            System.out.println("Available exits are ");

            //Print exit[0] instead of just the exit key
            for(String[] exit : exits.keySet()) {
                System.out.print(exit[0] + " , ");
            }
            System.out.println();

            //This line takes user input, if block checks it
            String direction = scanner.nextLine().toUpperCase();

            //PSEUDO
            //Loop over an exit key's array. If array contains the user input string,
            //loc = exits[arrayKey[i][0]]
            //-> can you select this? Do you need a different structure for these keys?

            if(exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direction.");
            }

        }

//        public static void command() {
//
//        }
//        String[] road = "You are standing at the end of a road before a small brick building".split(" ");
//        for (String i : road) {
//            System.out.println(i);
//        }
//
//        System.out.println("=".repeat(20));
//
//        String[] building = "You are inside a building, a well house for a small spring".split(", ");
//        for (String i : building) {
//            System.out.println(i);
//        }
    }


}
