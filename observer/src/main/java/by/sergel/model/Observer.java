package by.sergel.model;

import org.springframework.mail.javamail.JavaMailSender;

public interface Observer {
    void sendMessage(String from, String message, String subject, JavaMailSender sender);
}
