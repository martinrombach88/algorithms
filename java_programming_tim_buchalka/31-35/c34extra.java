public class c34extra {
    public static void main(String[] args) {
        System.out.println(isPrime(11)); //true
        System.out.println(isPrime(55)); //false
    }

    //To do:
    //1. Build highest common factor program using recursion
    //2. Build the largest prime program

    //Key concept - Highest Common Factor - if it's a prime, the highest common factor is the number itself.
    //3 = 3 (prime), 55 = 11 (not prime), 11 = 11 (prime)

    public static boolean isPrime(int num) {
        if (num % 2 == 0){
            return false;
        }  

        int hcf = 0;
        boolean foundPrime = false;

        //Recursive loop
        while (!foundPrime){
            hcf = findHcf(num);
            if (hcf == num) {
                foundPrime = true;
            } else {
                //Set up for the next iteration
                num = hcf; 
            }
        }

        return foundPrime;
    }
    
    public static int findHcf(int num) {
        //Find the highest common factor of the number

        int result = 0;

        //Use a while loop

        // for (int i = 2; i < num; i++) {
        //     System.out.println("i " + i);
        //     if (num % i == 0) {
        //         result = num / i;
        //         return result;
                
        //     }
        // } 
        System.out.println("result" + result);
        return result;
    }
}
