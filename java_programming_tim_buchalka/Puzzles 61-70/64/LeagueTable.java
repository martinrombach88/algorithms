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
            System.out.println(team + " added to " + name);
        }

    }
    public void printTable() {
        Collections.sort(teams);
        System.out.println("-".repeat(20));
        System.out.println(this.name + " standings");
        System.out.println("-".repeat(20));
//        for (int i = 0; i < teams.size(); i++) {
//            if (teams.isEmpty()) {
//                System.out.println("This league has no teams.");
//            } else  {
//                System.out.println("Sort algo here.");
//            }
//        }

        //Sort 1 - Automatic
        //What format works here?
//        Collections.sort(teams);
        System.out.println(teams);
        System.out.println("-".repeat(20));
    }


}
