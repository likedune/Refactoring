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
        if (date.before(SUMMER) || date.after(WINTER)) {
            charge = quantity * winterRate + winterServiceCharge;
        }
        else {
            charge = quantity * summerRate;
        }
    }
}
