package ch1;

public class ChildrensPrice implements Price {

    @Override
    public int getPriceCode() {
        return 2;
    }

    @Override
    public double getCharge(int daysRented) {
        double charge = 1.5;
        if (daysRented > 3) {
            charge += (daysRented - 3) * 1.5;
        }
        return charge;
    }
}
