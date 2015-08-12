package ch7.movingfeaturesbetweenobjects;

public class MoveField {

    public class AccountType {
    }

    public class Account {
        private AccountType type;
        private double interestRate;

        public double interestForAmountDays(double amount, int days) {
            return interestRate * amount * days / 365;
        }
    }
}
