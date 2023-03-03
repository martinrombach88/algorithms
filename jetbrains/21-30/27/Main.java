import java.util.Scanner;

/*

The longest word
In the given string find the first longest word and output it.

Input data

Given a string in a single line. Words in the string are separated by a single space.

Output data

Output the longest word. If there are several such words, you should output the one, which occurs earlier.


Sample Input:
one two three four five six

Sample Output:
three

*/

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stringArray = scanner.nextLine().split(" ");
        String result = "";
        for (String string : stringArray) {
            result = string.length() > result.length() ? string : result;
        }
        System.out.println(result);
    }
}