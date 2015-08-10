package ch1;

public class Rental {

    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public double getCharge() {
        double amount = 0;
        switch (getMovie().getPriceCode()) {
            case Movie.REGULAR:
                amount += 2;
                if (getDaysRented() > 2) {
                    amount += (getDaysRented() - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                amount += getDaysRented() * 3;
                break;
            case Movie.CHILDRUNS:
                amount += 1.5;
                if (getDaysRented() > 3) {
                    amount += (getDaysRented() - 3) * 1.5;
                }
                break;
        }

        return amount;
    }

    public int getFrequentRenterPoints() {
        // 최신물을 이틀 이상 대여하면 2포인트, 아니면 1포인트를 지급
        if (getMovie().getPriceCode() == Movie.NEW_RELEASE && getDaysRented() > 1) {
            return 2;
        }
        else {
            return 1;
        }
    }
}
