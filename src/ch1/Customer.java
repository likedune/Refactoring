package ch1;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {

    private String name;
    private Vector<Rental> rentals = new Vector<Rental>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration<Rental> rentals = this.rentals.elements();
        String result = getName() + " 고객님의 대여 기록\n";

        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();

            // 비디오의 종류별로 대여료를 계산한다.
            double thisAmount = amountFor(each);

            // 적립 포인트 1 증가
            frequentRenterPoints++;
            //NEW_RELEASE를 이틀 이상 대여시 보너스 포인트 지급
            if (each.getMovie().getPriceCode() == Movie.NEW_RELEASE && each.getDaysRented() > 1) {
                frequentRenterPoints++;
            }

            // 이번에 대여하는 비디오 정보와 대여료 정보
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
            // 총 누적 대여료
            totalAmount += thisAmount;
        }

        result += "누적 대여료: " + String.valueOf(totalAmount) + "\n";
        result += "적립 포인트: " + String.valueOf(frequentRenterPoints) + "\n";
        return result;
    }

    public double amountFor(Rental rental) {
        double amount = 0;
        switch (rental.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                amount += 2;
                if (rental.getDaysRented() > 2) {
                    amount += (rental.getDaysRented() - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                amount += rental.getDaysRented() * 3;
                break;
            case Movie.CHILDRUNS:
                amount += 1.5;
                if (rental.getDaysRented() > 3) {
                    amount += (rental.getDaysRented() - 3) * 1.5;
                }
                break;
        }

        return amount;
    }
}
