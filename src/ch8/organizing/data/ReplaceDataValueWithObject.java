package ch8.organizing.data;

import java.util.Collection;
import java.util.Iterator;

public class ReplaceDataValueWithObject {

    private static int numberOfOrdersFor(Collection<Order> orders, String customer) {
        int result = 0;
        Iterator<Order> itr = orders.iterator();
        while (itr.hasNext()) {
            Order order = itr.next();
            if(order.getCustomer().equals(customer)) {
                result++;
            }
        }
        return result;
    }
}

class Order {

    private String customer;

    public Order(String customer) {
        this.customer = customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCustomer() {
        return customer;
    }
}

class Customer {

    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}