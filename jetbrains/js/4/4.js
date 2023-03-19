/*
    Have you ever heard of a Caesar cipher? Let's try to encrypt a small
    message in a similar fashion! Write a code that reads a string from the
    input, adds 1 to the code point of every character and outputs the
    encrypted string.

    Sample Input 1: I love ord function! Sample Output 1: J!mpwf!pse!gvodujpo"

    Using the ord function, return the unicode of the char. Then use chr() to
    convert back into a unicode chr

    So in Python you have the ord function for returning unicodes
*/

const caeserCypher = function (line) {
  encodedLine = [];

  for (let i = 0; i < line.length; i++) {
    let n = line.charCodeAt(i);
    encodedLine.push(String.fromCharCode(n + 1));
  }

  return encodedLine.join("");
};

//How do you convert the char into unicode?

//You need this to convert the number back into a char
// let text = String.fromCharCode(72, 69, 76, 76, 79);

// console.log(text);
console.log(caeserCypher("hello"));
