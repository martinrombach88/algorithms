import math

def binarySearch(array, target):
    min = 0
    max = len(array) -1
    while(min <= max):
        g = math.floor((min + max) / 2)
        if array[g] == target:
            return g
        
        if array[g] < target:
            min = g+1

        if array[g] > target:
            max = g-1

    return -1

    
print(33, 'is at index', binarySearch([0, 1, 21, 33, 45,45, 61, 71,72,73], 33)); #3

print(73, 'is at index', binarySearch([2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 
    41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97], 73)); #20
