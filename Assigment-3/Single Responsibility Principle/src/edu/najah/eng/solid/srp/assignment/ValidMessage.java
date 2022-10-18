package edu.najah.eng.solid.srp.assignment;

public class ValidMessage {
    private Boolean validString(String message) {
        return message != null && !message.isEmpty() && message.contains("@") && message.contains(".");
    }
    public Boolean isValidMailAddressFrom(String mailAddressFrom){
        return validString(mailAddressFrom);
    }
    public Boolean isValidMailAddressTo(String mailAddressTo){
        return validString(mailAddressTo);
    }
    public Boolean isValidMailSubject(String mailSubject){
        return mailSubject != null &&  !mailSubject.isEmpty() &&  mailSubject.length() > 30;
    }
    public Boolean isValidMailBody(String mailBody){
        return mailBody != null && !mailBody.isEmpty() ;
    }
    public Boolean isValidMessage(MailMessage mailMessage) {
        return isValidMailAddressFrom(mailMessage.getMailAddressFrom()) && isValidMailAddressTo(mailMessage.getMailAddressTo()) && isValidMailSubject(mailMessage.getMailSubject())&&isValidMailBody(mailMessage.getMailBody());
    }
}
