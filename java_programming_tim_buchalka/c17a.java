public class c17a {
//     Write a method called printNumberInWord. The method has one parameter number which is the whole number. The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other for any other number including negative numbers. You can use if-else statement or switch statement whatever is easier for you.

// NOTE: Method printNumberInWord needs to be public static for now, we are only using static methods.

//UDEMY not coded properly so if else used. 

    public static void main(String[] args) {
        printNumberInWord(0);
    }
    public static void printNumberInWord(int num) {

            if (num == 0) {
                System.out.println("ZERO");
            } else if(num == 1) {
                System.out.println("ONE");
            } else if(num == 2) {
                System.out.println("TWO");
            } else if(num == 3) {
                System.out.println("THREE");
            } else if(num == 4) {
                System.out.println("FOUR");
            } else if(num == 5) {
                System.out.println("FIVE");
            } else if(num == 6) {
                System.out.println("SIX");
            } else if(num == 7) {
                System.out.println("SEVEN");
            } else if(num == 8) {
                System.out.println("EIGHT");
            } else if(num == 9) {
                System.out.println("NINE");
            } else {
                System.out.println("OTHER");
            }

        };
    }

