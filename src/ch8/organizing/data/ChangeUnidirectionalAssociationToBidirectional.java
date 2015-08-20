package ch8.organizing.data;

import java.util.HashSet;
import java.util.Set;

public class ChangeUnidirectionalAssociationToBidirectional {

    public class Customer {

        private Set orders;

        public Customer() {
            orders = new HashSet();
        }

        public Set friendOrders() {
            return orders;
        }

        public void addOrder(Order order) {
            order.setCustomer(this);
        }
    }

    public class Order {

        Customer customer;

        public void setCustomer(Customer customer) {
            if (this.customer != null) {
                this.customer.friendOrders().remove(this);
            }
            this.customer = customer;
            if (this.customer != null) {
                this.customer.friendOrders().add(this);
            }
        }

        public Customer getCustomer() {
            return customer;
        }
    }
}
