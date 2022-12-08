with open('input2.txt', 'r') as i:
     list = ' '.join(i.readlines()).split('\n')

sample = [' A Y',' B X',' C Z']

"""
What would your total score be if everything goes exactly according to your strategy guide?

Your total score is the sum of your scores for each round. The score for a single round is the score for the shape you selected (1 for Rock, 2 for Paper, and 3 for Scissors) plus the score for the outcome of the round (0 if you lost, 3 if the round was a draw, and 6 if you won).

//Calculate the score based on the letter comparisons in the arrays.

A - opponent Rock
B - opponent Paper
C - opponent Scissor
X - my Rock
y - my Paper
z - my Scissor
X - A = 4 (' A X')
X - B = 1 (' B X')
X - C = 7 (' C X')
Y - A = 8 (' A Y')
Y - B = 5 (' B Y')
Y - C = 2 (' C Y')
Z - A = 3 (' A Z')
Z - B = 9 (' B Z')
Z - C = 6 (' C Z')
"""

# For loop is good, because you need to calculate the whole array.
# total = 0
# for value in list {
#      
# }

def runstrat(list):
    print(list)
    total = 0

    strategy = {
        ' A X': 4,
        ' B X': 1,
        ' C X': 7,
        ' A Y': 8,
        ' B Y': 5,
        ' C Y': 2, 
        ' A Z': 3, 
        ' B Z': 9,
        ' C Z': 6,
        'A Z': 3,
    }
    for round in list:
        total += (strategy[round])

    print(total)

# Sample output - total = 15, return 15.

runstrat(list)