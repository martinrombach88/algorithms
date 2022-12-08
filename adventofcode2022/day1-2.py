
with open('input.txt', 'r') as i:
     list = ' '.join(i.readlines()).split('\n')

sample = ['1000', '2000', '3000','','4000','','5000','6000','','7000','8000','9000','','10000']

def totalcalc(input):
    totalarr = []
    total = 0
    for i in range(len(input)):
        if (i == len(input) - 1):
            total += int(input[i])
            totalarr.append(total)
            total = 0
        elif (input[i] == " " or input[i] == ""):
            totalarr.append(total)
            total = 0
        else: 
            total += int(input[i])

    sortedarr = sorted(totalarr, reverse=True)
    return (sortedarr[0] + sortedarr[1] + sortedarr[2])
topthree = totalcalc(list)
print(topthree)

