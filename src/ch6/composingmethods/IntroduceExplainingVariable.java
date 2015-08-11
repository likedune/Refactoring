package ch6.composingmethods;

public class IntroduceExplainingVariable {

    private double quantity;
    private double itemPrice;

    public double getPrice() {
        // price = 구매액 - 대량구매 할인 + 배송비
        return getBasePrice() - getQuantityDiscount() + getShippingPrice();
    }

    private double getBasePrice() {
        return itemPrice + quantity;
    }

    private double getQuantityDiscount() {
        return Math.max(0, quantity - 500) * itemPrice * 0.05;
    }

    private double getShippingPrice() {
        return Math.min(getBasePrice() * 0.1, 100);
    }
}
