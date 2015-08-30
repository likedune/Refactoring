package ch9.simplifying.conditional.expressions.replaceConditionalWithPolymorphism;

public class Manager extends EmployeeType {

    @Override
    public int getEmployeeTypeCode() {
        return 3;
    }

    @Override
    public int payAmount(Employee emp) {
        return emp.getMonthlySalary() + emp.getBonus();
    }
}
