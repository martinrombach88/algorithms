using System;
  static int[] SmallestDifference(int[] arrayOne, int[] arrayTwo) {
    //sort both
    //iterate through both arrays from start
    //check if i in a1 bigger than i in a2
    //increment whichever is smaller on either array
    //why? -> if there's a difference, anything bigger has a bigger
    //difference and can be ignored (and vice versa)
    //alternate > < tests, and move the pointer each time
      
    int[] result = new int[2];
    int d = Int32.MaxValue; //smallest

    //best to run a temp outside a while. this slowed you down a lot.
    int c = Int32.MaxValue; //current

    Array.Sort(arrayOne);
    Array.Sort(arrayTwo);
    int i = 0;
    int j = 0;

    while (i < arrayOne.Length && j < arrayTwo.Length) {
        int ai = arrayOne[i];
        int aj = arrayTwo[j];

        if (ai > aj) {
            c = ai - aj;
            j++;
        }
        if (aj > ai) {
            c = aj - ai;
            i++;
        }
        if (ai == aj) {
            return new int[] { ai, aj};
        }
        
        if (c < d) {
            //updating temp values.
            d = c;
            result = new int[] {ai, aj};
        }
        //you can't use absolute difference, as it doesn't
        //allow the switch between > and <.
        
        //Console.WriteLine("i= " + i + " ai= " + ai);
        //Console.WriteLine("j= " + j + " aj= " + aj);

    }

    return result;
  }


  int[] arrayOne = [-1, 5, 10, 20, 28, 3];
  int[] arrayTwo = [26, 134, 135, 15, 17];

  Console.WriteLine(SmallestDifference())
