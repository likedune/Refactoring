package ch9.simplifying.conditional.expressions.replaceConditionalWithPolymorphism;

public class SalesMan extends EmployeeType {

    @Override
    public int payAmount(Employee emp) {
        return emp.getMonthlySalary();
    }
}
