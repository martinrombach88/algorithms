public class Main {

    public static void main(String[] args) {
        //Make a league table of two sports using generic type classes

        //EPL Football
        FootballTeam brighton = new FootballTeam("Brighton", new String[]{"Gross", "Mitoma", "Trossard"}, 10, 6);
        FootballTeam arsenal = new FootballTeam("Arsenal", new String[]{"Nketiah", "Saka", "Odegaard"}, 16, 2);
        FootballTeam manCity = new FootballTeam("Man City", new String[]{"Haaland", "Mahrez", "Foden"}, 15, 4);
        FootballTeam wolves = new FootballTeam("Wolverhampton", new String[]{"Podence", "Neves", "Jimenez"}, 6, 11);

        LeagueTable<FootballTeam> premiership = new LeagueTable<>("Premiership");
        premiership.addTeam(brighton);
        premiership.addTeam(arsenal);
        premiership.addTeam(manCity);
        premiership.addTeam(wolves);

        brighton.printLineup();

        //KBO Baseball
        BaseballTeam lg = new BaseballTeam("LG Twins", new String[] {"Oh Ji-hwan (오지환)", "Hur Do-hwan (허도환)", "Kim Ki-yeon (김기연)"}, 87, 55);
        BaseballTeam ssg = new BaseballTeam("SSG Landers", new String[] {"CHO Sung Hun", "CHO Yo Han", "CHOI Min Jun",}, 88, 52);
        BaseballTeam kiwoom = new BaseballTeam("Kiwoom Heroes", new String[] {"AN Woo Jin", "CHOI Won Tae", "HA Yeong Min",}, 80, 62);
        BaseballTeam kia = new BaseballTeam("KIA Tigers", new String[] {"CHOI Ji Min", "HAN Seung Hyuk", "IM Gi Yeong"}, 70, 73);

        LeagueTable<BaseballTeam> kbo = new LeagueTable<>("KBO League");
        kbo.addTeam(lg);
        kbo.addTeam(ssg);
        kbo.addTeam(kiwoom);
        kbo.addTeam(kia);

        //Generics - team cannot be added to wrong league
        FootballTeam chelsea = new FootballTeam("Chelsea", new String[]{"Sterling", "Havertz", "Mount"}, 8, 7);
        BaseballTeam lotte = new BaseballTeam("Lotte Giants", new String[] {"BARNES Charlie", "CHOI Jun Yong", "CHOI Keon"}, 70, 73);

//        premiership.addTeam(lotte);
        //Error: 'addTeam(FootballTeam)' in 'LeagueTable' cannot be applied to '(BaseballTeam)'
//        kbo.addTeam(chelsea);
        //Error: 'addTeam(BaseballTeam)' in 'LeagueTable' cannot be applied to '(FootballTeam)'
        premiership.addTeam(chelsea);
        kbo.addTeam(lotte);

        //Print sport in ranking order (wins/losses);
        premiership.printTable();
        kbo.printTable();
    }
}
