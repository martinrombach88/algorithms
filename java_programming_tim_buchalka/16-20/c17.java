public class c17 {
    //Day of the Week Challenge
    //Use an extended switch to print a day of the Week

    //Note: When attempting to do this with Korean days of the week, the terminal returned ???
    
    public static void main(String[] args) {
        String dayOfTheWeek = printDayOfWeek(0);
        System.out.println(dayOfTheWeek);
        dayOfTheWeek = printDayOfWeek(1);
        System.out.println(dayOfTheWeek);
        dayOfTheWeek = printDayOfWeek(2);
        System.out.println(dayOfTheWeek);
        dayOfTheWeek = printDayOfWeek(3);
        System.out.println(dayOfTheWeek);
        dayOfTheWeek = printDayOfWeek(4);
        System.out.println(dayOfTheWeek);
        dayOfTheWeek = printDayOfWeek(5);
        System.out.println(dayOfTheWeek);
        dayOfTheWeek = printDayOfWeek(6);
        System.out.println(dayOfTheWeek);
        dayOfTheWeek = printDayOfWeek(7);
        System.out.println(dayOfTheWeek);
    }
    
    public static String printDayOfWeek(int day) {
        return switch(day) {
            case 0 -> "Monday";
            case 1 -> "Tuesday";
            case 2 -> "Wednesday";
            case 3 -> "Thursday";
            case 4 -> "Friday";
            case 5 -> "Saturday";
            case 6 -> "Sunday";
            default -> day + " is not valid. Please enter a number between 0 and 6.";
        };
    }
}
