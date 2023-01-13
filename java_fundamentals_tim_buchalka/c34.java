public class c34 {
    // Write a method named getLargestPrime with one parameter of type int named number. 

    // If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.

    // The method should calculate the largest prime factor of a given number and return it.
    public static void main(String[] args) { 
        // System.out.println(getLargestPrime (21)); //should return 7 since 7 is the largest prime (3 * 7 = 21)
        // System.out.println(getLargestPrime (217)); // should return 31 since 31 is the largest prime (7 * 31 = 217)
        // System.out.println(getLargestPrime (0)); //should return -1 since 0 does not have any prime numbers
        // System.out.println(getLargestPrime (55)); // should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
        // System.out.println(getLargestPrime (-1)); // should return -1 since the parameter is negative
        // System.out.println(getLargestPrime (60)); 


    }

    public static int getLargestPrime(int num) {
        int result = -1;

        //0 and 1 aren't primes and can't contain them
        if (num > 1) {
            //2 is a prime, a prime factor for itself so return before loop
            if (num == 2) {
                result = 2;
            } else {

                //Key Logic: If you find the lowest factor, you can find the highest using it.
                //Once you've found the highest, check if it's a prime
                //Example -> 
                for (int i = 2; i < num; i++) {

                    //32 - if there's no remainder, it's the lowest factor
                    if (num % i == 0){

                        //Use i to divide num, and get the highest number (num / i)
                        //Then use highest number as new value of num (num = num / i)
                        num /= i;
                        
                        //Restart a loop on the highest number (line 29)
                        //E.g. num = 55, i = 5 -> num = 11, i = 4 -> loop against 11 
                        //(i will loop up to 11 because 11 is a prime, no remainder so loop will finish)
                        i--; //i - 1
                    }
                    
                }
                return num;
            }    
        }
        return result;
    }

    //Note: Andrew wouldn't recommend this approach in a business context because
    //a linter would block a for loop that changes it's own condition.
    //He recommended a recursive solution as it's more readable and easier to use.

    //See c34extra.java for recursive solutions.
}
