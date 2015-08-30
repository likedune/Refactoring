package ch9.simplifying.conditional.expressions.replaceConditionalWithPolymorphism;

public class Employee {

    private int type;

    private int monthlySalary;
    private int commission;
    private int bonus;

    public int payAmount() {
        switch (getType()) {
            case EmployeeType.ENGINEER:
                return monthlySalary + commission + bonus;
            case EmployeeType.SALESMAN:
                return monthlySalary;
            case EmployeeType.MANAGER:
                return monthlySalary + bonus;
            default:
                throw new RuntimeException();
        }
    }

    public int getType() {
        return type;
    }
}
