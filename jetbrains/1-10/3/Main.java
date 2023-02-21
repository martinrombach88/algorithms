
import java.util.Scanner;
//The sum of digits
//Given a three-digit integer (i.e. an integer from 100 to 999). Find the sum of its digits.
public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // put your code here

            String num = scanner.nextLine();
            String[] stringDigits = num.split("");
            int total = 0;
            for (String digit : stringDigits) {
                total += Integer.parseInt(digit);
            }
            System.out.println(total);
        }

}
