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
        Enumeration<Rental> rentals = this.rentals.elements();
        String result = getName() + " 고객님의 대여 기록\n";

        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();

            // 이번에 대여하는 비디오 정보와 대여료 정보
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
        }

        result += "누적 대여료: " + String.valueOf(getTotalCharge()) + "\n";
        result += "적립 포인트: " + String.valueOf(getTotalFrequentRenterPoints()) + "\n";
        return result;
    }

    public double getTotalCharge() {
        double totalCharge = 0;
        for (Rental rental : rentals) {
            totalCharge += rental.getCharge();
        }
        return totalCharge;
    }

    public int getTotalFrequentRenterPoints() {
        int totalPoint = 0;
        for (Rental rental : rentals) {
            totalPoint += rental.getFrequentRenterPoints();
        }
        return totalPoint;
    }
}
