package Calculator;

import java.util.Arrays;
import java.util.Scanner;
/*
 * Objectives
Add to the calculator the ability to read an unlimited sequence of numbers.
Add a /help command to print some information about the program.

Output:
> 4 5 -2 3
10
> 4 7
11
> 6
6
> /help
The program calculates the sum of numbers
> /exit
Bye!
 */

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean loop = true;
		do {
			String numString = scanner.nextLine();
			switch (numString) {
				case "":
					break;
				case "/exit":
					System.out.println("Bye!");
					loop = false;
					break;
				case "/help":
					System.out.println("The program calculates the sum of numbers");
					break;
				default:
					String[] numArray = numString.split(" ");
					if (numArray.length < 2 && numArray.length != (0)) {
						System.out.println(numArray[0]);
					} else if (numArray.length != (0)) {
						// Unlimited set - add all numbers together
						int total = 0;
						for (int i = 0; i < numArray.length; i++) {
							total += Integer.parseInt(numArray[i]);
						}
						System.out.println(total);
					}
			}
		} while (loop);

	}
}
