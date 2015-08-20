package ch8.organizing.data;

public class ReplaceArrayToObject {

    public static void main(String[] args) {
        Performance performance = new Performance();
        performance.setName("리버풀");
        performance.setWins("15");

        String name = performance.getName();
        int wins = performance.getWins();
    }
}

class Performance {
    private String name;
    private int wins;

    public Performance() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWins(String wins) {
        this.wins = Integer.parseInt(wins);
    }

    public int getWins() {
        return wins;
    }
}