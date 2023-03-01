import java.util.Arrays;
import java.util.Scanner;

//After Solutions Check:
//You could have made the matrix into an int initially and only worked in it.
//You didn't need helper functions.
//The best solution uses scanner.nextInt(); https://hyperskill.org/learn/step/1927#solutions-485864 
//It simplifies the code to just the for loops.

/*PSEUDO
    1. Construct the original matrix from the user input -
    2. Turn the matrix, using the length of the matrix (number of arrays in the matrix)
    as a length for the arrays in the new matrix.

 */
class MainWithComments {
    public static void main(String[] args) {
        // put your code here
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

        /*
         * 1. Lengths are correct
         * 2. Placement - building a loop condition that creates the following
         * Matrix 2 Array 1 = M1A3[0], M1A2[0] M1A1[0]
         * Matrix 2 Array 2 = M1A3[1], M1A2[1] M1A1[1]
         * Matrix 2 Array 3 = M1A3[2], M1A2[2] M1A1[2]
         * Matrix 2 Array 4 = M1A3[3], M1A2[3] M1A1[3]
         * 
         * returnMatrix[i] and paramMatrix[i] are arrays
         * 
         * goal is to put paramMatrix[0][0], [1][0], [2][0], [3][0] into returnMatrix[0]
         * then keep going, put paramMatrix[0][1], [1][1], [2][1], [3][1] into
         * returnMatrix[1]
         * 
         * for int i = 0; i < paramMatrix.length; i++
         * put paramMatrix[i][count] into returnMatrix[i]
         * would you need another loop for returnMatrix i?
         * 
         * Sample:
         * 3 4
         * 11 12 13 14
         * 21 22 23 24
         * 31 32 33 34
         * Output:
         * 31 21 11
         * 32 22 12
         * 33 23 13
         * 34 24 14
         * 
         * current received output: j++ or j-- this still happens why?
         * [11, 21, 31]
         * [12, 22, 32]
         * [13, 23, 33]
         * [14, 24, 34]
         */

        // You need to wrap this and increment rowCount outside it

        // for (i = 0, i < returnMatrix.length; i++ {
        // tempArray init
        for (int i = 0; i < returnMatrix.length; i++) {
            String[] tempArray = new String[lengths[0]];

            for (int j = 0; j < paramMatrix.length; j++) {
                int endpoint = paramMatrix.length - 1;
                if (endpoint - j > 0) {
                    tempArray[endpoint - j] = paramMatrix[j][rowCount];
                } else {
                    tempArray[0] = paramMatrix[j][rowCount];
                }

                // push into temp array at point j
                // Arrays go in reverse order but print in natural order
                // index for tempArray cannot be 0 and incremented normally,
                // it must be incremented in the opposite order to j.

            }
            returnMatrix[i] = tempArray;
            rowCount++;
        }
        for (String[] row : returnMatrix) {
            System.out.println(Arrays.toString(row));
        }

    }
}