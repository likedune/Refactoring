package ch9.simplifying.conditional.expressions.replaceConditionalWithPolymorphism;

public class Engineer extends EmployeeType {

    @Override
    public int payAmount(Employee emp) {
        return emp.getMonthlySalary() + emp.getBonus() + emp.getCommission();
    }
}
