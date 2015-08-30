package ch10.making.method.calls.simpler;

public class ReplaceParameterWithExplictMethods {

    public class Employee {
        
        public Employee createEngineer() {
            return new Engineer();
        }

        public Employee createSalesman() {
            return new Salesman();
        }

        public Employee createManager() {
            return new Manager();
        }
    }

    public class Engineer extends Employee {}
    public class Salesman extends Employee {}
    public class Manager extends Employee {}
}
