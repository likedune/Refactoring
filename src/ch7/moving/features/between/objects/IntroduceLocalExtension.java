package ch7.moving.features.between.objects;

import java.util.Date;

public class IntroduceLocalExtension {
}


class MfDateSub extends Date {

    public MfDateSub(String string) {
        super(string);
    }

    public MfDateSub(Date date) {
        super(date.getTime());
    }

    public MfDateSub nextDay() {
        return null;
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
}
