package edu.najah.eng.solid.srp.assignment;

import edu.najah.eng.solid.srp.assignment.interfaces.IAddMail;
import edu.najah.eng.solid.srp.assignment.interfaces.IDeleteMail;
import edu.najah.eng.solid.srp.assignment.interfaces.ISendMail;

import java.util.Date;

public class Invoice {
    private long amount;
    private Date invoiceDate;
    private IAddMail addMail;
    private IDeleteMail deleteMail;
    private ISendMail sendMail;

    public Invoice(long amount, Date invoiceDate) {
        this.amount = amount;
        this.invoiceDate = invoiceDate;
    }
    public void add()  {
        addMail.insert(this);
    }
    public void delete()  {
        deleteMail.remove();
    }
    public void sendEmail(MailMessage mailMessage)  {
        sendMail.send(mailMessage);
    }
}