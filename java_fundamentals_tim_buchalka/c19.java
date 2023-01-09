public class c19 {
    //First Three Primes in Range
    //1. Create an 'isPrime' method to calculate a prime
    //2. Create a method called 'countPrimes' that loops of a range of numbers and checks for 
    //the first three primes that occur and print them. The 'countThreePrimes' method takes two ints,
    // a min and a max. Loop and call the isPrime method for every number in range, until you've found
    //3 prime numbers.

    //Bonus - Make another method, 'primesInRange' that returns how many primes between a min and a max
    //In the same way as 'countPrimes'
    public static void main(String[] args) {
        
        countThreePrimes(500, 600); // 503, 509, 521
        primesInRange(500, 600); //14

        // System.out.println("1 is " + (isPrime(1) ? "" : "NOT ") + "a prime number.");
        // System.out.println("2 is " + (isPrime(2) ? "" : "NOT ") + "a prime number.");
        // System.out.println("3 is " + (isPrime(3) ? "" : "NOT ") + "a prime number.");
        // System.out.println("8 is " + (isPrime(8) ? "" : "NOT ") + "a prime number.");
        // System.out.println("17 is " + (isPrime(17) ? "" : "NOT ") + "a prime number.");
        // System.out.println("501 is " + (isPrime(501) ? "" : "NOT ") + "a prime number.");
        // System.out.println("577 is " + (isPrime(577) ? "" : "NOT ") + "a prime number.");
    }

    //Return first three primes in range min - max
    public static void countThreePrimes(int min, int max) {
        int primeCounter = 0;
        for (int i = min; i <= max; i++) {
            if (primeCounter == 3) {
                break;
            }
            if (isPrime(i)) {
                System.out.println(i + " is a prime number.");
                primeCounter ++;
            }
        }
    }

    //Bonus - Total primes in range min - max
    public static void primesInRange(int min, int max) {
        int primeCounter = 0;
        for (int i = min; i <= max; i++) {
            if (isPrime(i)) {
                primeCounter ++;
            }
        }
        System.out.println("There are " + primeCounter + " prime numbers between " + min + " and " + max + ".");
    }

    public static boolean isPrime(int wholeNumber) {
        //Prime - divisible by itself and 1 only.

        //We know 1 is not a prime and 2 is a prime, but we cannot calculate it with the loop.
        //The shortcut below returns true if the number is 2, and false if not.
        if (wholeNumber <= 2) {
            return wholeNumber == 2;
        }


        //We make divider (div) 2 to skip even numbers. Starting by 1 would give us false positives.
        //wholeNumber/2 is to cut out numbers unnecessary to the loop (we're already searching for even numbers.)
        for (int div = 2; div <= wholeNumber /2; div++) {
            if (wholeNumber % div == 0) {
                return false;
            }
        }
        return true;
        
    }
}
