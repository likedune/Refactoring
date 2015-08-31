package ch10.making.method.calls.simpler;

public class ReplaceParameterWithMethod {

    private int quantity;
    private int itemPrice;

    public double getPrice() {
        if (distinguishDiscountLevel() == 2) {
            return getBasePrice() * 0.9;
        }
        else {
            return getBasePrice() * 0.95;
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

    private int getBasePrice() {
        return quantity * itemPrice;
    }
}
