package binary_search;

public class AlgoExpertBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] test = new int([0, 1, 21, 33, 45,45, 61, 71,72,73]);
		int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 
		  			41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		int t = 73;
		System.out.println("t: " + 73);
		
	    int min = 0;
	    int max = primes.length - 1;
	    int guess = (max + min) / 2;
	   System.out.println(guess);
	    
	    while (min < max) {
	      if (primes[guess] == t) {
	    	  System.out.print(t + " is at " + guess);
	      }
	      if(primes[guess] < t) {
	    	 System.out.println();
	        min = guess + 1;
	      }
	      if(primes[guess] > t) {
	        max = guess -1;
	      }
	    }
	    System.out.println( -1);
	  
	}
	
}
