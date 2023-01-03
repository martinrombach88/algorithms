with open('input2.txt', 'r') as i:
     list = ' '.join(i.readlines()).split('\n')

sample = [' A Y',' B X',' C Z']

"""
PART 2

The total score is still calculated in the same way, but now you need to figure out what shape to choose so the round ends as indicated. The example above now goes like this:

In the first round, your opponent will choose Rock (A), and you need the round to end in a draw (Y), so you also choose Rock. This gives you a score of 1 + 3 = 4.
In the second round, your opponent will choose Paper (B), and you choose Rock so you lose (X) with a score of 1 + 0 = 1.
In the third round, you will defeat your opponent's Scissors with Rock for a score of 1 + 6 = 7.
Now that you're correctly decrypting the ultra top secret strategy guide, you would get a total score of 12.

Following the Elf's instructions for the second column, what would your total score be if everything goes exactly according to your strategy guide?

//Strategy guide = 
"Anyway, the second column says how the round needs to end: X means you need to lose, Y means you need to end the round in a draw, and Z means you need to win. Good luck!"
Your total score is the sum of your scores for each round. The score for a single round is the score for the shape you selected (1 for Rock, 2 for Paper, and 3 for Scissors) plus the score for the outcome of the round (0 if you lost, 3 if the round was a draw, and 6 if you won).
"""

def runstrat(list):
    print(list)
    total = 0

    strategy = {
        ' A X': 3,
        ' B X': 1,
        ' C X': 2,
        ' A Y': 4,
        ' B Y': 5,
        ' C Y': 6, 
        ' A Z': 8, 
        ' B Z': 9,
        ' C Z': 7,
        'A Z': 8,
    }
    for round in list:
        total += (strategy[round])
    print(list)
    print(total)

# Sample output - total = 15, return 15.

runstrat(list)