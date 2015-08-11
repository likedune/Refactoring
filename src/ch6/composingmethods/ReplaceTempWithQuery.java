package ch6.composingmethods;

public class ReplaceTempWithQuery {

    private double quantity;
    private double itemPrice;

    public double getPirce() {
        double basePrice = quantity * itemPrice;
        if (basePrice > 1000) {
            return basePrice * 0.95;
        }
        else {
            return basePrice * 0.98;
        }
    }
}
