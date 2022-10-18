package edu.najah.eng.solid.srp.assignment.impl;

import edu.najah.eng.solid.srp.assignment.MailMessage;
import edu.najah.eng.solid.srp.assignment.interfaces.ISendMail;

public class SendMail implements ISendMail {
    @Override
    public void send(MailMessage mailMessage) {
        if (mailMessage.isValidMessage()){
            // Code for getting Email setting and send invoice mail
            System.out.println("valid message.");
        } else {
            //show error message for the user
            System.out.println("invalid message.");
        }
    }
}
