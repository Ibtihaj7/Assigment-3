package edu.najah.eng.solid.srp.assignment;

public class MailMessage {
    private String mailAddressFrom;
    private String mailAddressTo;
    private String mailSubject;
    private String mailBody;
    public String getMailAddressFrom() { return mailAddressFrom; }
    public String getMailAddressTo() { return mailAddressTo; }
    public String getMailSubject() { return mailSubject; }
    public String getMailBody() { return mailBody; }

    //  not primitive
    public MailMessage(String mailAddressFrom, String mailAddressTo, String mailSubject, String mailBody) {
        ValidMessage validMessage = null;
        if(validMessage.isValidMailAddressFrom(mailAddressFrom)) this.mailAddressFrom =  mailAddressFrom;
        if(validMessage.isValidMailAddressTo(mailAddressTo)) this.mailAddressTo = mailAddressTo;
        if(validMessage.isValidMailSubject(mailSubject)) this.mailSubject =  mailSubject;
        if(validMessage.isValidMailBody(mailBody)) this.mailBody =  mailBody;

    }
    public boolean isValidMessage(){
        ValidMessage validMessage = null;
        return validMessage.isValidMessage(this);
    }
}
