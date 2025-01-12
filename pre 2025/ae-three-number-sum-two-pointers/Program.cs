using System;
using System.Collections.Generic;
using System.Linq;

static List<int[]> ThreeNumberSum(int[] array, int targetSum) {
    //1. sort
    //2. two pointers, left and right meeting one another
    Array.Sort(array);
    List<int[]> ra = new List<int[]>(); 
    Console.WriteLine("t " + targetSum);
    for (int i = 0; i < array.Length; i++) {
        int l = i+1; //left (index)
        int r = array.Length -1; //right (index, must be -1 due to 0 base)
        int cn = array[i]; //current num (value)

        //two pointers
        while (l < r) {
            //this has to happen first, otherwise l will overlap r
             if ((cn + array[l] + array[r]) == targetSum) {         
                int[] newSum = {cn, array[l], array[r]};
                Console.WriteLine("match:" + newSum[0] + " " + newSum[1]+ " " + newSum[2]);
                ra.Add(newSum);
                l++;
                r--;
            }
            //l value grows while target is larger
            if ((cn + array[l] + array[r]) < targetSum ) {
                l++;
            }
            //r value shrinks while target is smaller
            if ((cn + array[l] + array[r]) > targetSum) {
                r--;
            }

        } 
    }
    return ra;
  }




int[] test = {-8, -6, 1, 2, 3, 5, 6, 12};
/*expected
[
  [-8, 2, 6],
  [-8, 3, 5],
  [-6, 1, 5]
]
*/

ThreeNumberSum(test, 0);