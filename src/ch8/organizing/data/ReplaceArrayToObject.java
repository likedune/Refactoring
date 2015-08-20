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
    private String[] row;

    public Performance() {
        row = new String[3];
    }

    public void setName(String name) {
        row[0] = name;
    }

    public String getName() {
        return row[0];
    }

    public void setWins(String wins) {
        row[1] = wins;
    }

    public int getWins() {
        return Integer.parseInt(row[1]);
    }
}