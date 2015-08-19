package ch8.organizing.data;

public class SelfEncapsulateField {
}

class Range {

    private int low;
    private int high;

    public Range(int low, int high) {
        initializer(low, high);
    }

    private void initializer(int low, int high) {
        this.low = low;
        this.high = high;
    }

    public boolean includes(int arg) {
        return arg >= getLow() && arg <= getHigh();
    }

    public void grow(int factor) {
        setHigh(getHigh() * factor);
    }

    public void setLow(int low) {
        this.low = low;
    }

    public int getLow() {
        return low;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getHigh() {
        return high;
    }
}
