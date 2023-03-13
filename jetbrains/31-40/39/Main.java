import java.util.Scanner;
/* Card name validation and identification
// Write a program that uses regular expressions to check whether the input card number is valid and identifies the card network name.

// The input must consist only of numbers. Your program must take a string as an input and print the name of the card network as output, choosing from the set of names specified below, or the message: "Card number does not exist”.

// Card networks: Visa, Mastercard, American Express.

// A Visa card starts with 4 and has the length of 16 digits.
// A MasterCard starts with the numbers from 51 to 55, or the numbers 2221 to 2720. All have 16 digits.
// American Express card numbers start with 34 or 37 and have 15 digits.

Sample Input 1:
4235 2345 6543 1234 

Sample Output 1:
Visa 

Sample Input
2220 2345 1234 6499

Sample Input
2720 2345 1234 6499

2721 2345 1234 6499
*/

class BankCard {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String numbers = scn.nextLine();
        String card = numbers.replaceAll("\\s", "");
        String visaRegex = "4[0-9]{3}[0-9]{4}[0-9]{4}[0-9]{4}";
        String masterCardRegex = "(5[1-5])|(222[1-9][0-9]{12})|(2[3-6][0-9]{14})|27[0-2]0[0-9]{12}";
        String americanExpressRegex = "34|37[0-9]{13}";
        if (card.matches(visaRegex)) {
            System.out.println("Visa");
        } else if (card.matches(masterCardRegex)) {
            System.out.println("MasterCard");
        } else if (card.matches(americanExpressRegex)) {
            System.out.println("AmericanExpress");
        } else {
            System.out.println("Card number does not exist");
        }
    }
};
