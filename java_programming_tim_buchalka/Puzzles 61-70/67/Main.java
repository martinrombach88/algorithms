import java.util.*;

public class Main {
//    Implement the command() method in the Main class to allow players to type full words, or phrases, then move to the correct location based upon their input.
//    The player should be able to type commands such as "Go West", "run South", "I need to Quit this game" or just "East" and the program will move to the appropriate location if there is one.
//    The console should display its current location, then it should prompt the user with: "Available exits are ", and its available exits. For example:


    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Refactor of Strings to loop and put, and refactor of exits to include new input strings.
        String[] locationStrings = {"You are sitting in front of a computer learning Java", "You are standing at the end of a road before a small brick building", "You are at the top of a hill", "You are inside a building, a well house for a small spring", "You are in a valley beside a stream", "You are in the forest"};
        String[] exitNames = {"WEST","EAST", "SOUTH", "NORTH", "W", "E", "S", "N"};
        //Array should be North, South, East, West
        //and split out the first letter from it in the if block/switch
        //You can accept Go/Run/Walk + Direction as an input and convert

        for (int i = 0; i < locationStrings.length; i++) {
            locations.put(i, new Location(i, locationStrings[i]));
        }
        //North, N
        locations.get(1).addExit(exitNames[3], 2);
        locations.get(1).addExit(exitNames[7], 2);
        //South, S
        locations.get(1).addExit(exitNames[2], 3);
        locations.get(1).addExit(exitNames[6], 3);

        //East, E
        locations.get(1).addExit(exitNames[1], 4);
        locations.get(1).addExit(exitNames[5], 4);

        //West, W
        locations.get(1).addExit(exitNames[0], 5);
        locations.get(1).addExit(exitNames[4], 5);

        locations.get(2).addExit(exitNames[0], 5);
        locations.get(2).addExit(exitNames[4], 5);
        locations.get(3).addExit(exitNames[3], 1);
        locations.get(3).addExit(exitNames[7], 1);
        locations.get(4).addExit(exitNames[0], 1);
        locations.get(4).addExit(exitNames[4], 1);
        locations.get(4).addExit(exitNames[3], 2);
        locations.get(4).addExit(exitNames[7], 2);

        locations.get(5).addExit(exitNames[1], 1);
        locations.get(5).addExit(exitNames[5], 1);

        locations.get(5).addExit(exitNames[3], 2);
        locations.get(5).addExit(exitNames[7], 2);

        //PSEUDO
        //Contain the scanner and while loop in the command method

//        public static void command() {
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
                if (exit.length() > 1) {
                    System.out.print(exit + ", ");
                }

            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();

            for (String exit : exits.keySet()) {
                if (direction.contains(exit)) {
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


        }
    }
}
/*                if (exits.containsKey(direction)) {
                    loc = exits.get(direction);
            } else {
            System.out.println("You cannot go in that direction");*/








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