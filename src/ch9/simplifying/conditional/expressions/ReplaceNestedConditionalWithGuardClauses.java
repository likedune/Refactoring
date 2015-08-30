package ch9.simplifying.conditional.expressions;

public class ReplaceNestedConditionalWithGuardClauses {

    private boolean isDead;
    private boolean isSeparated;
    private boolean isRetired;

    public double getPayAmount() {
        double result = 0;

        if (isDead) {
            result = deadAmount();
        }
        else {
            if (isSeparated) {
                result = separatedAmount();
            }
            else {
                if (isRetired) {
                    result = retiredAmount();
                }
                else {
                    result = normalAmount();
                }
            }
        }
        return result;
    }

    private double deadAmount() {
        return 0;
    }

    private double separatedAmount() {
        return 0;
    }

    private double retiredAmount() {
        return 0;
    }

    private double normalAmount() {
        return 0;
    }
}
