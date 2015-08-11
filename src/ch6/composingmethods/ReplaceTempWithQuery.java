package ch6.composingmethods;

public class ReplaceTempWithQuery {

    private double quantity;
    private double itemPrice;

    public double getPirce() {
        final double basePrice = getBasePrice();
        final double discountRate = getDiscountRate();
        return basePrice * discountRate;
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
