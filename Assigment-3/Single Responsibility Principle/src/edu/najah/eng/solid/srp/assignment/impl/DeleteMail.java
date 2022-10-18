package edu.najah.eng.solid.srp.assignment.impl;

import edu.najah.eng.solid.srp.assignment.interfaces.IDeleteMail;

public class DeleteMail implements IDeleteMail {
    @Override
    public void remove() {
        // connect to database
        // execute delete command to delete the invoice from the database
        //close the database connection
        System.out.println("closed database connection.. ");
    }
}
