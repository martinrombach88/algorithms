import java.util.Arrays;

public class Team {
    private Sport sport;
    private String name;
    private String[] players;

    private int wins;
    private int losses;
    protected int rank;



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
}
