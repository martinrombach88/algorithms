package binary_search;

public class Main {
//	console.log(33, 'is at index', binarySearch([0, 1, 21, 33, 45,45, 61, 71,72,73], 33)); //3
//
//	console.log(73, 'is at index', binarySearch([2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 
//	    41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97], 73)); //3
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] random_nums = { 0,1,23,  36, 43, 59, 61, 89, 24, 100};
		
		int result1 = BinarySearch.runBinarySearch(random_nums, 23);
		System.out.println("23 is at index " + result1);
		
		
		int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 
			    41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		
 		int result2 = BinarySearch.runBinarySearch(primes, 73); //20
 		System.out.println("73 is at index " + result2);
	}

}
