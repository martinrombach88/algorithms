using System;  


static string RunLengthEncoding(string str) {
int c = 0; //count
char t = str[0]; //target
string r = ""; 

    
for (int i = 0; i < str.Length; i++) {
    bool target = str[i] == t;

    if (target && c == 9 || !target) {
        r = r + c + t;
        t = str[i];
        c = 0;
    }
    if (target && c < 9) {
        c++;
    }
}
//Console.WriteLine(c);

return r;
}

Console.WriteLine(RunLengthEncoding("AAAAAAAAAAAAABBCCCCDD"));

//expected
//9A4A2B4C2D

//currently returning 9A4A1B3C