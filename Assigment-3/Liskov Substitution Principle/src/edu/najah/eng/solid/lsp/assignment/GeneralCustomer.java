package edu.najah.eng.solid.lsp.assignment;

import java.util.ArrayList;

public abstract class GeneralCustomer {
    protected ArrayList<Offer> offers = null;
    public GeneralCustomer(){
        offers = new ArrayList<>();
    }
    public ArrayList<Offer> getOffers(){
        ArrayList<Offer> tmpOffers = new ArrayList<>();
        for (Offer offer : offers) {
            tmpOffers.add(offer);
        }
        return tmpOffers;
    }
    public abstract void addOffers(Offer offer);
}
