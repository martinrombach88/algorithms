import java.util.Scanner;

//PSEUDO
//Input will call the scanner.nextline.split() thing several times over.
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] lenStr = scanner.nextLine().split(" ");
        int[] lengths = arrayConverter(lenStr);
        String[][] rowStr = new String[lengths[0]][];
        for (int i = 0; i < lengths[0]; i++) {
            rowStr[i] = scanner.nextLine().split(" ");
        }
        for (String[] row : rowStr) {
            for (String num : row) {
                System.out.println(num);
            }
        }
//        int[] rows = arrayConverter(rowStr);
//        for (int num : lengths) {
//            System.out.println(num);
//        }
//        for (int num : rows) {
//            System.out.println(num);
//        }

    }

    public static int[] arrayConverter(String[] array) {
        int[] intArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            intArray[i] = Integer.parseInt(array[i]);
        }
        return intArray;
    }
}