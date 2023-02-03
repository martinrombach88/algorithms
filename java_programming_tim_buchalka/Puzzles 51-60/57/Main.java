import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // No output to show - run the code and enter ints for results.
        // Validation beyond the scope of the challenge.
        System.out.println("Minimum value: " + findMin(readIntegers()));
    }

    public static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a series of integers separated by commas.");
        String[] stringArray = scanner.nextLine().split(",");
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            // intArray[i] = Integer.parseInt(stringArray[i]);
            // Tim chained .trim() onto the stringArray. This takes care of white spaces for
            // validation.
            intArray[i] = Integer.parseInt(stringArray[i].trim());
        }
        System.out.println("You made this array: " + Arrays.toString(intArray));
        return intArray;
    }

    public static int findMin(int[] argArray) {
        // Important -> i < argArray.length means 0 based ending. <= would give an
        // error.
        Arrays.sort(argArray);
        return argArray[0];
    }
}
