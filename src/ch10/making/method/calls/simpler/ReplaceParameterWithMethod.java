package ch10.making.method.calls.simpler;

public class ReplaceParameterWithMethod {

    private int quantity;
    private int itemPrice;

    public double getPrice() {
        int basePrice = quantity * itemPrice;

        int discountLevel;
        if (quantity > 100) {
            discountLevel = 2;
        }
        else {
            discountLevel = 1;
        }

        double finalPrice = discountedPrice(basePrice,discountLevel);
        return finalPrice;
    }

    private double discountedPrice(int basePrice, int discountLevel) {
        if (discountLevel == 2) {
            return basePrice * 0.9;
        }
        else {
            return basePrice * 0.95;
        }
    }
}
