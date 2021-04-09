import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

public class mailSender {
    public String deneme2(String string) throws EmailException {

        EmailAttachment attachment = new EmailAttachment();
        attachment.setPath(string);
        attachment.setDisposition(EmailAttachment.ATTACHMENT);
        attachment.setDescription("Picture of bad indentation");
        attachment.setName("BadIndentation");
        // Create the email message
        MultiPartEmail email = new MultiPartEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("your-mail@gmail.com", "your-password"));
        email.setSSLOnConnect(true);
        email.setFrom("blabla@hotmail.com");
        email.setSubject("CommonsEmail Test");
        email.setMsg("CommonsEmail test mail ... :-)");
        email.addTo("bla-bla@hotmail.com");
        // add the attachment
        email.attach(attachment);
        // send the email
        email.send();
        return "Mail Sended";

    }
}
