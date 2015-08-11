package ch6.composingmethods;

public class IntroduceExplainingVariable {

    private double quantity;
    private double itemPrice;

    public double getPrice() {
        // price = 구매액 - 대량구매 할인 + 배송비
        final double basePrice = itemPrice * quantity;
        final double quantityDiscount = Math.max(0, quantity - 500) * itemPrice * 0.05;
        final double shippingPrice = Math.min(basePrice * 0.1, 100);
        return basePrice - quantityDiscount + shippingPrice;
    }
}
