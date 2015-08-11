package ch6;

import java.util.Vector;
import java.util.Enumeration;

public class ExtractMethod {

    private Vector<Double> orderList;
    private String name;

    public void printOwing() {
        printBanner();

        double outstanding = getOutstanding();
        printDetails(outstanding);
    }

    public void printBanner() {
        System.out.println("*******************************");
        System.out.println("************고객외상************");
        System.out.println("*******************************");
    }

    public double getOutstanding() {
        Enumeration<Double> elements = orderList.elements();
        double outstanding = 0.0;
        while (elements.hasMoreElements()) {
            Double each = elements.nextElement();
            outstanding += each;
        }
        return outstanding;
    }

    public void printDetails(double outstanding) {
        System.out.println("고객 이름: " + name);
        System.out.println("외상액: " + outstanding);
    }
}
