package ch8.organizing.data;

import java.util.ArrayList;
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

    public static void main(String[] args) {
        String name = "daniel";
        Order1 order1 = new Order1(name);
        Collection<Order1> orderList = new ArrayList<Order1>();
        orderList.add(order1);
        orderList.add(new Order1("jason"));

        int result = numberOfOrdersFor(orderList, "daniel");
        System.out.println(result);

        int result1 = numberOfOrdersFor(orderList, "jay");
        System.out.println(result1);
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
