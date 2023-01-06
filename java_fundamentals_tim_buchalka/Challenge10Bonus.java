public class Challenge10Bonus {
    //Convert whole int to 0.0 decimal fraction - see below
    //There may be times when you want to convert a whole number into a fraction version,
    //or see a decimal version. By converting to a double and / 10.00, the int becomes a decimal.
    public static void main(String[] args) {
        convertToDecimal(6);
        convertToDecimal(25);
        convertToDecimal(128);
    }

    public static void convertToDecimal(int num) {
        double fraction = num / 10.0;
        System.out.println(num + " converted to a decimal version is: " + fraction); 
    }
}
