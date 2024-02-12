using System;
using System.Collections;


  static int[] TwoNumberSum(int[] array, int targetSum) {
    //make hash table
    //save each value in hash table as true
    //test if target sum - i = something in the hashtable

    Hashtable h = new Hashtable();
    //key = value : value = true
    
    for (int i = 0; i < array.Length; i++) {
       int x = array[i];
       //targetsum - x existing would mean that the target sum can be made
       int y = targetSum - x;
       // if hash contains y, return array below
       if (h.ContainsKey(y)) {
           return new int[2]{x, y};
       } else {
        //add key of current to hash table
         h.Add(x, true);
        } 
    }
    //print hashtable


    return new int[0];
  }

int[] result = TwoNumberSum([3, 5, -4, 8, 11, 1, -1, 6], 10);
// foreach (int r in result) {  
//     Console.WriteLine(r);
// }

//hash table print
    // foreach(DictionaryEntry p in h) {
    //     Console.WriteLine((int) p.Key);
    //  }