package ch8.organizing.data;

public class SelfEncapsulateField {
}

class Range {

    private int low;
    private int high;

    public Range(int low, int high) {
        this.low = low;
        this.high = high;
    }

    public boolean includes(int arg) {
        return arg >= low && arg <= high;
    }

    public void grow(int factor) {
        high *= factor;
    }
}
