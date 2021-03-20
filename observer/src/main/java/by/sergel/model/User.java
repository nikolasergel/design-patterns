package by.sergel.model;

import lombok.Getter;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@Getter
public class User implements Observer{
    private Long id;
    private String email;
    private String name;

    @Override
    public void sendMessage(String from, String message, String subject, JavaMailSender sender) {
        SimpleMailMessage mess = new SimpleMailMessage();
        mess.setFrom(from);
        mess.setTo(email);
        mess.setSubject(subject);
        mess.setText(message);
        sender.send(mess);
    }
}
