public class c37 {
    public static void main(String[] args) {
        //Min and Max of User Inputs

        //User enters a number, or a character to quit.
        //Number is validated, (integer or double both accepted)
        //If entry is not a number, quit loop.
        //If user has entered a number set (or just one number)
        //Display min and max of numbers entered. 
        //E.g. Min 0, Max 10. Min 100, Max 200.

        minMax();
    }

    public static void minMax () {
        boolean quit = false;
        double min = 0;
        double max = 0;
        

        do {
            System.out.println("Enter numbers to received the minimum and maximum of the numbers you enter. Enter a letter to quit.");
            try {
                System.out.println("Min: " + min + " Max: " + max + ". Enter a number or enter any other key to quit." );
                double currentNum = convertNum(System.console().readLine());
                if (currentNum < 0){
                    System.out.println("Negative number entered. Please enter positive numbers.");
                } else if (min == 0 && max == 0){
                    min = currentNum;
                } else if (currentNum > max) {
                    max = currentNum;
                } else if (currentNum < min) {
                    min = currentNum;
                } 
            } catch (NumberFormatException badUserData){
                System.out.println("Character entered. Exiting program.");
                quit = true;
            }
        } while (!quit);

    }   

    public static double convertNum(String num){
        
        if (num == "q") {
            return -1;
        } else{
            System.out.println();
            return Double.parseDouble(num);
        }

    }
}