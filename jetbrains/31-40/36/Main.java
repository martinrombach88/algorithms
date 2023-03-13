import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String initRegex = "[0-9]{0,3}[\\.][0-9]{0,3}[\\.][0-9]{0,3}[\\.][0-9]{0,3}";
        String ipString = scanner.nextLine();
        boolean invalid = false;

        if (ipString.matches(initRegex)) {
            String[] ipArray = ipString.split("\\.");
            int[] ipSplit = { Integer.parseInt(ipArray[0]), Integer.parseInt(ipArray[1]),
                    Integer.parseInt(ipArray[2]) };

            for (int num : ipSplit) {
                if (num < 0 || num > 255) {
                    System.out.println("NO");
                    invalid = true;
                    break;
                }
            }
            if (!invalid) {
                System.out.println("YES");
            }
        } else {
            System.out.println("NO");
        }
    };
}
