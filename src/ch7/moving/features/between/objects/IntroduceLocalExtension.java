package ch7.moving.features.between.objects;

import java.util.Date;

public class IntroduceLocalExtension {

    private static Date nextDay(Date arg) {
        return new Date(arg.getYear(), arg.getMonth(), arg.getDay() + 1);
    }
}


class MfDateSub extends Date {

    public MfDateSub(String string) {
        super(string);
    }

    public MfDateSub(Date date) {
        super(date.getTime());
    }

    public Date nextDay() {
        return new Date (getYear(), getMonth(), getDay() + 1);
    }

    public int dayOfYear() {
        return 0;
    }
}

class MfDateWrap {

    private Date original;

    public MfDateWrap(String dateString) {
        original = new Date(dateString);
    }

    public MfDateWrap(Date date) {
        original = date;
    }

    public int getYear() {
        return original.getYear();
    }
}
