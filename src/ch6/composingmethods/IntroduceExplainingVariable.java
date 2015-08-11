package ch6.composingmethods;

public class IntroduceExplainingVariable {

    private double quantity;
    private double itemPrice;

    public double getPrice() {
        // price = 구매액 - 대량구매 할인 + 배송비
        return itemPrice * quantity
                - Math.max(0, quantity - 500) * itemPrice * 0.05
                + Math.min(quantity * itemPrice * 0.1, 100);
    }
}
