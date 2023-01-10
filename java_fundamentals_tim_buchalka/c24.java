public class c24 {
    //Palindrome number
    // Write a method called isPalindrome with one int parameter called number.
    // The method needs to return a boolean.
    // It should return true if the number is a palindrome number otherwise it should return false. 
    
    //Logic:
    // Extract the last digit of the given number by performing the modulo division (remainder). 
    // Store the last digit to some variable say lastDigit = num % 10. 
    // Increase the place value of reverse by one.
    // To increase place value multiply the reverse variable by 10 e.g. reverse = reverse * 10.
    // Add lastDigit to reverse. 
    // Since the last digit of the number is processed, remove the last digit of num. To remove the last digit divide number by 10. 
    // Repeat steps until number is not equal to (or greater than) zero. 

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221)); //→ should return true
        System.out.println(isPalindrome(707)); // → should return true
        System.out.println(isPalindrome(11212)); //→ should return false because reverse is 21211 and that is not equal to 11212.

    }
    //Pseudo
    //

    public static boolean isPalindrome(int num) {
        int resultNum = 0;
        int breakNum = num;
        int lastDigit = 0;
    
        while (breakNum != 0) {
            //Get last digit from current iteration
            lastDigit = breakNum % 10;

            //breakable version of num is divided by 10, creating a new last digit
            breakNum = breakNum / 10;

            //Result is multiplied by 10 to give space for new last digit
            resultNum = resultNum * 10;

            //Last digit is added to result 
            resultNum += lastDigit;

        }
        
        if (resultNum == num) {
            return true;
        }
        return false;
    }
}