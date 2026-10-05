public class Player {
    private String name;
    private String position;
    private double avgPoints;

    public Player(String name, String position, double avgPoints) {
        this.name = name;
        this.position = position;
        this.avgPoints = avgPoints;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getAvgPoints() {
        return avgPoints;
    }

    @Override
    public String toString() {
        return name + " (" + position + ") - " + avgPoints + " pts/game";
    }
}