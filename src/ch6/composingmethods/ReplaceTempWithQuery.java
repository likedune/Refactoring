package ch6.composingmethods;

public class ReplaceTempWithQuery {

    private double quantity;
    private double itemPrice;

    public double getPirce() {
        final double basePrice = getBasePrice();
        final double discountRate;
        if (basePrice > 1000) {
            discountRate = 0.95;
        }
        else {
            discountRate = 0.98;
        }
        return basePrice * discountRate;
    }

    private double getBasePrice() {
        return quantity * itemPrice;
    }
}
