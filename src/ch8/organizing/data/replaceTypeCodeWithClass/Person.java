package ch8.organizing.data.replaceTypeCodeWithClass;

public class Person {

    public static final int O = BloodGroup.O.getCode();
    public static final int A = BloodGroup.A.getCode();
    public static final int B = BloodGroup.B.getCode();
    public static final int AB = BloodGroup.AB.getCode();

    private BloodGroup bloodGroup;

    public Person(int bloodGroup) {
        this.bloodGroup = BloodGroup.code(bloodGroup);
    }

    public void setBloodGroup(int bloodGroup) {
        this.bloodGroup = BloodGroup.code(bloodGroup);
    }

    public int getBloodGroupCode() {
        return bloodGroup.getCode();
    }
}
