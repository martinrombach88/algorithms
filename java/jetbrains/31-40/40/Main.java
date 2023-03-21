
/*
 * 
Vehicle registration number
Write a program that uses regular expressions to check whether the input string is a valid vehicle registration number.

A vehicle registration number has the following format: ?***??, where ? – a Latin symbol from the set [A, B, E, K, M, H, O, P, C, T, Y, X], and * – any digit from 0 to 9.

The program should output true or false.

MarshMellow
Dont forget symbols arent A-Z. (Only useful though if ur blind like me)

Sample Input 1:
X777XX
Sample Output 1:

true

AB123C


key point - don't rely on jetbrains for tests. instead, anticipate possible tests and make your own

Checking the length -> If you have a set length, check too long + too short (length != target)

 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String regexLatin = "[ABEKMHOPCTYX]";
        String regexInt = "[0-9]";
        Scanner scanner = new Scanner(System.in);
        String[] regNum = scanner.nextLine().split(""); // a valid or invalid registration number
        boolean result = true;
        Boolean[] checks = { false, false, false, false, false, false };
        for (int i = 0; i < regNum.length; i++) {
            if (regNum.length != 6) {
                result = false;
                break;
            } else {
                if (i == 0 || i == 4 || i == 5) {
                    // System.out.println("i:" + regNum[i] + " latin:" +
                    // regNum[i].matches(regexLatin));
                    checks[i] = regNum[i].matches(regexLatin) ? true : false;
                } else if (i == 1 || i == 2 || i == 3) {
                    // System.out.println("i:" + regNum[i] + " int:" +
                    // regNum[i].matches(regexInt));
                    checks[i] = regNum[i].matches(regexInt) ? true : false;
                }
            }
        }
        for (boolean check : checks) {
            if (check == false) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }

}
