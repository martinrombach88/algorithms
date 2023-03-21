import java.util.Arrays;
import java.util.Random;

public class Main {
//    Create a program using arrays, that sorts a list of integers,
//    in descending order.  Descending order means from the highest value to lowest.
//    First, make a random number array. Then use a method to sort the array in reverse.

    public static void main(String[] args) {

        int[] sampleArray = getRandomArray(10);
        System.out.println(Arrays.toString(sampleArray));
        System.out.println(Arrays.toString(sortArray(sampleArray)));
    }

    public static int[] sortArray(int[] array) {
        int[] reverseArray = new int[array.length];
        Arrays.sort(array);
        //Sort by highest value to lowest.

        //1. Create a counter to increment by one in the loop.
        //By creating it outside, it's not affected by the for loop's condition.
        int counter = 0;

        //2. The for loop's condition runs from the end of the array to the start.
        //i-- deletes one at a time, giving the reverse order.
        //Array.length -1 is very important, otherwise you go one above the index length.
        //Greater/equal than 0 avoids adding 0 as a value by accident.
        for (int i = array.length-1; i >= 0; i--) {
            //3. Set the value at the counter index to the value at the array reverse order index
            reverseArray[counter] = array[i];
            //4. Increment counter
            counter++;
        }

        return reverseArray;
    }

    private static int[] getRandomArray(int len) {
        //Here we import the random class / object.
        //Below in the for loop, we call the random class each time.
        //randomArray is an array made up of the random arrays generated
        //on each iteration.

        Random random = new Random();
        int[] randomArray = new int[len];

        for (int i = 0; i < len; i++) {
            //The new random number is created with the nextInt method.
            //Randoms nextInt method returns a random number between 0 and the param.
            randomArray[i] = random.nextInt(100);
        }

        return randomArray;
    }
}
