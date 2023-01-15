public class c31 {
    //Perfect Number
    // Write a method named isPerfectNumber with one parameter of type int named number. 
    // If number is < 1, the method should return false.
    // The method must calculate if the number is perfect. If the number is perfect, the method should return true; otherwise, it should return false.

    // What is the perfect number?
    // A perfect number is a positive integer which is equal to the sum of its proper positive divisors. 
    // Proper positive divisors are positive integers that fully divide the perfect number without leaving a remainder and exclude the perfect number itself.

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));//should return true since its proper divisors are 1, 2, 3 and the sum is 1 + 2 + 3 = 6
        System.out.println(isPerfectNumber(28));//should return true since its proper divisors are 1, 2, 4, 7, 14 and the sum is 1 + 2 + 4 + 7 + 14 = 28
        System.out.println(isPerfectNumber(5));//should return false since its only proper divisor is 1 and the sum is 1 not 5
        System.out.println(isPerfectNumber(-1));//should return false since the number is < 1
    }

    public static boolean isPerfectNumber(int num) {
        if (num > 1) {
            int total = 0;
            for (int i = 1; i < num; i++){
                if (num % i == 0) {
                    total += i;
                }
            }
            if (total == num) {
                return true;
            }
        }
        return false;
    }
    
}
//         isPerfectNumber(6); should return true since its proper divisors are 1, 2, 3 and the sum is 1 + 2 + 3 = 6

// isPerfectNumber(28); should return true since its proper divisors are 1, 2, 4, 7, 14 and the sum is 1 + 2 + 4 + 7 + 14 = 28

// isPerfectNumber(5); should return false since its only proper divisor is 1 and the sum is 1 not 5

// isPerfectNumber(-1); should return false since the number is < 1