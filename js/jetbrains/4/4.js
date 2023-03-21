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

const caeserCypher = function () {
  let line = prompt();
  encodedLine = [];

  for (let i = 0; i < line.length; i++) {
    let n = line.charCodeAt(i);
    encodedLine.push(String.fromCharCode(n + 1));
  }
  console.log(encodedLine.join(""));
};

caeserCypher();
