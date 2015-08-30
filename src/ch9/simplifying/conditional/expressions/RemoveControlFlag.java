package ch9.simplifying.conditional.expressions;

public class RemoveControlFlag {

    public void checkSecurity(String[] peoples) {
        boolean found = false;
        for (int i = 0; i < peoples.length; i++) {
            if (!found) {
                if (peoples[i].equals("Don")) {
                    sendAlert();
                    found = true;
                }
            }
            if (!found) {
                if (peoples[i].equals("John")) {
                    sendAlert();
                    found = true;
                }
            }
        }
    }

    public void sendAlert() {
        System.out.println("find person!");
    }
}
