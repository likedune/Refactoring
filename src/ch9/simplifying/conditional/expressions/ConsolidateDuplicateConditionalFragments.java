package ch9.simplifying.conditional.expressions;

public class ConsolidateDuplicateConditionalFragments {

    private double total;
    private double price;

    public void priceSender() {
        if (isSpecialDeal()) {
            total = price * 0.95;
        }
        else {
            total = price * 1.0;
        }
        send();
    }

    private boolean isSpecialDeal() {
        return true;
    }

    private void send() {
        System.out.println("send!");
    }
}
