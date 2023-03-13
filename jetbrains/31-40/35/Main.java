import java.util.*;

/* Check the Date
 * Write a program that uses regular expressions to check whether the input date
 * is valid.
 * The input date can be in any of the two formats: yyyy-mm-dd or dd-mm-yyyy.
 * The year must be 19yy or 20yy. - /. symbols can be used as splitters.
 * 
 * dd from 01 to 31
 * mm from 01 to 12
 * 
 * For a given string output Yes if this string is a valid date, otherwise
 * output No.
 * 
 * Guide: https://www.baeldung.com/java-date-regular-expressions
 */

class Date {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String date = scn.nextLine();
        testRegex(date);
    }

    public static void testRegex(String testString) {
        String dateRegexKR = "^((19|2[0-9])[0-9]{2})[\\.-/](0[1-9]|1[012])[\\.-/](0[1-9]|[12][0-9]|3[01])$|^(0[1-9]|[12][0-9]|3[01])[\\.-/](0[1-9]|1[012])[\\.-/]((19|2[0-9])[0-9]{2})";
        if (testString.matches(dateRegexKR)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
