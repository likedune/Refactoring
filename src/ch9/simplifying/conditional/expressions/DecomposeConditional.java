package ch9.simplifying.conditional.expressions;

import java.util.Date;

public class DecomposeConditional {

    private Date date;
    private static final Date SUMMER = null;
    private static final Date WINTER = null;

    private double charge;
    private double winterRate;
    private double winterServiceCharge;
    private double summerRate;

    public void chargeCalculation(int quantity) {
        if (notSummer()) {
            charge = winterCharge(quantity);
        }
        else {
            charge = summerCharge(quantity);
        }
    }

    private boolean notSummer() {
        return date.before(SUMMER) || date.after(WINTER);
    }

    private double summerCharge(int quantity) {
        return quantity * summerRate;
    }

    private double winterCharge(int quantity) {
        return quantity * winterRate + winterServiceCharge;
    }
}
