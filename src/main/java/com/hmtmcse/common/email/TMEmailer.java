package com.hmtmcse.common.email;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class TMEmailer {

    private SMTPConfig smtpConfig;

    public TMEmailer(SMTPConfig smtpConfig){
        this.smtpConfig = smtpConfig;
    }

    private Properties getEmailConfig(){
        Properties properties = new Properties();
        properties.put("mail.smtp.host", smtpConfig.host);
        properties.put("mail.smtp.port", smtpConfig.port);
        if (smtpConfig.auth){
            properties.put("mail.smtp.auth", "true");
        }
        if (smtpConfig.encryption != null && smtpConfig.encryption.equals(SMTPConfig.SSL)){
            properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            properties.put("mail.smtp.socketFactory.port", smtpConfig.port);
        }else if (smtpConfig.encryption != null && smtpConfig.encryption.equals(SMTPConfig.TLS)){
            properties.put("mail.smtp.starttls.enable", "true");
        }
        return properties;
    }


    private Authenticator getAuthentication(){
        return new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(smtpConfig.username, smtpConfig.password);
            }
        };
    }

    private Session getSession(){
        return Session.getInstance(getEmailConfig(), getAuthentication());
    }


    private InternetAddress address(String address) throws TMEmailException {
        try {
            return new InternetAddress(address);
        } catch (AddressException e) {
            throw new TMEmailException(e.getMessage());
        }
    }


    public Boolean send(String to, String subject, String body) throws TMEmailException {
        try {
            Message message = new MimeMessage(getSession());
            message.setFrom(address(smtpConfig.sendFrom));
            message.setRecipient(Message.RecipientType.TO, address(to));
            message.setSubject(subject);
            message.setText(body);
            Transport.send(message);
        } catch (MessagingException e) {
            throw new TMEmailException(e.getMessage());
        }
        return true;
    }

}
