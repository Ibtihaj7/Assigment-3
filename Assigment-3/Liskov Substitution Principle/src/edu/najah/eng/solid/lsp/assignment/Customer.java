package edu.najah.eng.solid.lsp.assignment;

public class Customer extends GeneralCustomer {
    @Override
    public void addOffers(Offer offer) {
        this.offers.add(offer);
        System.out.println("added succesfully");
    }

}
