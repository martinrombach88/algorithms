import java.util.Scanner;

public class Main {
    //Write a program that reads three positive integers a, b, n and outputs the count of numbers divisible by n in the range from a to b (a < b) inclusively.
    //
    //Note: it is possible to write this program more efficiently without any loops.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        int n = Integer.parseInt(scanner.next());
        int count = 0;

        //With a loop
        for(int i = a; i <= b; i++) {
            if (i % n == 0) {
                count++;
            }
        }
        System.out.println(count);

    }
}
