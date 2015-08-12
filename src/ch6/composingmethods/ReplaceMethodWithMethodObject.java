package ch6.composingmethods;

public class ReplaceMethodWithMethodObject {

    public class Account {

        public int gamma(int inputVal, int quantity, int yearToDate) {
            return new Gamma(this, inputVal, quantity, yearToDate).compute();
        }

        public int delta() {
            return 0;
        }
    }

    public class Gamma {
        private Account account;
        private int inputVal;
        private int quantity;
        private int yearToDate;
        private int importantValue1;
        private int importantValue2;

        public Gamma(Account account, int inputVal, int quantity, int yearToDate) {
            this.account = account;
            this.inputVal = inputVal;
            this.quantity = quantity;
            this.yearToDate = yearToDate;
        }

        public int compute() {
            importantValue1 = (inputVal * quantity) + account.delta();
            importantValue2 = (inputVal * yearToDate) + 100;

            return importThings() - (2 * importantValue1);
        }

        private int importThings() {
            if (yearToDate - importantValue1 > 100) {
                importantValue2 -= 20;
            }
            return importantValue2 * 7;
        }
    }

}
