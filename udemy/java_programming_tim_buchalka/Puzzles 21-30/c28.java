public class c28 {
//     Last Digit Checker
// Write a method named hasSameLastDigit with three parameters of type int. 

// Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.

// The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }  
    
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (isValid(num1) && isValid(num2) && isValid(num3)) {
            int num1Last = num1 % 10;
            int num2Last = num2 % 10;
            int num3Last = num3 % 10;
            if (num1Last == num2Last || num1Last == num3Last || num2Last == num3Last) {
                return true;
            }
        } 
        
        return false;
    }

    public static boolean isValid(int num) {
        if (num >= 10 && num <= 1000) {
            return true;
        }
        return false;
    }
}
