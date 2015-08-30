package ch9.simplifying.conditional.expressions.replaceConditionalWithPolymorphism;

public class Engineer extends EmployeeType {

    @Override
    public int getEmployeeTypeCode() {
        return 1;
    }

    @Override
    public int payAmount(Employee emp) {
        return emp.getMonthlySalary() + emp.getBonus() + emp.getCommission();
    }
}
