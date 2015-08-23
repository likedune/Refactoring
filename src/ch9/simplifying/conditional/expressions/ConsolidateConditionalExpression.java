package ch9.simplifying.conditional.expressions;

public class ConsolidateConditionalExpression {

    private int seniority;
    private int monthDisabled;
    private boolean isPartTime;


    public double disabilityAmount() {
        if (isNotEligibleForDisability()) {
            return 0;
        }
        else {
            return 1;
        }
    }

    private boolean isNotEligibleForDisability() {
        return (seniority > 2) || (monthDisabled > 12) || (isPartTime);
    }
}
