import java.util.*;

// Your grocery list should be an ArrayList. You should use methods on the ArrayList,
// to add items, remove items, check if an item is already in the list, and print a sorted list. O
// You should print the list, sorted alphabetically, after each operation. O
// You shouldn't allow duplicate items in the list. So that's the challenge. O

public class Main {

    public static void main(String[] args) {
        listPrinter();
    }

    public static void listPrinter() {
        Scanner scanner = new Scanner(System.in);
        // Important - any conditions affecting the while loop's variables should
        // be declared outside the loop!
        boolean listMade = false;
        ArrayList<String> groceries = new ArrayList<>();
        int num = prompt(scanner);

        while (num != 0) {
            if (!listMade) {
                if (num == 1) {
                    addGroceries(groceries, scanner);
                    printList(groceries);
                    listMade = true;
                    num = prompt(scanner);
                } else if (num == 2) {
                    System.out.println("You don't have a list yet.");
                    num = prompt(scanner);
                }
            } else if (num == 1) {
                addGroceries(groceries, scanner);
                groceries.sort(Comparator.naturalOrder());
                printList(groceries);
                num = prompt(scanner);
            } else if (num == 2) {
                System.out.println("Remove some groceries from the list.");
                String[] userList = scanner.nextLine().toLowerCase().split(",");
                groceries.removeAll(Arrays.asList(userList));
                printList(groceries);
                num = prompt(scanner);
            } else {
                printList(groceries);
                num = prompt(scanner);
            }
        }
        System.out.println("Exited program.");
    }

    public static int prompt(Scanner scanner) {
        System.out.println(
                "Save your groceries! Press a number. 1 - Add groceries to the list. 2 Remove groceries from the list. 0 to quit.");
        return Integer.parseInt(scanner.nextLine());
    }

    public static void printList(ArrayList<String> groceries) {
        System.out.println("Your list is: " + groceries);
    }

    public static void addGroceries(ArrayList<String> groceries, Scanner scanner) {
        System.out.println("Add some groceries to the list. Duplicates cannot be added.");
        String[] userList = (scanner.nextLine().toLowerCase().split(","));
        groceries.addAll(Arrays.asList(userList));
        groceries.replaceAll(String::trim);
        Set<String> set = new HashSet<>(groceries);
        groceries.clear();
        groceries.addAll(set);
        groceries.sort(Comparator.naturalOrder());

    }


    // Validation prompt (Beyond Scope - Bonus Challenge for Review)
    // public static int prompt(Scanner scanner) {
    // System.out.println("Save your groceries! Press a number. 1 - Add groceries to
    // the list. 2 Remove groceries from the list. 0 to quit.");
    // while(!scanner.hasNextInt()) {
    // System.out.println("You can only use numbers 0, 1 and 2 in this menu.");
    // System.out.println("Save your groceries! Press a number. 1 - Add groceries to
    // the list. 2 Remove groceries from the list. 0 to quit.");
    // scanner.next();
    // }
    // return Integer.parseInt(scanner.nextLine());
    // }
}
