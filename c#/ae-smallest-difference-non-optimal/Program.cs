using System;

static int[] SmallestDifference(int[] arrayOne, int[] arrayTwo) {
    // Write your code here.
    //Naive solution -> two for loops
    int d = 999;
    int[] result = new int[2];
    Array.Sort(arrayOne);
    Array.Sort(arrayTwo);
      
    for (int i = 0; i < arrayOne.Length; i++) {
        for (int j = 0; j < arrayTwo.Length; j++) {
            int a1 = arrayOne[i];
            int a2 = arrayTwo[j];
            if (Math.Abs(a1 - a2) < d) {
                d = Math.Abs(a1 - a2);
                result[0] = a1;
                result[1] = a2;
            }
        }
    }

      
    return result;
}

int[] a1 = [-1, 5, 10, 20, 28, 3];
int[] a2 = [26, 134, 135, 15, 17];
int[] result = SmallestDifference(a1, a2);
foreach (int i in result) {
    Console.Write(i + " ");
}
Console.WriteLine("");
//expected [28, 26];





