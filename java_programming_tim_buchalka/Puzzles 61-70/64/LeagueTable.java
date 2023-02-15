import java.util.ArrayList;
import java.util.Collections;


public class LeagueTable <T extends Team>{
    private String name;
    private ArrayList<T> teams = new ArrayList<>();

    public LeagueTable(String name) {
        this.name = name;
    }

    public void addTeam(T team) {
        if (teams.contains(team)) {
            System.out.println("Team already in league.");
        } else {
            teams.add(team);
//            System.out.println(team.getName() + " added to " + name);
        }

    }
    public void printTable() {
        //Sort 1 - Automatic
        Collections.sort(teams);

        //Sort 2 - Insertion - best for partly organised/small arrays

        //Sort 3 - Merge - for random elements

        //Sort 4 - Shell Sort - more efficient version of insertion

        //Sort 5 - Heap Sort - using trees, good for building indexes

        //Sort 6 - Bubble Sort - inefficient, easy to write

        //Sort 7 - Quick Sort

        //Use Algo Monster
        System.out.println("-".repeat(20));
        System.out.println(this.name + " standings");
        System.out.println("-".repeat(20));
        int rank = 0;
        for (Team team : teams) {
            rank++;
            System.out.println(rank + ". " + team.getName() + " : Wins " + team.getWins() + " Losses " + team.getLosses());
        }

        System.out.println("-".repeat(20));
    }


}
