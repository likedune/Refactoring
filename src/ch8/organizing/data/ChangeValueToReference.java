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
        this.customer = Customer1.createCustomer(customerName);
    }

    public String getCustomer() {
        return customer.getName();
    }
}

class Customer1 {

    private final String name;

    private Customer1(String name) {
        this.name = name;
    }

    public static Customer1 createCustomer(String name) {
        return new Customer1(name);
    }

    public String getName() {
        return name;
    }
}
