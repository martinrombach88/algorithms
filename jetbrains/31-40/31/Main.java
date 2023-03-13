public class Main {
    // Regex Quantifiers - UUID

    /*
     * There is a special string called a universally unique identifier (UUID). It
     * is a 128-bit number used to identify information in computer systems. The
     * identifier has a special format, and this format can be captured in a regular
     * expression. There are different versions of UUID, but we will consider only a
     * regex for the 4th version:
     * 
     * [0-9a-f]{8}-[0-9a-f]{4}-4[0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}
     */

    public static void main(String[] args) {
        String regex = "[0-9a-f]{8}-[0-9a-f]{4}-4[0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}";
        /*
         * Regex break down:
         * numbers 1-9 and letters a to f * 8
         * -
         * numbers 1-9 and letters a to f * 4
         * -
         * 4
         * numbers 1-9 and letters a to f * 3
         * -
         * 8, 9, a or b
         * numbers 1-9 and letters a to f * 3
         * -
         * numbers 1-9 and letters a to f * 12
         * 
         */

        String test1 = "1c1a3de4-c711-4e9c-bed2-e75fd69ce920"; // true
        String test2 = "ad9e03f0-4bd4-46db-k79e-94ca17d4b74f"; // false
        String test3 = "f087d9fc-xyz3-4a3f-93e0-bdb8d9b68268"; // false
        String test4 = "92ae7a-94f-40c-a22-de4b42dd13"; // false
        String test5 = "f66024c3_50f8_442e_9387_28746581f472"; // false

        System.out.println(test1.matches(regex));
        System.out.println(test2.matches(regex));
        System.out.println(test3.matches(regex));
        System.out.println(test4.matches(regex));
        System.out.println(test5.matches(regex));
    }
}