public class Challenge9 {
    //Write a method named hasTeen with 3 parameters of type int.

    // The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.

    // Then write another method named isTeen with 1 parameter of type int.

    // The method should return boolean and it needs to return true if the parameter is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19)); //should return true since 19 is in range 13 - 19
        System.out.println(hasTeen(23, 15, 42)); //should return true since 15 is in range 13 - 19
        System.out.println(hasTeen(22, 23, 34)); //should return false since numbers 22, 23, 34 are not in range 13-19
    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        boolean teen = false;
        if (isTeen(num1) || isTeen(num2) || isTeen(num3)){
            teen = true;
        }

        return teen;
    }

    public static boolean isTeen(int num) {
        boolean teen = false;
        if (num > 12 && num < 20) {
            teen = true;
        }
        return teen;
    }
}
