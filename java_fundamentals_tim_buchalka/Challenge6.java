public class Challenge6 {
// Leap Year Calculator
// Write a method isLeapYear with a parameter of type int named year.

// The parameter needs to be greater than or equal to 1 and less than or equal to 9999.

// If the parameter is not in that range return false.

// Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is a leap year, otherwise return false.

// Any year that is evenly divisible by 4 is a leap year: for example, 1988, 1992, and 1996 are leap years.

// However, there is still a small error that must be accounted for. To eliminate this error, the Gregorian calendar stipulates that a year that is evenly divisible by 100 (for example, 1900) is a leap year only if it is also evenly divisible by 400.

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600)); // false
        System.out.println(isLeapYear(1600)); //true
        System.out.println(isLeapYear(2017)); //false
        System.out.println(isLeapYear(2000)); //true
        System.out.println(isLeapYear(1800)); //false
        System.out.println(isLeapYear(1924)); //true
    }

    public static boolean isLeapYear(int year) {
        boolean leapYear = false;

        //If year is within 1-9999
        if (year >= 1 && year <= 9999) {

            //If year divides by 4 evenly
            if (year % 4 == 0) {

                //If year is a century, divides by 400 test begins
                if (year % 100 == 0) {

                    //If year divides by 400 evenly
                    if (year % 400 == 0) {
                    leapYear = true;
                    }
                    //If year isn't a century, 400 test not needed
                } else {
                    leapYear = true;
                }
            }
        }
        return leapYear;
    }
}
