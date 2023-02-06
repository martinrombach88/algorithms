import java.util.*;

public class Main {

    public record Town(String name, int distance) {
    }

    // Data does not need to change, so record is good
    public static void main(String[] args) {

        ArrayList<Town> placesToVisit = new ArrayList<>(Arrays.asList(
                // 3 include to test duplicate validation
                new Town("Jangi", 0),
                new Town("Jangi", 0),
                new Town("Jangi", 0),
                new Town("GyeongBokGong", 20),
                new Town("Jeju", 140),
                new Town("Busan", 80),
                new Town("Taen", 100),
                new Town("YangYang", 40),
                new Town("ByeonsanBando", 80)));

        itinerary(placesToVisit);
    }

    // }
    public static void itinerary(ArrayList<Town> arrayList) {
        // Create the linked list
        // If a type isn't transferring, remember to cast!
        var placesToVisit = convertToLinkedList(arrayList);
        Scanner scanner = new Scanner(System.in);
        var iterator = placesToVisit.listIterator();
        System.out.println(iterator.next());

        boolean quit = false;
        printMenu();
        while (!quit) {
            System.out.println("Enter a letter or word for which action you want to do:");

            switch (scanner.nextLine()) {
                case "F" -> moveLocation(placesToVisit, iterator, true);
                case "B" -> moveLocation(placesToVisit, iterator, false);
                // case "M" -> printMenu();
                case "L" -> printFullItinerary(placesToVisit);
                // You can't create validation errors with a typo in a switch, it just defaults
                // When you type Q, it does this.
                case "Q" -> {
                    System.out.println("Quitting Program");
                    quit = true;
                }
                default -> printMenu();
            }

        }
        // Switch here (in while loop)
        // Letter F -> Scroll to next town prompt (prompt: London to Paris)
        // Letter B -> Scroll to prev town prompt (prompt: Glastonbury to London)
        // Letter L -> Print list of places (names only)
        // Letter M -> Return to Menu
        // Letter Q -> Quit
    }

    public static LinkedList convertToLinkedList(ArrayList<Town> arrayList) {
        var linkedList = new LinkedList<Town>();
        // Filter the param array for duplicates
        for (Town town : arrayList) {
            if (!linkedList.contains(town)) {
                linkedList.add(town);
            }
        }
        return linkedList;
    }

    public static void printMenu() {
        String textBlock = """
                Available actions (select a word or letter);
                //Letter (F)orward -> View next location
                //Letter (B)ack -> View previous location
                //Letter (L)ist -> Print Full Itinerary
                //Letter (M)enu -> Show Menu
                //Letter (Q)uit -> Quit Program""";
        System.out.println(textBlock);
    }

    public static void moveLocation(LinkedList placesToVisit, ListIterator iterator, boolean forward) {
        Town prevTown;
        Town town;

        // Two if blocks isn't a good approach. There's probably conflicts
        // and redundancies you aren't seeing.
        // Try to use one and visualise it before you write it.
    }

    public static void printLocation(Town prevTown, Town town) {
        System.out.printf("->  From %s to %s. %n", prevTown.name, town.name);
    }

    public static void printFullItinerary(LinkedList<Town> placesToVisit) {
        System.out.println("Trip starts at " + placesToVisit.getFirst().name);

        for (int i = 1; i < placesToVisit.size(); i++) {
            System.out.printf("->  From %s to %s, distance: %dkm. %n", placesToVisit.get(i - 1).name,
                    placesToVisit.get(i).name, placesToVisit.get(i - 1).distance);
        }
    }
}

// if (!iterator.hasPrevious()) {
// prevTown = (Town) placesToVisit.get(0);
// town = (Town) placesToVisit.get(1);
// } else if (!iterator.hasNext()) {
// prevTown = (Town) placesToVisit.get(iterator.previousIndex());
// town = (Town) placesToVisit.get(iterator.nextIndex());
// } else {
// prevTown = (Town) placesToVisit.get(iterator.previousIndex());
// town = (Town) placesToVisit.get(iterator.nextIndex());
// }

// if (forward && iterator.hasNext()) {
// iterator.next();
// printLocation(prevTown, town);
// } else if (!forward && iterator.hasPrevious()) {
// iterator.previous();
// printLocation(prevTown, town);
// } else {
// printLocation(prevTown, town);
// }