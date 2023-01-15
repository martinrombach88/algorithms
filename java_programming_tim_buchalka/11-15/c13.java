public class c13 {
//Minutes To Years and Days Calculator
// Write a method printYearsAndDays with parameter of type long named minutes.

// The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.

// If the parameter is less than 0, print text "Invalid Value".

// Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".

// XX represents the original value minutes.
// YY represents the calculated years.
// ZZ represents the calculated days.



    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
    
    public static void printYearsAndDays(long minutes) {
        String result = "Invalid Value";
        if (minutes < 0) {
            System.out.println(result);
        } else {
            int days = (((int) minutes / 60) / 24);
            int years = days / 365;
            int extraDays = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + extraDays + " d");
        }
    }
}
