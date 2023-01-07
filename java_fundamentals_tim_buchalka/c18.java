public class c18 {
    //Days in Month Calculator
    //Use the leap year method from the previous challenge.

    // Write another method getDaysInMonth with two parameters month and year.  ​Both of type int.

    // If parameter month is < 1 or > 12 return -1. ​

    // If parameter year is < 1 or > 9999 then return -1.

    // This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February).



    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020)); //31
        System.out.println(getDaysInMonth(2, 2020)); //28
        System.out.println(getDaysInMonth(2, 2018)); //29
        System.out.println(getDaysInMonth(-1, 2020)); //-1
        System.out.println(getDaysInMonth(1, -2020)); //-1
    }

    public static int getDaysInMonth(int month, int year) {
        int days = -1;
        if (month < 1 || year < 1 || month > 12 || year > 9999) {
            month = -1;
        }

        switch(month) {
            case 1:
                days = 31;
                break;
            case 2: 
                if (isLeapYear(year) && month == 2) {
                    days = 29;
                    break;
                } else {
                    days = 28;
                    break;
                }
            case 3:
                days = 31;
                break;
            case 4:
                days = 30;
                break;
            case 5:
                days = 31;
                break;
            case 6:
                days = 30;
                break;
            case 7:
                days = 31;
                break;
            case 8:
                days = 31;
                break;
            case 9:
                days = 30;
                break;
            case 10:
                days = 31;
                break;
            case 11:
                days = 30;
                break;
            case 12:
                days = 31;
                break;
            default:
                days = -1;
                break;
        };
        return days;
    }
      //ENHANCED VERSION
      // return switch(month) {
        //     case 1-> 31;
        //     case 2 ->{
        //                 if (isLeapYear(year) && month == 2) {
        //                         yield 29;
        //                 } else {
        //                         yield 28;
        //                 }
        //             }
        //     case 3 -> 31;
        //     case 4 -> 30;
        //     case 5 -> 31;
        //     case 6 -> 30;
        //     case 7 -> 31;
        //     case 8 -> 31;
        //     case 9 -> 30;
        //     case 10 -> 31;
        //     case 11 -> 30;
        //     case 12 -> 31;
        //     default -> -1;
        // };

    public static boolean isLeapYear(int year) {
        boolean leapYear = false;

        //If year is within 1-9999
        if (year >= 1 && year <= 9999) {

            //If year divides by 4 evenly
            if (year % 4 == 0) {

                //If year is a century, divides by 400 test begins
                if (year % 100 == 0) {

                    //If year divides by 400 evenly
                    if (year % 400 == 0) {
                    leapYear = true;
                    }
                //If year isn't a century, 400 test not needed
                } else {
                    leapYear = true;
                }
            }
        }
        return leapYear;
    }
}
