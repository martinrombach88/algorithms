public class Main {
    // Four Strings

    /*
     * You're given four strings and four regexes.
     * Mark the matching regexes and strings.
     */

    public static void main(String[] args) {
        /*
         * Regex break down:
         * regex 1: a, 1 or more b, a //tests 2, 3, 4 are true
         * regex 2: a, 0 or more b, a //all tests are true
         * regex 3: a, between 0 and 3 b, a //tests 1, 2, 3 are true
         * regex 4: a, 3 or more b, a //tests 3 and 4 are true
         */
        String regex1 = "ab+a";
        String regex2 = "ab*a";
        String regex3 = "ab{0,3}a";
        String regex4 = "ab{3,}a";
        String[] tests = { "aa", "aba", "abbba", "abbbbba" };

        testRegex(regex1, tests);
        testRegex(regex2, tests);
        testRegex(regex3, tests);
        testRegex(regex4, tests);
    }

    public static void testRegex(String regex, String[] tests) {
        for (int i = 0; i < tests.length; i++) {
            System.out.println(regex + " = " + tests[i] + " ? " + tests[i].matches(regex));
        }

        // Syntax - String.matches(regex)
    }
}