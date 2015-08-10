package ch1;

public class NewReleasePrice implements Price {

    @Override
    public int getPriceCode() {
        return 1;
    }

    @Override
    public double getCharge(int daysRented) {
        return daysRented * 3;
    }
}
