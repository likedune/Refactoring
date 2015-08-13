package ch7.moving.features.between.objects;

public class HideDelegate {

    public class Department {

        private String chargeCode;
        private Person manager;

        public Department(Person manager) {
            this.manager = manager;
        }

        public Person getManager() {
            return manager;
        }
    }

    public class Person {

        private Department department;

        public Person() { }

        public Department getDepartment() {
            return department;
        }

        public void setDepartment(Department department) {
            this.department = department;
        }
    }

}
