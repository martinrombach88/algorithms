package binary_search;

public class BinarySearch {
	
	
	public static int runBinarySearch(int[] array, int target) {
		int min = 0;
		int max = array.length - 1;
		int guess;
		
		while (min <= max) {
			guess = Math.round((min+max) / 2);
			
			if (array[guess] == target) {
				return guess;
			} else if (array[guess] < target) {
				min = guess + 1;
				
			} else {
				max = guess - 1;
			}
		}
		return -1;
		
	}
	
	/*
	 * 		console.log(33, 'is at index', binarySearch([0, 1, 21, 33, 45,45, 61, 71,72,73], 33)); //3

		console.log(73, 'is at index', binarySearch([2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 
		    41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97], 73)); //3
	 * 
	 * 
	 */
}
