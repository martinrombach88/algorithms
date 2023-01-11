public class c32 {
//     Number To Words
// Write a method called numberToWords with one int parameter named number.
// The method should print out the passed number using words for the digits.
// If the number is negative, print "Invalid Value".

//Write another method called reverse which reverses the number
// Extract the last digit of the given number using the remainder operator. 
// Convert the value of the digit found in Step 1 into a word. 

// Write another method called getDigitCount; it should have one int parameter called number and return the count of the digits in that number. If the number is negative, return -1 to indicate an invalid value.

//NOTE: Do not use arrays - instead use a switch for printing.
//Naturally you made an array of the words, String[] words = {"Zero", "One", "Two"...}
//Stay within the restrictions of the task. (Eddie's Example is good structure, but don't copy)

//PSEUDO:
//1. Call reverse in numberToWords and save variable
//2. Call getDigitCount in numberToWords and save variable
//3. Loop over number, using saved variables for structure and return words from switch

    public static void main(String[] args) {
        //Method Testing 

        //numberToWords
        System.out.println("Number to words:");
        System.out.println("123:");
        numberToWords(123);//should print "One Two Three".
        System.out.println("1010:");
        numberToWords(1010);//should print "One Zero One Zero".  
        System.out.println("1000:"); 
        numberToWords(1000); //should print "One Zero Zero Zero".  
        System.out.println("-12:");  
        numberToWords(-12); //should print "Invalid Value" since the parameter is negative.

        //reverse
        System.out.println("reverse:");
        System.out.println(reverse(-121)); // should return -121
        System.out.println(reverse(1212)); // should return 2121
        System.out.println(reverse(1234)); // should return 4321
        System.out.println(reverse(100)); //should return 1

        //getDigitCount
        System.out.println("getDigitcount:");
        System.out.println(getDigitCount(0)); //should return 1 since there is only 1 digit
        System.out.println(getDigitCount(123)); //should return 3
        System.out.println(getDigitCount(-12)); //should return -1 since the parameter is negative
        System.out.println(getDigitCount(5200)); //should return 4 since there are 4 digits in the number

    }


    public static void numberToWords(int n) {
        //Condition to blog negative - You don't need brackets for a 1 line 'if' condition
        if (n < 0) System.out.println("Invalid Value");

        //Call reverse and digitCount here to set up for switch
        int length = getDigitCount(n);
        int reversed = reverse(n);

            //Switch goes here in loop, returns number words
            for (int i = 0; i < length; i++) {
                int last = reversed % 10;
                switch(last){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                reversed /= 10;
            }
    }


    //The reverse function should also reverse negative numbers
    public static int reverse(int n) {
        int result = 0;
        int last = 0;

        //Notes: Condition is operating on the temporary value of n.
        //Remember that n is still available outside the scope in its original value.
        //Don't make new versions of n when n will do.
        
        //While original n is greater than/less than 0 (less than if negative)
        while (n != 0) {
            //Take last digit
            last = n % 10;
            //Multiply result by 10 (first iteration will be 0 * 10, so no worries for first value being too big)
            result *= 10;
            //Result adds last digit to end. On first iteration (0 * 10) result becomes last digit.
            result += last;
            //Temporary n divided by 10, ready for next iteration
            n /= 10; //(n = n / 10)
        }
        return result;
    }

    
    public static int getDigitCount(int n) {
        
        int result = 0;
        if (n == 0) {
            result = 1;
        } else if (n < 0) {
            result = -1;
        } else {
            //Same logic as reverse (divide until 0), but increment result by 1.
            while (n > 0) {
                    result ++;
                    n /= 10;
                }
                
        }
        return result;
        

    }
    

}