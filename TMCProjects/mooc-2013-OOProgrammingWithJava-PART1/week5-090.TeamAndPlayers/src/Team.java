import java.util.ArrayList;

public class Team {
    private String name;
    private int maxSize;
    private ArrayList<Player> roster;

    public Team(String name) {
        this.name = name;
        this.roster = new ArrayList<Player>();
        this.maxSize = Integer.MAX_VALUE;
    }

    public String getName(){
        return this.name;
    }

    public void addPlayer(Player player) {
        if (roster.size() < this.maxSize) {
            this.roster.add(player);
        }
    }

    public void printPlayers() {
        for (Player i : roster) {
            System.out.println(i);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return roster.size();
    }

    public int goals() {
        int totalGoals = 0;
        for (Player i : roster) {
            totalGoals += i.goals();
        }
        return totalGoals;
    }


}
