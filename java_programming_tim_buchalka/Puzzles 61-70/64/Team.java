//Here we implement Java's Comparable interface.
//This allows comparison of Teams (or class instances)
//via Comparable's compareTo method

//-----------------Crucial--------------
//Comparable can only be used on a class with a super
//Tim constructed Team to be an extension of Player, so it's super was player
//You've extended LeagueTable for this purpose. (Although tbh, it's redundant
//and only done to use Comparable.)
//--------------------------------------


public class Team <T extends LeagueTable> implements Comparable <Team <T>>{
    private Sport sport;
    private String name;

    private String[] players;
    private int wins;
    private int losses;
    private int rank;


    public String getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public int getRank() {
        return rank;
    }

    public Team() {
    }

    public Team(Sport sport, String name, String[] players, int wins, int losses) {
        this.sport = sport;
        this.name = name;
        this.wins = wins;
        this.players = players;
        this.losses = losses;
        this.rank = wins - losses;
    }

    public void printLineup () {
        System.out.println("Top players for " + getName());
        for ( String player : players) {
            System.out.println(player);
        }
    }

    @Override
    public int compareTo(Team<T> team) {
        return Integer.compare(team.getRank(), this.getRank());

        //This code does this:
//        if(this.getRank() > team.getRank()) {
//            return -1;
//        } else if(this.getRank() < team.getRank()) {
//            return 1;
//        } else {
//            return 0;
//        }
    }
}
