function caesarCipherEncryptor(string, key) {
  let result = "";

  //set up key for wrap -> how does modulo do it?
  key = key % 26;

  //1. combine numbers into new string with loop
  for (let i = 0; i < string.length; i++) {
    let c = string.charCodeAt(i) + key;
    // 2. generate correct number (no wrap)
    //if number in unicode range of 97-122
    if (c <= 122) {
      result = result + String.fromCharCode(c);
    }

    // 3. generate correct number (wrap)
    else {
      result = result + String.fromCharCode(96 + (c % 122));
    }
  }
  return result;
}

console.log(caesarCipherEncryptor("xyz", 2)); //zab
