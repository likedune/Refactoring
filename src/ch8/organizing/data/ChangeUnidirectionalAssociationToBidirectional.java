package ch8.organizing.data;

public class ChangeUnidirectionalAssociationToBidirectional {

    public class Customer {
    }

    public class Order {

        Customer customer;

        public void setCustomer(Customer customer) {
            this.customer = customer;
        }

        public Customer getCustomer() {
            return customer;
        }
    }
}
