public class c7 {
//Decimal Comparator
// Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
// The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175)); //true
        //What happens?
        //Check 1 - numbers are less than 0
        //Calc 1 - num1 * 1000 = -3175.0 (6 is rounded off, rounding up makes 0.)
        //Calc 2 - num2 * 1000 = -3175.0 (No number to round off)
        //Check 2 - num1 and num2 match. 

        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176)); //false
        //Check 1 - numbers are greater than 0
        //Calc 1 - num1 * 1000 = 3175.0 
        //Calc 2 - num2 * 1000 = 3176.0 (No rounding needed. Numbers != so false.)
        //Check 2 - num1 and num2 don't match.)
        
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0)); //true
        //Calc 1 - num1 * 1000 = 3000.0 
        //Calc 2 - num2 * 1000 = 3000.0 (No rounding needed. Numbers == so true.)

        System.out.println(areEqualByThreeDecimalPlaces(-3.125, 3.125)); //false
        //Check - num1 less than 0, num 2 greater than 0, can't compare so false.

    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        boolean equal = false;

        //Test for positive numbers only
        if (num1 >= 0 && num2 >= 0) {
            System.out.println(Math.floor(num1 * 1000));
            System.out.println(Math.floor(num2 * 1000));
            //If num1 times 1000, --rounded down-- matches num2 times 1000 --rounded down--, the decimals are a match.
            if (Math.floor(num1 * 1000) == Math.floor(num2 * 1000)){

                equal = true;
            }

        } //Test for negative numbers only 
        else if (num1 < 0 && num2 < 0) {
            System.out.println(Math.ceil(num1 * 1000));
            System.out.println(Math.ceil(num2 * 1000));
            //If num1 times 1000, --rounded up-- matches num2 times 1000 --rounded up--, the decimals are a match.
            if (Math.ceil(num1 * 1000) == Math.ceil(num2 * 1000)){

                equal = true;
            }
        } //Trying to compare positive and negative numbers
        else {
            System.out.println("Positive/Negative mismatch");
        }
        //Round down positive numbers -> the number is always equal/less than input. 
        //Round up negative numbers -> the number is always equal/greater to input. 
        return equal;
    }
}
