package ch10.making.method.calls.simpler;

public class SeparateQueryFromModifier {

    private void sendAlert(String[] people) {
        if (!foundPerson(people).equals("")) {
            System.out.println("find!");
        }
    }

    private String foundPerson(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                return "Don";
            }
            if (people[i].equals("John")) {
                return "John";
            }
        }
        return "";
    }

    public void checkSecurity(String[] people) {
        String miscreant = foundPerson(people);
        sendAlert(people);
        someCode(miscreant);
    }

    private void someCode(String miscreant) {    }
}
