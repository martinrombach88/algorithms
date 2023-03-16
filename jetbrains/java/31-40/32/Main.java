public class Main {
    // Match the Regex

    /*
     * Take a look at this regex with quantifiers: 0\\.[0-9]{2}9{0,2}5*.
     * 
     * Which strings match it? Check all that apply.
     */

    public static void main(String[] args) {
        String regex = "0\\.[0-9]{2}9{0,2}5*";
        /*
         * Regex break down:
         * 0
         * . (escaped version, the character)
         * 2 numbers between 0-9
         * Between 0 and 2 occurrences of the number 9
         * 0 or more occurrences of the number 5
         */

        String test1 = "0.129955"; // true
        String test2 = "0.125"; // true
        String test3 = "0.1295"; // true
        String test4 = "0.1299"; // true
        String test5 = "0.129995"; // false

        System.out.println(test1.matches(regex));
        System.out.println(test2.matches(regex));
        System.out.println(test3.matches(regex));
        System.out.println(test4.matches(regex));
        System.out.println(test5.matches(regex));
    }
}