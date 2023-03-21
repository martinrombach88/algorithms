public class Main {
    // Match the Regex 2

    /*
     * You are given a string that represents a number:
     * 44A-88D
     * Which of the following regexes match the string?
     */

    public static void main(String[] args) {
        /*
         * Regex break down:
         * test 0 - letter or num * 3, - , letter, num * 3 -> true
         * test 2 - letter or num * 7 -> false
         * test 3 - non whitespace char * 7 -> true
         * test 4 - num, num, letter or num, whitespace, num, num, letter or num ->
         * false
         * test 5 - num, num, letter or num, not a num or letter, num, num, letter or
         * num -> true
         */
        String testString = "44A-88D";
        String[] tests = { "\\w\\w\\w-\\w\\w\\w", "\\w\\w\\w\\w\\w\\w\\w", "\\S\\S\\S\\S\\S\\S\\S",
                "\\d\\d\\w\\s\\d\\d\\w", "\\d\\d\\w\\W\\d\\d\\w" };

        testRegex(testString, tests);
    }

    public static void testRegex(String testString, String[] tests) {
        for (int i = 0; i < tests.length; i++) {
            System.out.println(testString + " = " + tests[i] + " ? " + testString.matches(tests[i]));
        }

        // Syntax - String.matches(regex) (be careful!)
    }
}