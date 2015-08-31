package ch10.making.method.calls.simpler;

public class RemoveSettingMethod {

    public class Account {
        private String id;

        public Account(String id) {
            initializer(id);
        }

        public void initializer(String id) {
            this.id = "First" + id;
        }
    }

    public class InterestAccount extends Account {
        private double rate;

        public InterestAccount(String id, double rate) {
            super(id);
            this.rate = rate;
        }
    }
}
