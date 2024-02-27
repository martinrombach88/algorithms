using System;
using System.Collections.Generic;
using System.Linq;
//solution 1 -> three for loops (he says at the start you can, so try)
//non optimal and terrible big 0 but does work

//note -> you can sort the whole array instead of the list with Array.Sort(array)
static List<int[]> ThreeNumberSum(int[] array, int targetSum) {
    //sort the array
    //loop one = number 1, compare against number 2
    //loop two = number 2, compare against number 3
        //for i, j, k -> if i + j + k = target sum, log it 
    Array.Sort(array);
    List<int[]> sums = new List<int[]>();

    for (int i = 0; i < array.Length; i++) {
        int ai = array[i];
        for (int j = 0; j < array.Length; j++) {
            int aj = array[j];
            for (int k = 0; k < array.Length; k++) {
                int ak = array[k];

                if (ai+aj+ak == targetSum && ai != aj && ai != ak && aj != ak) {
                    int[] s = {ai, aj, ak};
                    Array.Sort(s);

                    //sums.Contains(s) -> this check always returns false
                    //what does that teach us about Lists / Arrays in C#?
                    /*
                    s and sums[i] are different arrays, and changes 
                    to one won't be reflected in the other.

                    However using LINQ's SequenceEqual, 
                    you can compare the contents of two sequences:

                    */
                    
                    //if any of the sequences in sums DO NOT equal s
                    if (!sums.Any(contents => contents.SequenceEqual(s))) {
                          sums.Add(s);
                    };
                    //another loop? is the big 0 n^4?
                }
            }
        }
     }
    
    return sums;
  }



//expected [[-8 2 6] [-8, 3, 5], [-6, 1, 5]]
int[] array = {12, 3, 1, 2, -6, 5, -8, 6};
int target = 0;
List<int[]> result = ThreeNumberSum(array, target);

foreach (int[] r in result) {
    Console.WriteLine($"Result {r[0]} {r[1]} {r[2]}");
}

//To do: sorting (although best wait for the optimal solution to learn that)