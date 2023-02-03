import java.util.Arrays;

public class Main {
    //Reverse an Array
    public static void main(String[] args) {
        int[] argArray = {1,2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(argArray));
        reverseArray(argArray);
        System.out.println(Arrays.toString(argArray));

    }

    //This is the same function from challenge 56, without the sorting.
    public static void reverseArray(int[] array) {
        int[] reverseArray = new int[array.length];
        int counter = 0;

        for (int i = array.length-1; i >= 0; i--) {
            reverseArray[counter] = array[i];
            counter++;
        }
        System.arraycopy(reverseArray, 0, array, 0, array.length);
    }
//        for (int i = 0; i < array.length; i++) {
//            array[i] = reverseArray[i];
//        }

        //When I wrote a for loop here, it was flagged as a 'manual array copy'.
        //IntelliJ auto generated the working code below:
//        System.arraycopy(reverseArray, 0, array, 0, array.length);
        //It accomplishes the same thing, copying the array.

        //Tim used the copyOf method earlier. However, this doesn't work
        //in reassignment, the array variable isn't recognised.
//        array = Arrays.copyOf(reverseArray, reverseArray.length);

        //Tim accomplishes the same by making a for loop that iterates over
        //the array and swaps i with a temp variable.
    //      for (int i = 0; i < halfLength; i++) {
    //        int temp = array[i];
    //        array[i] = array[maxIndex - i];
    //        array[maxIndex - i] = temp;
    //        System.out.println("--> " + Arrays.toString(array));
    //    }

}
