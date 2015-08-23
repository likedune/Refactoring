package ch9.simplifying.conditional.expressions;

public class ConsolidateConditionalExpression {

    private int seniority;
    private int monthDisabled;
    private boolean isPartTime;


    public double disabilityAmount() {
        if ((seniority > 2) || (monthDisabled > 12) || (isPartTime)) {
            return 0;
        }
        else {
            return 1;
        }
    }
}
