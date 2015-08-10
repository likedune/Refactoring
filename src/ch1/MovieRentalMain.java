package ch1;

public class MovieRentalMain {

    public static void main(String[] args) {
        Customer customer = new Customer("user1");
        customer.addRental(new Rental(new Movie("어벤져스 2", 1), 3));
        customer.addRental(new Rental(new Movie("아이언맨", 0), 2));

        System.out.println(customer.statement());
        System.out.println(customer.htmlStatement());
    }
}
