public class c3 { 
    //NOTE: 1 mile per hour is 1.609 kilometers per hour
    // toMilesPerHour(1.5); → should return value 1
    // toMilesPerHour(10.25); → should return value 6
    // toMilesPerHour(-5.6); → should return value -1
    // toMilesPerHour(25.42); → should return value 16
    // toMilesPerHour(75.114); → should return value 47
    public static void main(String[] args) {
        printConversion(75.114);
        printConversion(0);
        printConversion(-1);
       
    }

    public static void printConversion(double kilometersPerHour) {
        //Prints a message in the format "XX.XX km/h = YY mi/h".
        long miles = toMilesPerHour(kilometersPerHour);

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + miles + " mi/h");
        }

        
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        //Converts miles to kilometers
        long result = 0;
        if (kilometersPerHour < 0) {
            result = -1;
        } else {
            result = Math.round(kilometersPerHour / 1.609);
        }
        return result;
    }
}
