// import java.util.Scanner;

public class c36 {
    //Sum of Five User Inputs

    //Read 5 valid numbers from a user
    //If invalid, print "Invalid number", continue looping until you have 5 valid numbers
    //Prompt: "Enter number #1", "Enter number #2" (depending on how many numbers they have entered)
    //Print the sum of the 5 numbers

    public static void main(String[] args) {
        sumOfFive();
    }

    public static void sumOfFive () {
        // Scanner scanner = new Scanner(System.in);

        boolean validNum = false;
        double total = 0;
        double currentNum = 0;
        int printNum = 1;
        System.out.println("Enter 5 positive numbers to be added together.");
        do {
            System.out.println("Enter number #" + printNum);
            try {
                // currentNum = convertNum(scanner.nextLine());
                currentNum = convertNum(System.console().readLine());
                validNum = currentNum < 0 ? false : true;
                if(validNum) {
                    total += currentNum;
                    printNum ++;
                } else {
                    System.out.println("Invalid number entered. Please try again from number #1.");
                }
            } catch (NumberFormatException badUserData){
                System.out.println("Characters not allowed. Try again.");
            }
        } while (printNum < 6);
        System.out.println("Total = " + total);
    }
    public static double convertNum(String num){
        // int currentNum = Integer.parseInt(num);
        double currentNum = Double.parseDouble(num);
        if (currentNum < 0) {
            return -1;
        }
        return currentNum;
    }

}
