 public class c26 {
//     Even Digit Sum
//     Write a method named getEvenDigitSum with one parameter of type int called number. 
    
//     The method should return the sum of the even digits within the number. 
    
//     If the number is negative, the method should return -1 to indicate an invalid value.
    
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789)); //→ should return 20 since 2 + 4 + 6 + 8 = 20
        System.out.println(getEvenDigitSum(252)); //→ should return 4 since 2 + 2 = 4
        System.out.println(getEvenDigitSum(-22)); // → should return -1 since the number is negative
        System.out.println(getEvenDigitSum(0)); // → should return 0
    } 
    
    public static int getEvenDigitSum(int num) {
        int total = 0;
        int breakNum = num;
        int lastDigit = 0;

        while (breakNum > 0) {
            lastDigit = breakNum % 10;
            if (lastDigit % 2 == 0) {
                total += lastDigit;
            }
            breakNum = breakNum / 10;
        }

        if (num >= 0) {
            return total;
        } else {
            return -1;
        }
    }
}
