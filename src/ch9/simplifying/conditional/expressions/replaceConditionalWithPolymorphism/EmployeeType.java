package ch9.simplifying.conditional.expressions.replaceConditionalWithPolymorphism;

public abstract class EmployeeType {

    private int employeeTypeCode;

    public abstract int payAmount(Employee emp);

}
