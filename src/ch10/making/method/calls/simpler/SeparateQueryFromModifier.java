package ch10.making.method.calls.simpler;

public class SeparateQueryFromModifier {
    
    private String foundMiscreant(String[] people) {
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
        String miscreant = foundMiscreant(people);
        someCode(miscreant);
    }

    private void someCode(String miscreant) {    }
}
