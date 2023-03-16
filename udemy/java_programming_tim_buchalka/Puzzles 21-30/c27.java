public class c27 {
//     Shared Digit
// Write a method named hasSharedDigit with two parameters of type int. 

// Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.

// The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23)); //→ should return true since the digit 2 appears in both numbers
        System.out.println(hasSharedDigit(9, 99)); //→ should return false since 9 is not within the range of 10-99
        System.out.println(hasSharedDigit(15, 55)); //→ should return true since the digit 5 appears in both numbers

    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 > 10 && num2 > 10 && num1 < 100 && num2 < 100) {
            int breakNum1 = num1;
            int breakNum2 = num2;
            int lastDig1 = 0;
            int lastDig2 = 0;
            int currDig1 = 0;
            int currDig2 = 0;
            while (breakNum1 > 0 && breakNum2 > 0) {
                currDig1 = breakNum1 % 10;
                currDig2 = breakNum2 % 10;
                if (currDig1 == currDig2 || currDig1 == lastDig2 || currDig2 == lastDig1) {
                    return true;
                } else {
                    lastDig1 = currDig1;
                    lastDig2 = currDig2;
                    breakNum1 = breakNum1 / 10;
                    breakNum2 = breakNum2 / 10;
                }
            }
            
        }
        
        return false;
    }

}
