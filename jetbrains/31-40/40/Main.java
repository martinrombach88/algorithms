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

key point - don't rely on jetbrains for tests. instead, anticipate possible tests and make your own

 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regNum = scanner.nextLine(); // a valid or invalid registration number

        /* write your code here */
    }

}
