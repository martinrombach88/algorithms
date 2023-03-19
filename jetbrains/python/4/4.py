# Caesar cipher
# Have you ever heard of a Caesar cipher? Let's try to encrypt a small message in a similar fashion! Write a code that reads a string from the input, adds 1 to the code point of every character and outputs the encrypted string.

# HINT by 
# avatar
#  sahil khan
# you should learn for loop before solving this question. You can solve without that also but if you are a beginner than it will make the task easy.
# Was this hint helpful?
# Sample Input 1:

# I love ord function!
# Sample Output 1:

# J!mpwf!pse!gvodujpo"


# PSEUDO 
# Using the ord function, return the unicode of the char. Then use chr() to convert back into a unicode chr

def caesarCipher(line):
    # print(words)
    encodedLine = ""

    for c in line:
        num = ord(c)
        encodedLine += chr(num + 1)
    
    return encodedLine
        
print(caesarCipher("hello"))  