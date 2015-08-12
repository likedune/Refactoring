package ch6.composing.methods;

public class ReplaceTempWithQuery {

    private double quantity;
    private double itemPrice;

    public double getPirce() {
        return getBasePrice() * getDiscountRate();
    }

    private double getBasePrice() {
        return quantity * itemPrice;
    }

    private double getDiscountRate() {
        if (getBasePrice() > 1000) {
            return 0.95;
        }
        else {
            return 0.98;
        }
    }
}
