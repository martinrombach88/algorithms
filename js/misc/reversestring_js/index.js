// --- Directions
// Given a string, return a new string with the reversed
// order of characters
// --- Examples
//   reverse('apple') === 'leppa'
//   reverse('hello') === 'olleh'
//   reverse('Greetings!') === '!sgniteerG'

/* With Reverse
function reverse(str) {
  return str.split("").reverse().join("");
}

*/

/* Without reverse */

function reverse(str) {
  //1. Split, 2. Insert in reverse (unshift)
  let revArr = [];
  let strArr = str.split("");

  for (let char in strArr) {
    revArr.unshift(str[char]);
  }
  return revArr.join("");
}

module.exports = reverse;
