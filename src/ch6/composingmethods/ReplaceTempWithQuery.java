package ch6.composingmethods;

public class ReplaceTempWithQuery {

    private double quantity;
    private double itemPrice;

    public double getPirce() {
        final double basePrice = quantity * itemPrice;
        final double discountRate;
        if (basePrice > 1000) {
            discountRate = 0.95;
        }
        else {
            discountRate = 0.98;
        }
        return basePrice * discountRate;
    }
}
