package Calculator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean loop = true;
		do {
			String numString = scanner.nextLine();
			if (numString.equals("")) {
				continue;
			} else if (numString.equals("/exit")) {
				System.out.println("Bye!");
				loop = false;
			} else {
				String[] numArray = numString.split(" ");
				if (numArray.length < 2 && numArray.length != (0)) {
					System.out.println(numArray[0]);

				} else if (numArray.length != (0)) {
					System.out.println(Integer.parseInt(numArray[0]) + Integer.parseInt(numArray[1]));
				}
			}
		} while (loop);

	}
}
