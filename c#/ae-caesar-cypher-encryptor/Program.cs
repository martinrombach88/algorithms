using System;


static string CaesarCypherEncryptor(string str, int key)
{
    //Console.WriteLine("str: " + str + " key: "+ key);
    string result = "";
    //unicodes -> 97-122 (26 letters of alphabet)
    //1. find stable conversion method in c#
    //convert to int
    int zero = (int)str[0];
    //Console.WriteLine(zero);

    //convert to char
    //Console.WriteLine((char)zero);

    //2. combine numbers into new string with loop
    for (int i = 0; i < str.Length; i++)
    {
        //using modulo on the key -> why does this work?
        key = key % 26;
        int c = (int)str[i] + key;


        // 3. generate correct number (no wrap)
        //if number in unicode range of 97-122
        if (c <= 122)
        {
            result = result + (char)c;
        }

        // 4. generate correct number (wrap)
        else
        {
            //Console.WriteLine("key % 26: " + key);
            //Console.WriteLine((96 + c - 122));
            result = result + (char)(96 + c % 122);
        }
    }

    return result;
}

Console.WriteLine(CaesarCypherEncryptor("xyz", 2)); //zab