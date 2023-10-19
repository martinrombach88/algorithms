package insertion_sort;

public class AlgoExpertInsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
  public static int[] insertionSort(int[] array) {
    // Write your code here.
    for (int i = 0; i < array.length; i++) {
      
      //inner array uses current i as a start point
      int j = i;

      //while inner array's j greater than 0 (can't compare
      // array[0] with array[0]), and j is smaller than previous
      //number that we want to swap for
      while (j > 0 && array[j] < array[j-1]) {

        //swap the value of j and j-1
        swap(j, j-1, array);
        
        //set j to minus 1, which instantly negates
        //the condition and continues to next iteration
        j-=1;
      }

  
    } 
        return array;
  }

  public static void swap(int i, int j, int[] array) {
      //use a temp to swap without overwriting
      int temp = array[i];
      array[i] = array[j];
      array[j] = temp;
  }

}
