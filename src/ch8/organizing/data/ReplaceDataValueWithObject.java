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

    private Customer customer;

    public Order(String customerName) {
        this.customer = new Customer(customerName);
    }

    public void setCustomer(String customerName) {
        this.customer = new Customer(customerName);
    }

    public String getCustomer() {
        return customer.getName();
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