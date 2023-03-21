import java.util.Scanner;

public class c38 {
    //Input Calculator
    // Write a method called inputThenPrintSumAndAverage that does not have any parameters.
    // The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.

    // When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".

    // XX represents the sum of all entered numbers of type int.
    // YY represents the calculated average of all numbers of type long.
    //Find the average or mean by adding up all the numbers and dividing by how many numbers are in the set.

    //NOTE: To run the Java scanner in VS Code

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        //Initialise a new scanner
        //Important: scanner imported above in line 1
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        //While loop scans for integers
        while(scanner.hasNextInt()){
            //Every user entry number adds to the total
            sum += scanner.nextInt();
            //Iteration counts the numbers, ready for the average divide at the end
            count++;
            //In the print, Math.round ensures the result is rounded up

        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum/count));
        scanner.close();

    }
}
