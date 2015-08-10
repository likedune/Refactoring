package ch1;

public class RegularPrice implements Price {

    @Override
    public int getPriceCode() {
        return 0;
    }

    @Override
    public double getCharge(int daysRented) {
        double charge = 2;
        if (daysRented > 2) {
            charge += (daysRented - 2) * 1.5;
        }
        return charge;
    }
}
