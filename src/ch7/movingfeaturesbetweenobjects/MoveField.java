package ch7.movingfeaturesbetweenobjects;

public class MoveField {

    public class AccountType {
        private double interestRate;

        public void setInterestRate(double interestRate) {
            this.interestRate = interestRate;
        }

        public double getInterestRate() {
            return interestRate;
        }
    }

    public class Account {
        private AccountType type;

        public double interestForAmountDays(double amount, int days) {
            return getInterestRate() * amount * days / 365;
        }

        public void setInterestRate(double arg) {
            type.setInterestRate(arg);
        }

        public double getInterestRate() {
            type.getInterestRate();
        }
    }
}
