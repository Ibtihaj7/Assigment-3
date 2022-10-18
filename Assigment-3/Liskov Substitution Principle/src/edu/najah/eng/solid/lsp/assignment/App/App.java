package edu.najah.eng.solid.lsp.assignment.App;

import edu.najah.eng.solid.lsp.assignment.Customer;
import edu.najah.eng.solid.lsp.assignment.GeneralCustomer;
import edu.najah.eng.solid.lsp.assignment.LimitedCustomer;
import edu.najah.eng.solid.lsp.assignment.Offer;

public class App {
    public static void main(String[] args) {

        GeneralCustomer customer1 = new Customer();
        customer1.addOffers(new Offer("offer1"));
        customer1.addOffers(new Offer("offer2"));
        customer1.addOffers(new Offer("offer3"));
        customer1.addOffers(new Offer("offer4"));
        customer1.addOffers(new Offer("offer5"));

        System.out.println("-----------------------");

        GeneralCustomer customer2 = new LimitedCustomer();
        customer2.addOffers(new Offer("offer1"));
        customer2.addOffers(new Offer("offer2"));
        customer2.addOffers(new Offer("offer3"));
        customer2.addOffers(new Offer("offer4"));
        customer2.addOffers(new Offer("offer5"));

    }

}
