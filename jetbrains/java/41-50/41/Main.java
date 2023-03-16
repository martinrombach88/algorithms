import java.util.Scanner;
/*
 * Illegal identifiers
Suppose, you want to create a new programming language that supports variables.

There is a set of rules for identifiers (names) of variables:

It can include lower and upper letters, digits and the underscore character _;
It can only start with a letter or an underscore;
If an identifier starts with an underscore, the second character should be either a letter or a digit, but not an underscore;
Note that a single _ is not a valid identifier.

Using the provided template, write a program that reads n identifiers and then outputs all invalid ones in the same order as they appear in the input data. We hope that you will use regexes to solve the problem.

Test 1
6
ident
i
__ -> invalid
1a -> invalid
b33
_n1


Test 3

3
longName
2longName -> invalid

Test 4
3
a12312312313
A_B_C_D_E_F
4fdsfsfDFfd -> invalid

 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfVariables = Integer.parseInt(scanner.nextLine());

        String regex = "([_]+[a-zA-Z0-9]+[a-zA-Z0-9_]+)|([a-zA-Z]+[a-zA-Z0-9_]*)";

        for (int i = 0; i < numberOfVariables; i++) {
            String identifier = scanner.nextLine();
            if (!identifier.matches(regex)) {
                System.out.println(identifier);
            }
        }
    }
}