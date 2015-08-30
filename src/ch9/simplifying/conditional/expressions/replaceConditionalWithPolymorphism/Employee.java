package ch9.simplifying.conditional.expressions.replaceConditionalWithPolymorphism;

public class Employee {

    private int monthlySalary;
    private int commission;
    private int bonus;
    private EmployeeType employeeType;

    public int getType() {
        return employeeType.getEmployeeTypeCode();
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public int getCommission() {
        return commission;
    }

    public int getBonus() {
        return bonus;
    }

    public int payAmount() {
        return employeeType.payAmount(this);
    }
}
