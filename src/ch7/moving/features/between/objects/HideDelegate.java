package ch7.moving.features.between.objects;

public class HideDelegate {

    public static void main(String[] args) {
        Person john = new Person();
        Person daniel = new Person();
        Department department = new Department(daniel);
        john.setDepartment(department);
        john.getDepartment().getManager();
    }
}

class Department {
    private String chargeCode;
    private Person manager;

    public Department(Person manager) {
        this.manager = manager;
    }

    public Person getManager() {
        return manager;
    }
}

class Person {
    private Department department;

    public Person() { }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}