import java.util.Scanner;

class Main {
    //Goal: If n and m are NEVER next to one another in the user input array, return true.

    //Example 
    // 10
    // 3 4 5 6 3 4 6 4 4 8
    // 5 8 -> 5 and 8 are not next to each other so returns true

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String[] elems = scanner.nextLine().split(" ");
        String[] nAndM = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nAndM[0]);
        int m = Integer.parseInt(nAndM[1]);
        boolean neverNextTo = true;


        for (int i = 0; i < length - 1; i++) {
            if (Integer.parseInt(elems[i]) == n && Integer.parseInt(elems[i + 1]) == m || 
                Integer.parseInt(elems[i]) == m && Integer.parseInt(elems[i + 1]) == n) {
                neverNextTo = false;
            } 
        }
        System.out.println(neverNextTo);
    }
}