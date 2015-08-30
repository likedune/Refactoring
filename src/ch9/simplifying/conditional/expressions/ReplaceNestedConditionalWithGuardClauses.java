package ch9.simplifying.conditional.expressions;

public class ReplaceNestedConditionalWithGuardClauses {

    private boolean isDead;
    private boolean isSeparated;
    private boolean isRetired;

    public double getPayAmount() {
        if (isDead) {
            return deadAmount();
        }
        else {
            if (isSeparated) {
                return separatedAmount();
            }
            else {
                if (isRetired) {
                    return retiredAmount();
                }
                else {
                    return normalAmount();
                }
            }
        }
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
