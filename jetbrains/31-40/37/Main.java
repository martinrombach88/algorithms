import java.util.Scanner;
//Check the clock time

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "((0[0-9])|(1[0-9])|(2[0-3]))[\\.:]([0-5][0-9])";
        // |([1-9])
        String time = scanner.nextLine();
        System.out.println(time.matches(regex) ? "YES" : "NO");

        // Sample 1
        // 09:00
        // Output: YES

        // Sample 2
        // 23:59
        // Output: YES

        // Sample 3
        // 24:00
        // Output: NO
    }
}
