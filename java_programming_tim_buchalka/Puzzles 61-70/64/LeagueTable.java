import java.util.ArrayList;


public class LeagueTable <T extends Team>{
    private String name;
    private ArrayList<T> teams;

    public LeagueTable(String name, ArrayList<T> teams) {
        this.name = name;
        this.teams = teams;
    }
    public void addTeam(T team) {
        teams.add(team);
    }
    public void printTable() {
        ArrayList<T> newTeams = teams;
        System.out.println("-".repeat(20));
        System.out.println(this.name + " standings");
        System.out.println("-".repeat(20));
        for (int i = 0; i < teams.size(); i++) {
            if (teams.isEmpty()) {
                System.out.println("This league has no teams.");
            } else  {
                System.out.println("Sort algo here.");
            }
        }

        System.out.println("-".repeat(20));
    }


}
