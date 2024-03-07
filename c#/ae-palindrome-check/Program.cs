using System;

static bool IsPalindrome(string str) {
    // Write your code here.
    string comp = "";
    //do it without a reverse method?
    //loop and create new string, compare with initial string
    for (int i = str.Length-1; i >= 0; i--) {
        comp = String.Concat(comp + str[i]);
    }
    if (comp == str) {
        return true;
    }
    return false;
  }

Console.WriteLine(IsPalindrome("maxam")); //true
Console.WriteLine(IsPalindrome("cheese")); //false