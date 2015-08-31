package ch10.making.method.calls.simpler;

public class ReplaceParameterWithMethod {

    private int quantity;
    private int itemPrice;

    public double getPrice() {
        int basePrice = quantity * itemPrice;

        double finalPrice = discountedPrice(basePrice);
        return finalPrice;
    }

    private double discountedPrice(int basePrice) {
        if (distinguishDiscountLevel() == 2) {
            return basePrice * 0.9;
        }
        else {
            return basePrice * 0.95;
        }
    }

    private int distinguishDiscountLevel() {
        if (quantity > 100) {
            return 2;
        }
        else {
            return 1;
        }
    }
}
