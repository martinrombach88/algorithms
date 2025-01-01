using System;  


static string RunLengthEncoding(string str) {
int c = 0; //count
char t = str[0]; //target
string r = ""; //result

    
for (int i = 0; i < str.Length; i++) {
    bool isTarget = str[i] == t; //isTarget

    if (isTarget && c == 9 || !isTarget) {
        r = r + c + t;
        t = str[i];
        c = 0;
    }
    if (isTarget && c < 9) {
        c++;
    }
}
//Console.WriteLine(c);

return r;
}

Console.WriteLine(RunLengthEncoding("AAAAA AAAAA AAABBCCCCDD"));

//expected
//9A4A2B4C2D

//currently returning 9A4A1B3C

//after i = 2, numbers don't match (but letters do) and collection ends one set early
