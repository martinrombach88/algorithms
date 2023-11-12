/*

using this

*/

String.prototype.isPalindrome = function() {
    // let c = this.split("").reverse().join("");
    //return c == this;
    //without using reverse
    let d = this.split("");
    let e = [];
    for (let i = d.length-1; i >= 0; i--) {
        e.push(d[i]);
    }
    // console.log(e);

    return e.join("") == this;
}

console.log("racecar".isPalindrome()); //true
console.log("abba".isPalindrome()); //true
console.log("aba".isPalindrome()); //true
console.log("abbcbba".isPalindrome()); //true
console.log("abbccba".isPalindrome()); //false
console.log("abdccba".isPalindrome()); //false
