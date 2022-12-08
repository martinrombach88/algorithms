# input = open('input.txt')
with open('input.txt', 'r') as i:
    list = ' '.join(i.readlines()).split('\n')

def totalcalc(input):
    totalarr = []
    total = 0
    highest = 0
    for i in range(len(input)):
        if input[i] == " ":
            totalarr.append(total)
            total = 0
            input[i] = 0
        total += int(input[i])
    
    for j in range(len(totalarr)):
        if totalarr[j] > highest:
            highest = totalarr[j]
    return highest

set1 = totalcalc(list)
print(set1)

