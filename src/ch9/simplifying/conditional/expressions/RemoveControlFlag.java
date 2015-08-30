package ch9.simplifying.conditional.expressions;

public class RemoveControlFlag {

    public void checkSecurity(String[] peoples) {

        for (int i = 0; i < peoples.length; i++) {
            if (peoples[i].equals("Don")) {
                sendAlert();
                break;
            }
            if (peoples[i].equals("John")) {
                sendAlert();
                break;
            }
        }
    }

    public void sendAlert() {
        System.out.println("find person!");
    }
}
