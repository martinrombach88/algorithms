using System;


static void TransposeMatrix(int[,] matrix) {
    //height -> get length 0 = outer most array of matrix in c#
    int h = matrix.GetLength(0);
    //width -> length of arrays inside the matrix
    int w = matrix.GetLength(1);
    //result matrix is defined before hand using GetLength calls
    int[,] rm = new int[w,h];

      for (int i = 0; i < h; i++)
        {
            for (int j = 0; j < matrix.GetLength(1); j++)
            {
                //rows are columns and columns are rows
                  rm[j, i] = matrix[i, j];
            }
        }
      //how to print a matrix in c#
          for (int i = 0; i < rm.GetLength(0); i++)
        {
            for (int j = 0; j < rm.GetLength(1); j++)
            {
                Console.Write(rm[i,j] + "\t");
            }
            Console.WriteLine();
        }
      
    //return rm;
  }

int[,] matrix = new int[
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
];

  TransposeMatrix(matrix);