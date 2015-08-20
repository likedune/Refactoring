package ch8.organizing.data;

public class ReplaceArrayToObject {

    public static void main(String[] args) {
        String[] row = new String[3];
        row[0] = "리버풀";
        row[1] = "15";

        String name = row[0];
        int wins = Integer.parseInt(row[1]);
    }
}
