public class TransposeMatrix {

    public static void main(String[] args) {
    int[][] matrix = {{ 1, 2, 3 }, { 4, 5, 6 }, {7, 8, 9 }};

     System.out.println("Input Matrix:");
    for (int i = 0; i < matrix.length; i++) {
         
        for (int j = 0; j < matrix[i].length; j++) {
            System.out.print(matrix[i][j]);
           
        }
        System.out.println(' ');
    }
    System.out.println(' ');
    //in java you need build the array length initially.
    //java objects are predefined and cannot be increased
    int[][] newM = new int[matrix[0].length][matrix.length];
    
    for (int i = 0; i < matrix[0].length; i++) {
        for (int j = 0; j < matrix.length; j++) {
             newM[i][j] = matrix[j][i];
        }
    }
   System.out.println("Output Matrix:");
        for (int i = 0; i < newM.length; i++) {
         
        for (int j = 0; j < newM[i].length; j++) {
            System.out.print(newM[i][j]);
           
        }
        System.out.println(' ');
    }
    //[ [ 1, 4, 7 ], [ 2, 5, 8 ], [ 3, 6, 9 ] ]
    
}}
