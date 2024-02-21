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

int[] line1 = {1, 2, 3};
int[] line2 = {4, 5, 6};
int[] line3 = {7, 8, 9};

// int[,] matrix = new int[4,4];
// matrix[0] = line1;
// matrix[1] = line2;
// matrix[2] = line3;
// TransposeMatrix(matrix);

