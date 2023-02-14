import java.util.Arrays;

//Here we implement Java's Comparable interface.
//This allows comparison of Teams (or class instances)
//via Comparable's compareTo method

public class Team implements Comparable<Team<T>>{
    private Sport sport;
    private String name;
    private String[] players;
    int wins;
    int losses;
    int rank;

    public int getRank() {
        return rank;
    }

    public Team() {
    }

    public Team(Sport sport, String name, String[] players,  int wins, int losses) {
        this.sport = sport;
        this.name = name;
        this.players = players;
        this.wins = wins;
        this.losses = losses;
        this.rank = wins - losses;
    }

    @Override
    public String toString() {
        return
                ", name='" + name + '\'' +
                ", players=" + Arrays.toString(players) +
                ", wins=" + wins +
                ", losses=" + losses +
                '}';
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.getRank() > team.getRank()) {
            return -1;
        } else if (this.getRank() < team.getRank()) {
            return 1;
        } else {
            return 0;
        }
    }
}
