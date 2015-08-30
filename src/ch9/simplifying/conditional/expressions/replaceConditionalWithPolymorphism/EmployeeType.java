package ch9.simplifying.conditional.expressions.replaceConditionalWithPolymorphism;

public abstract class EmployeeType {
    public static final int ENGINEER = 1;
    public static final int SALESMAN = 2;
    public static final int MANAGER = 3;

    private int employeeTypeCode;

    public abstract int getEmployeeTypeCode();

    public int payAmount(Employee emp) {
        switch (emp.getType()) {
            case ENGINEER:
                return emp.getMonthlySalary() + emp.getBonus() + emp.getCommission();
            case SALESMAN:
                return emp.getMonthlySalary();
            case MANAGER:
                return emp.getMonthlySalary() + emp.getBonus();
            default:
                throw new RuntimeException();
        }
    }
}
