public class Challenge11 {
    //Seconds to Hours Converter

    //Create 2 methods with the same name: getDurationString
    //Method 1 has 1 parameter: seconds int
    //Method 2 has 2 parameter: minutes and seconds ints
    //Working together, the methods return a string in the format XXh YYm ZZs (hours, minutes, seconds)

    //1 hour = 60 minutes / 3600 seconds
    //1 minute = 60 seconds

    //Key thing to remember - Online converters (like Google) return percentages.
    //E.g. 2 min 33 seconds = 2.55 minutes. 55% of 1 minute = 33 seconds.

    public static void main(String[] args) {
        System.out.println(getDurationString(0)); //Invalid input
        System.out.println(getDurationString(59)); //59 seconds
        System.out.println(getDurationString(153)); //2 min 33 seconds
        System.out.println(getDurationString(3600)); //1 hour
        System.out.println(getDurationString(3945)); //1 hour 5 minutes and 45 seconds.
        System.out.println(getDurationString(5000)); //1 hour 23 minutes and 20 seconds.

    }

    public static String getDurationString(int seconds) {
        String result = "Invalid input.";
        
        if (seconds <= 0) {
            return result;
        } else{
            if (seconds < 60) {
                result = "0h 0m " + seconds + "s";
                return result;
            } else {
                int minutes = seconds / 60;
                int remainder = seconds - (minutes * 60);
                //remainder --- You can do this with minutes % 60;
                // int remainder = minutes % 60;
                result = getDurationString(minutes, remainder);
                return result;
            }
        }
    }

    public static String getDurationString(int minutes, int seconds) {
        String result = "Invalid Input.";
        if (seconds <= 0 || seconds < 60) {
            int hours = minutes / 60;
            int remainder = minutes - (hours * 60);
            //remainder --- You can do this with minutes % 60;
            // int remainder = hours % 60;
            if (hours > 0) {
                return hours + "h " + remainder + "m " + seconds + "s";
            }
            return hours + "h " + minutes + "m " + seconds + "s";
            
        } else {
            return result;
        }
    }
}
