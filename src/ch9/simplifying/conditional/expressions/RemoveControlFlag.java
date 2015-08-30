package ch9.simplifying.conditional.expressions;

public class RemoveControlFlag {

    public void checkSecurity(String[] people) {

        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don") || people[i].equals("John")) {
                sendAlert();
                return;
            }
        }
    }

    public void sendAlert() {
        System.out.println("find person!");
    }
}
