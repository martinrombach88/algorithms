public class c34helper {
    public static void main(String[] args) {
        //Is Prime
        System.out.println(isPrime(11)); //true
        System.out.println(isPrime(55)); //false
        System.out.println(isPrime(6)); //false
        System.out.println(isPrime(2)); //true

        //highestPrime
        System.out.println(getLargestPrime(55)); //11
        System.out.println(getLargestPrime(217)); //31
        System.out.println(getLargestPrime(45));
    }
    //Key concept - Highest Common Factor - if it's a prime, the highest common factor is the number itself.
    //3 = 3 (prime), 55 = 11 (not prime), 11 = 11 (prime)



    public static boolean isPrime(int n) {
        //2 is a prime, but can't be checked
        if (n == 2) {
            return true;
        //If a number is even it's not a prime
        } else if (n % 2 == 0){
            return false;
        }  

        //After initial checks, call helper function to find the highest factor of the number.
        //---> Line 32
        int factor = findHcf(n);

        //If the factor is the number itself, it's a prime.
        if (factor == n) {
            return true;
        } else {
            return false;
        }

    }
    
    public static int findHcf(int n) {
        //To find the highest factor, find the lowest, then divide n by the lowest
        boolean foundLowFactor = false;

        //Here result is n. If the while loop below changes the value of result,
        //i.e. n has divisors
        //then n is not a prime.
        int result = n;
        int i = 2;

        while (!foundLowFactor && i < n) {
            //Find the lowest factor
            if (n % i == 0) {
                //Divide n by it to get the highest factor
                result = n / i;
                foundLowFactor = true;
            }
            i++;
        }
        return result;
    }


    //Using a helper function to accomplish the for loop result
    public static int getLargestPrime (int n){
        if (n < 2) {
            return -1;
        }

        if (isPrime(findHcf(n))) {
            return findHcf(n);
        } else {
            int i = findHcf(n);
            while(!isPrime(findHcf(i))) {
                i = findHcf(i);
            } 
            return i;
        }
    }
}
