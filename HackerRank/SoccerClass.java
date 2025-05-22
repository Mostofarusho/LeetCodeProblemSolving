
class GenericSports {

    String getName() {
        return "Generic Sports";
    }

    String getNumberOfTeamMembers() {
        return "Each team has n players in Generic Sports";
    }
}

public class SoccerClass extends GenericSports {

    @Override
    String getName() {
        
        System.out.println(super.getName());
        return "Soccer Class";
    }

    @Override
    String getNumberOfTeamMembers() {
        System.out.println(super.getNumberOfTeamMembers());
        return "Each team has 11 players in Soccer Class";
    }

    public static void main(String[] args) {

        // GenericSports genericSports = new GenericSports();
        // System.out.println(genericSports.getName());
        // System.out.println(genericSports.getNumberOfTeamMembers());

        SoccerClass soccer = new SoccerClass();
        System.out.println(soccer.getName());
        System.out.println(soccer.getNumberOfTeamMembers());

    }
}
