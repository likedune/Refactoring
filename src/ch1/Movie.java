package ch1;

public class Movie {

    public static final int CHILDRUNS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }

    public void setPriceCode(int priceCode) {
        if (priceCode == REGULAR) {
            price = new RegularPrice();
        }
        else if (priceCode == NEW_RELEASE) {
            price = new NewReleasePrice();
        }
        else if (priceCode == CHILDRUNS) {
            price = new ChildrensPrice();
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public String getTitle() {
        return title;
    }

    public double getCharge(int daysRented) {
        double charge = 0;
        switch (getPriceCode()) {
            case Movie.REGULAR:
                charge += 2;
                if (daysRented > 2) {
                    charge += (daysRented - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                charge += daysRented * 3;
                break;
            case Movie.CHILDRUNS:
                charge += 1.5;
                if (daysRented > 3) {
                    charge += (daysRented - 3) * 1.5;
                }
                break;
        }

        return charge;
    }

    public int getFrequentRenterPoints(int daysRented) {
        // 최신물을 이틀 이상 대여하면 2포인트, 아니면 1포인트를 지급
        if (getPriceCode() == Movie.NEW_RELEASE && daysRented > 1) {
            return 2;
        }
        else {
            return 1;
        }
    }
}
