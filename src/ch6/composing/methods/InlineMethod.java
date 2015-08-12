package ch6.composing.methods;

public class InlineMethod {

    private int numberOfLateDeliveries;

    public int getRating() {
        return (numberOfLateDeliveries > 5) ? 2 : 1;
    }
    // 하위 클래스에서 메서드가 재정의 되어 있는지 파악해야 함
    // 메서드가 얼마나 많이 호출되는지 파악해야 함
}
