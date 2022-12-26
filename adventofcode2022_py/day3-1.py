import re

with open('input3.txt', 'r') as i:
     list = ''.join(i.readlines()).split('\n')
with open('sample3.txt', 'r') as i:
     sample = ''.join(i.readlines()).split('\n')

# Coding puzzle full explanation - https://adventofcode.com/2022/day/3#part1

# Basic goals - 
# 1. Split each word into an array of 2 pieces
# 2. Find the letter that occurs in both strings
# 3. Convert letters into number equivalents
# Number equivalent: a-z = 1-26, A-Z = 27-52
# 4. Return total numbers

# Set/Intersection 
# https://www.programiz.com/python-programming/set
# https://www.w3schools.com/python/ref_set_intersection.asp 
# Ord Char Function (Convert string to alphabet order number)
# https://bobbyhadz.com/blog/python-convert-letters-to-numbers
# Regex in Python
# https://docs.python.org/3/howto/regex.html#regex-howto 


def rucksack(list):
     regexaz = re.compile('[a-z]')
     regexAZ = re.compile('[A-Z]')
     total = 0
     length = 0
     
     for i in range(len(list)):
          # 1.Split array into 2 pieces
          mid = int(len(list[i])/2)
          comp1 = list[i][:mid]
          comp2 = list[i][mid:]

          # 2. Find letters in both strings
          compSet = set(comp1).intersection(comp2)
          compItem = compSet.pop()

          # 3. Convert letters into number equivalents
          if regexaz.match(compItem):
               total += (ord(compItem) - 96)
          elif regexAZ.match(compItem):
               total += (ord(compItem) - 38)
          length += 1

     # 4. Return total
     totalStr = str(total)
     totalLength = str(length)
     print("Total: " + totalStr)
     print("Length: " + totalLength)

rucksack(sample)
rucksack(list)