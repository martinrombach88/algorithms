import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        listPrinter();
    }

    public static void listPrinter() {
        Scanner scanner = new Scanner(System.in);
        //Important - any conditions affecting the while loop's variables should
        //be declared outside the loop!
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
            } else if (num > 2 || num < 0) {
                printList(groceries);
                num = prompt(scanner);
            } else if (num == 1) {
                addGroceries(groceries, scanner);
                printList(groceries);
                num = prompt(scanner);
            } else if (num == 2){
                System.out.println("Remove some groceries from the list.");
                String[] userList = scanner.nextLine().split(",");
                groceries.removeAll(Arrays.asList(userList));
                printList(groceries);
                num = prompt(scanner);
            }
        }
        System.out.println("Exited program.");
    }
//Validation prompt (Beyond Scope - Bonus Challenge for Review)
//    public static int prompt(Scanner scanner) {
//        System.out.println("Save your groceries! Press a number. 1 - Add groceries to the list. 2 Remove groceries from the list. 0 to quit.");
//        while(!scanner.hasNextInt()) {
//            System.out.println("You can only use numbers 0, 1 and 2 in this menu.");
//            System.out.println("Save your groceries! Press a number. 1 - Add groceries to the list. 2 Remove groceries from the list. 0 to quit.");
//            scanner.next();
//        }
//            return Integer.parseInt(scanner.nextLine());
//    }

    public static int prompt(Scanner scanner) {
        System.out.println("Save your groceries! Press a number. 1 - Add groceries to the list. 2 Remove groceries from the list. 0 to quit.");
        return Integer.parseInt(scanner.nextLine());
    }

    public static void printList(ArrayList<String> groceries) {
        System.out.println("Your list is: " + groceries);
    }

    public static void addGroceries(ArrayList<String> groceries, Scanner scanner) {
        System.out.println("Add some groceries to the list.");
        String[] userList = scanner.nextLine().split(",");
        for(int i = 0; i < userList.length; i++) {
            userList[i] = userList[i].trim();
        }
        groceries.addAll(Arrays.asList(userList));
    }

}
