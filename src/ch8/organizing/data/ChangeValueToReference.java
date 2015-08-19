package ch8.organizing.data;

import java.util.Collection;
import java.util.Iterator;

public class ChangeValueToReference {

    private static int numberOfOrdersFor(Collection<Order1> orders, String customer) {
        int result = 0;
        Iterator<Order1> itr = orders.iterator();
        while (itr.hasNext()) {
            Order1 order = itr.next();
            if(order.getCustomer().equals(customer)) {
                result++;
            }
        }
        return result;
    }
}

class Order1 {

    private Customer1 customer;

    public Order1(String customerName) {
        this.customer = new Customer1(customerName);
    }

    public void setCustomer(String customerName) {
        this.customer = new Customer1(customerName);
    }

    public String getCustomer() {
        return customer.getName();
    }
}

class Customer1 {

    private final String name;

    public Customer1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
