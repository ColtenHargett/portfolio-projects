import java.util.ArrayList;

public class Team {
    private String teamName;
    private ArrayList<Player> roster;

    public Team(String teamName) {
        this.teamName = teamName;
        this.roster = new ArrayList<>();
    }

    public void addPlayer(Player p) {
        roster.add(p);
    }

    public void removePlayer(String playerName) {
        for (int i = 0; i < roster.size(); i++) {
            if (roster.get(i).getName().equalsIgnoreCase(playerName)) {
                roster.remove(i);
                System.out.println(playerName + " removed from team.");
                return;
            }
        }
        System.out.println("Player not found on your team.");
    }

    public double calculateTeamScore() {
        double total = 0;
        for (Player p : roster) {
            total += p.getAvgPoints();
        }
        return total;
    }

    public void displayRoster() {
        System.out.println("\n=== " + teamName + " Roster ===");
        if (roster.size() == 0) {
            System.out.println("Your team is empty.");
            return;
        }

        for (int i = 0; i < roster.size(); i++) {
            System.out.println((i + 1) + ". " + roster.get(i));
        }
    }

    public ArrayList<Player> getRoster() {
        return roster;
    }

    public String getTeamName() {
        return teamName;
    }
}