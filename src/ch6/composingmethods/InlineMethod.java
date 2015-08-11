package ch6.composingmethods;

public class InlineMethod {

    private int numberOfLateDeliveries;

    public int getRating() {
        return moreThanFiveLateDeliveries() ? 2 : 1;
    }

    public boolean moreThanFiveLateDeliveries() {
        return numberOfLateDeliveries > 5;
    }
}
