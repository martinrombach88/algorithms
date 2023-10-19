package binary_search;

public class AlgoExpertBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] test = new int([0, 1, 21, 33, 45,45, 61, 71,72,73]);

	}
  public static int binarySearch(int[] array, int target) {
	    int min = 0;
	    int max = array.length - 1;
	   

	    while (min <= max) {
	      int guess = (max + min) / 2;
	      if (array[guess] == target) {
	        return guess;
	      }
	      if(array[guess] < target) {
	        min = guess + 1;
	      }
	      if(array[guess] > target) {
	        max = guess -1;
	      }
	    }
	    return -1;
	  }
}
