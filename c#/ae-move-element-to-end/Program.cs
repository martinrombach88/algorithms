using System;
using System.Collections.Generic;

static List<int> MoveElementToEnd(List<int> array, int toMove) {
    //two pointers
    //j at the end, if toMove, move left
    //if i is toMove and j isn't, swap
    
    //while (j > i) 
    //if aj = toMove, j--
    //if ai = toMove and j != toMove, swap and i++
    //need a swap helper

    int i = 0;
    int t = toMove;
    //List = List.Count, Array = Array.Length
    int j = array.Count-1;
    //if array in correct order, don't make changes.
    while (i < j) {

        if (array[i] != t) {
            i++;
        }
        if (array[j] == t) {
            j--;
        }

        if (array[i] == t && array[j] != t) {
            SwapElements(array, i, j);
            i++;
            j--;
        }
        
        // if (array[j] == toMove) {
        // iterate, ignore instance
        //     j--;
        // }
        // if (array[i] != toMove) {
        // iterate, ai = tomove handled by other case
        //     i++;
        // }
        // if ai = tomove, swap ai with array[j]
        // if aj != tomove, do nothing
        
        //where might this logic get stuck?
        //if you only inc/dec on those cases, it loops infinitely. why?
        //array j not = to move isnt handled.
        //array i = to move is not handled.
    }

    
    return array;
}


 static List<int> SwapElements(List<int> array, int startIndex, int endIndex) {
        int temp = array[endIndex];
        array[endIndex] = array[startIndex];
        array[startIndex] = temp;
        return array;
}
List<int> values = new List<int>{2, 1, 2, 2, 2, 3, 4, 2};
foreach (int i in values) {
    Console.Write(i + " ");
}
Console.WriteLine();
MoveElementToEnd(values, 2);
Console.WriteLine("Goal - move all elements that match target to the end of the array");
foreach (int i in values) {
    Console.Write(i + " ");
}
Console.WriteLine();
//Goal - move all elements that match target to the end of the array
//Expected 4 1 3 2 2 2 2 2