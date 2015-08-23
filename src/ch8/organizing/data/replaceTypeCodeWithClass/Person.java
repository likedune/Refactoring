package ch8.organizing.data.replaceTypeCodeWithClass;

public class Person {

    private BloodGroup bloodGroup;

    public Person(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getBloodGroupCode() {
        return bloodGroup.getCode();
    }
}
