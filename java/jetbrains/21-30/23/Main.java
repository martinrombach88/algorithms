import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lenStr = scanner.nextLine().split(" ");
        int[] lengths = arrayConverter(lenStr);
        String[][] userMatrix = buildMatrix(lengths, scanner);
        turnMatrix(userMatrix, lengths);
    }

    public static int[] arrayConverter(String[] array) {
        int[] intArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            intArray[i] = Integer.parseInt(array[i]);
        }
        return intArray;
    }

    public static String[][] buildMatrix(int[] lengths, Scanner scanner) {
        String[][] matrix = new String[lengths[0]][lengths[1]];
        for (int i = 0; i < lengths[0]; i++) {
            matrix[i] = scanner.nextLine().split(" ");
        }
        return matrix;
    }

    public static void turnMatrix(String[][] paramMatrix, int[] lengths) {
        String[][] returnMatrix = new String[lengths[1]][lengths[0]];
        int rowCount = 0;

        for (int i = 0; i < returnMatrix.length; i++){
            String[] tempArray = new String[lengths[0]];

            for (int j = 0; j < paramMatrix.length; j++) {
                int endpoint = paramMatrix.length -1;
                if (endpoint - j > 0) {
                    tempArray[endpoint - j] = paramMatrix[j][rowCount];
                } else {
                    tempArray[0] = paramMatrix[j][rowCount];
                }
            }
            returnMatrix[i] = tempArray;
            rowCount ++;
        }
            for (String[] row : returnMatrix) {
                for (String num : row) {
                    System.out.print(num + " ");

                }
                System.out.println();
            }
        }
}