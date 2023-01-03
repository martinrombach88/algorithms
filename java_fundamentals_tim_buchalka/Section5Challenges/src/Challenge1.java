public class Challenge1 {
    //Define displayHighScorePosition which prints a string indicating a player position in a sentence.
    //Define calculateHighScorePosition which takes a score and defines a position based on if/else statements
    //Result > 1000 = 1. 
    //Result greater than 1000 and Result less than/equal to 500 = 2. 
    //Result < 500 and less than 100 = 3. Else 4.
    //Print the strings for the scores 1500, 1000, 500, 100, 25 

    public static void main(String[] args) {
        int tina = calculateHighScorePosition(1500);
        int louise = calculateHighScorePosition(1000);
        int gene = calculateHighScorePosition(500);
        int bob = calculateHighScorePosition(100);
        int linda = calculateHighScorePosition(25);

        displayHighScorePosition("Tina", tina);
        displayHighScorePosition("Louise", louise);
        displayHighScorePosition("Gene", gene);
        displayHighScorePosition("Bob", bob);
        displayHighScorePosition("Linda", linda);

    }
    public static void displayHighScorePosition(String player, int position) {
        System.out.println(player + " managed to get into position " + position + " on the high score list.");
}

    public static int calculateHighScorePosition(int score) {
        int result = 4;
        if (score >= 1000) {
            result = 1;
        } else if (score >= 500 && score < 1000) {
            result = 2;
        } else if (score >= 100 && score < 500) {
            result = 3;
        }
        return result;
    }
}
