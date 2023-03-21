/* Card name validation and identification
    // Write a program that uses regular expressions to check whether the input card number is valid and identifies the card network name.
    
    // The input must consist only of numbers. Your program must take a string as an input and print the name of the card network as output, choosing from the set of names specified below, or the message: "Card number does not exist”.
    
    Sample Input
    4235 2345 6543 1234 visa
    5120 2345 1234 6499 mastercard
    2220 2345 1234 6499 dne
    2221 2345 1234 6499 mastercard
    2499 2345 1234 6499 mastercard
    2720 2345 1234 6499 mastercard
    2721 2345 1234 6499 dne

    Do not copy the regex! Rebuild it!
    
*/
let check = false;
const checkCard = function (card) {
  // Card networks: Visa, Mastercard, American Express.
  // A Visa card starts with 4 and has the length of 16 digits.
  const visa = /4[0-9]{15}/;

  // A MasterCard starts with the numbers from 51 to 55, or the numbers 2221 to 2720. All have 16 digits.
  const mastercard =
    /5[1-5][0-9]{14}|222[1-9][0-9]{12}|2[3-6][0-9]{14}|27[0-1][0-9]{14}|2720[0-9]{12}/;

  // American Express card numbers start with 34 or 37 and have 15 digits.
  const amex = /34[0-9]{14}|37[0-9]{14}/;

  if (visa.test(card)) {
    return "Visa";
  } else if (mastercard.test(card)) {
    return "Mastercard";
  } else if (amex.test(card)) {
    return "American Express";
  } else {
    return "Card number does not exist";
  }
};
!check ? (card = prompt("Enter a card number")) : null;
console.log(checkCard(card));
check = true;
