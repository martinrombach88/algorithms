import java.util.Scanner;

class Main {
    /* Swap the Columns 
    Goal:
    Given a two-dimensional array (matrix) and the two numbers: i and j. Swap the columns with indexes i and j within the matrix.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];
        int[][] newMatrix = new int[n][m];

        //Below: create a turned matrix from previous problem
//        int[][] newMatrix = new int[m][n];

        //This creates a matrix from n/m. A helper function
        //would be createMatrix(int n, int m);
        for (int a = 0; a < matrix.length; a++) {
            for (int b = 0; b < matrix[a].length; b++) {
                matrix[a][b] = scanner.nextInt();
            }
        }

        //These two columns must be swapped.
        int i = scanner.nextInt();
        int j = scanner.nextInt();

//        System.out.println("Pre swap");
//        printMatrix(matrix);

        //What does the nested loop do?
        //Populate new matrix, swapping the columns as it's built

        for (int a = 0; a < matrix.length; a++) {
            int temp1 = 0;
            int temp2 = 0;
            for (int b = 0; b < matrix[a].length; b++) {
                //1. If index matches i or j, save value into temp
                temp1 = matrix[a][i];
                temp2 = matrix[a][j];

                //2. temp1 goes in at j, temp2 goes in at i.
                newMatrix[a][j] = temp1;
                newMatrix[a][i] = temp2;

                //3. populate the rest with orig matrix
                if (b != j && b != i) {
                    newMatrix[a][b] = matrix[a][b];
                }
            }
        }

//        System.out.println("Post swap");
        printMatrix(newMatrix);



    }

    public static void printMatrix (int[][] matrix) {
        for (int[] array : matrix) {
//            System.out.println(Arrays.toString(num));
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}