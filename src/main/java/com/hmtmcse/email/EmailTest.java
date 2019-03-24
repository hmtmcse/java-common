package com.hmtmcse.email;

public class EmailTest {

    public static void main(String[] args) throws TMEmailException {


//        https://support.google.com/mail/answer/7104828?hl=en&visit_id=636890436349786261-1229872120&rd=3

        SMTPConfig smtpConfig = new SMTPConfig();
        smtpConfig.host = "smtp.gmail.com";
        smtpConfig.port = "465";
        smtpConfig.username = "email@gmail.com";
        smtpConfig.password = "password";
        smtpConfig.sendFrom = "email@gmail.com";
        smtpConfig.encryption = SMTPConfig.SSL;

        TMEmailer tmEmailer = new TMEmailer(smtpConfig);
        tmEmailer.send("to@gmail.com", "Java Test Email", "This is Test Email");

    }
}
