package edu.najah.eng.solid.srp.assignment.impl;

import edu.najah.eng.solid.srp.assignment.Invoice;
import edu.najah.eng.solid.srp.assignment.MailMessage;
import edu.najah.eng.solid.srp.assignment.interfaces.IAddMail;

public class AddMail implements IAddMail {
    @Override
    public void insert(Invoice invoice) {
        // connect to database
        // execute insert command to add new record in database
        //close the database connection
        // Once Invoice has been added , send mail
        MailMessage mailMessage = new MailMessage("MailAddressFrom","MailAddressTo","MailSubject","MailBody");
        invoice.sendEmail(mailMessage);
    }

}
