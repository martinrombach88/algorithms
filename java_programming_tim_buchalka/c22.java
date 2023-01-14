public class c22 {
    public static void main(String[] args) {
        //create a method called isEvenNumber - int param, return true if param is even.
        //use a while loop to check a range of numbers for evenness, printing each number.

        //Bonus: Record total value of the first 5 numbers and break.

        System.out.println(totalFiveEven(1, 20));

    }

    public static int totalFiveEven(int min, int max) {
        int i = min;
        int evenCount = 0;
        int oddCount = 0;
        while(i <= max) {
            if (isEvenNumber(i)){
                // System.out.println(i + " is even.");  
                evenCount++;
            } else {
                oddCount++;
            //Extra requirement -> break once 5 numbers are found.
            }// } else if (evenCount == 5) {
            //     break;
            // }
            i++;
        }
        System.out.println("Odd: " + oddCount + " Even: " + evenCount);
        return evenCount;
        
        //alt
        // while (i <= 20) {
        //     i++;
        //     if (!isEvenNumber(i)){
        //         continue;
        //     }
        //     System.out.println(i + " is even");
        // }
    }

    public static boolean isEvenNumber(int num) {
        if (num % 2 == 0) {
            return true;
        }

        return false;
    }
}