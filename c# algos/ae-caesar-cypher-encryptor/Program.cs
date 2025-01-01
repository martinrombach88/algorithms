using System;

static string CaesarCypherEncryptor(string str, int key)
{
    string result = "";

    //1. combine numbers into new string with loop
    for (int i = 0; i < str.Length; i++)
    {
        key = key % 26;
        //using modulo on the key -> why does this work?
        int c = (int)str[i] + key;

        // 2. generate correct number (no wrap)
        //if number in unicode range of 97-122
        if (c <= 122)
        {
            result = result + (char)c;
        }

        // 3. generate correct number (wrap)
        else
        {
            result = result + (char)(96 + c % 122);
        }
    }

    return result;
}



Console.WriteLine(CaesarCypherEncryptor("xyz", 2)); //zab