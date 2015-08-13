package ch7.moving.features.between.objects;

import java.util.Date;

public class IntroduceForeignMethod {

    public static void main(String[] args) {
        Date date = new Date();

        Date previousDate = getPreviousDate(date);
    }

    private static Date getPreviousDate(Date date) {
        return new Date(date.getYear(), date.getMonth(), date.getDate() - 1);
    }
}
