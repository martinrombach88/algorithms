public class c30 {
    // Greatest Common Divisor
    // Write a method named getGreatestCommonDivisor with two parameters of type int named first and second. 
    // If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
    // The method should return the greatest common divisor of the two numbers (int).
    // The greatest common divisor is the largest positive integer that can fully divide each of the integers (i.e. without leaving a remainder).

    // For example 12 and 30:
    
    // 12 can be divided by 1, 2, 3, 4, 6, 12
    // 30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30
    // The greatest common divisor is 6 since both 12 and 30 can be divided by 6, and there is no resulting remainder.

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12, 30)); //6
        System.out.println(getGreatestCommonDivisor(10, 35)); //5
    }

    public static int getGreatestCommonDivisor(int num1, int num2) {
        int result = -1;
        if (num1 >= 10 && num2 >= 10) {
            int i = 1;
            int commonDiv = 0;
            while (i <= num1 || i <= num2) {
                if (num1 % i == 0 && num2 % i == 0) {
                    commonDiv = i;
                } 
                i++;
            }
            if (commonDiv > 0) {
                result = commonDiv;
            }
        }
        return result;
    }
}
