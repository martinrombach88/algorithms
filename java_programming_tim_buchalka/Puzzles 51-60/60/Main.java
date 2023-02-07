import java.util.*;

public class Main {

    public record Town(String name, int distance) {
        @Override
        public String toString() {
            return name + " (" + distance + ")";
        }
    }

    // Data does not need to change, so record is good
    public static void main(String[] args) {
        //ArrayList<Town> placesToVisit = new ArrayList<>(Arrays.asList(
        //Type conversion overcomplicates the code, using more memory
        //and making issues down the line. You should only
        //convert type (ArrayList to LinkedList) if you really need to.
        var placesToVisit = new LinkedList<Town>();
            addTown(new Town("Jangi", 0), placesToVisit);
            addTown(new Town("Jangi", 0), placesToVisit);
            addTown(new Town("Jangi", 0), placesToVisit);
            addTown(new Town("Jeju", 120), placesToVisit);
            addTown(new Town("ByeonsanBando", 60), placesToVisit);
            addTown(new Town("Busan", 170), placesToVisit);
            addTown(new Town("Taen", 50), placesToVisit);
            addTown(new Town("GyeongBokGong", 20), placesToVisit);
            addTown(new Town("Jangi", 0), placesToVisit);
            itinerary(placesToVisit);
    }

    // }
    public static void itinerary(LinkedList<Town> placesToVisit) {
        // Create the linked list

        Scanner scanner = new Scanner(System.in);
        var iterator = placesToVisit.listIterator();
        boolean quit = false;
        //Create the forward boolean here first, and set it to true.
        boolean forward = true;
        printMenu();
        while (!quit) {
            System.out.println("Enter a letter or word for which action you want to do:");
            switch (scanner.nextLine()) {
                //Here you wasted a lot of time making a helper function.
                //Sometimes a helper function overcomplicates the work.
                //If a task is complicated, and you aren't sure how to do it,
                // get it working in its original scope first,
                // then build helper functions.

                //Overcomplicating is particularly counter-productive with
                //the listIterator method, as any unnecessary calls
                //and reassignments (like your array[0] / array[1] assignments)
                //will be hard to find and clear out.

                //Key issue ->
                //System.out.printf("->  From %s to %s, distance: %dkm. %n", placesToVisit.get(i - 1).name,lacesToVisit.get(i).name, placesToVisit.get(i - 1).distance);

                //You were trying to make a complicated print call to both the current
                // and previous towns within the forward/back traversal. This required further logic, as achieving this call requires reassignments.
                //But the reassignments were beyond the scope of the challenge.
                //Reassignments added extra steps in the iterator, so it was harder to
                //understand how the iterator worked.

                //Key Points:
                //1. Clarify the requirements, use pseudo first
                //2. Build the code, then adapt to a helper function when ready.
                //3. Simple is usually better! If your code is too complicated, wipe,
                //brainstorm and start over.


                case "F" -> {
                    System.out.println("Going forward through itinerary.");
                    if (!forward) {
                        forward = true;
                        //Here we compensate for the need for 2 calls
                        // with 1 extra call to iterator.next().
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                    }

                    //This call is the regular call to print.
                    //If the program reaches the start, the call above
                    //triggered by the (!forward) condition
                    //and this call (even with a print, the next();
                    //will iterate after returning) are enough to
                    //handle reaching the end point and reversing.
                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }

                    //Simple is usually better!
                }

                case "B" -> {
                    System.out.println("Going backward through itinerary.");
                    //This code works the same way as above. There's no
                    //need for reassignments or special if conditions.
                    //The built functions (hasNext/hasPrevious) handle
                    //this in a simple way, you should just trust it
                    //to do it.

                    if(forward) {
                        forward = false;
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                    }

                    if (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                }
                // case "M" -> printMenu(); -> see default
                case "L" -> printFullItinerary(placesToVisit);
                case "Q" -> {
                    System.out.println("Quitting Program");
                    quit = true;
                }
                // You can't create validation errors with a typo in a switch, it just defaults
                //This makes it ideal for user input solutions.
                default -> printMenu();
            }

        }
    }

    public static void addTown(Town town, LinkedList<Town> linkedList) {
        //Check whether the town can be added
        for (Town i : linkedList) {
            if (linkedList.contains(town)) {
                //At the end, the town is added to the list
                //These return calls end the function early so
                //that last call to add is never reached
                return;
            }
        }
        //Add towns in distance order
        //Index is the location to adjust to if the distance is greater
        int matchIndex = 0;
        for (Town j : linkedList) {
            if(town.distance < j.distance) {
                linkedList.add(matchIndex, town);
                return;
            }
            matchIndex ++;
        }
        linkedList.add(town);
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
    public static void printFullItinerary(LinkedList<Town> placesToVisit) {
        System.out.println("Trip starts at " + placesToVisit.getFirst().name);
        for (int i = 1; i < placesToVisit.size(); i++) {
            System.out.printf("->  From %s to %s, distance travelled: %dkm. %n", placesToVisit.get(i - 1).name,
                    placesToVisit.get(i).name, placesToVisit.get(i).distance);
        }
    }
}

