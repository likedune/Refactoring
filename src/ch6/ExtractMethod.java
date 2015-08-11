package ch6;

import java.util.Vector;
import java.util.Enumeration;

public class ExtractMethod {

    private Vector<Double> orderList;
    private String name;

    public void printOwing() {
        Enumeration<Double> elements = orderList.elements();
        double outstanding = 0.0;

        printBanner();

        while (elements.hasMoreElements()) {
            Double each = elements.nextElement();
            outstanding += each;
        }

        printDetails(outstanding);
    }

    public void printBanner() {
        System.out.println("*******************************");
        System.out.println("************고객외상************");
        System.out.println("*******************************");
    }

    public void printDetails(double outstanding) {
        System.out.println("고객 이름: " + name);
        System.out.println("외상액: " + outstanding);
    }
}
