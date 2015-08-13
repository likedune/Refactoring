package ch7.moving.features.between.objects;

public class MoveMethod {

    public class AccountType {

        private boolean premium;

        public boolean isPremium() {
            return premium;
        }
    }

    public class Account {
        private AccountType type;
        private int daysOverDrawn;

        public double overdraftCharge() {
            if (type.isPremium()) {
                double result = 10;
                if(daysOverDrawn > 7) {
                    result += (daysOverDrawn - 7) * 0.85;
                }
                return result;
            }
            else {
                return daysOverDrawn * 1.75;
            }
        }

        public double bankCharge() {
            double result = 4.5;
            if (daysOverDrawn > 0) {
                result += overdraftCharge();
            }
            return result;
        }
    }
}
