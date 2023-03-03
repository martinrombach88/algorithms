String str1 = "aaabbcccdaa";
String str2 = " ";

// if the letter is different from the one at the end, add it to the end
for (int i = 0; i < str1.length(); 
i++) {
    char ch = str1.charAt(i);
    if (ch != str2.charAt(str2.length() - 1)) {
        str2 += ch;
    }
}


//Output: abcda