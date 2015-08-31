package ch10.making.method.calls.simpler;

public class RemoveSettingMethod {

    public class Account {
        private String id;

        public Account(String id) {
            this.id = "First" +id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    public class InterestAccount extends Account {
        private double rate;

        public InterestAccount(String id, double rate) {
            setId(id);
            this.rate = rate;
        }
    }
}
