public class c25 {
//  First And Last Digit Sum
// Write a method named sumFirstAndLastDigit with one parameter of type int called number. 

// The method needs to find the first and the last digit of the parameter number passed to the method, using a loop and return the sum of the first and the last digit of that number.

// If the number is negative then the method needs to return -1 to indicate an invalid value.
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(125)); //6
    }

    public static int sumFirstAndLastDigit(int num) {
        //Negative results ignored
        int result = -1;

        int breakNum = num;
        //Last digit taken immediately
        int lastDigit = num % 10;
        int firstDigit = 0;
        

        //First digit taken at the end of the loop (overwrites until correct)
        while(breakNum != 0) {
            //Get last digit from current iteration and overwrite
            firstDigit = breakNum % 10;
            breakNum = breakNum / 10;
        }

        if (num >= 0) {
            result = firstDigit + lastDigit;
        }
        return result;
    }
}
