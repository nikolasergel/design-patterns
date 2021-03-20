package by.sergel.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;

import java.util.LinkedList;
import java.util.List;

public class Publisher implements Subject{
    @Autowired
    private JavaMailSender sender;
    @Value("mail.username")
    private String from;
    private List<Observer> observers;

    public Publisher() {
        this.observers = new LinkedList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String message, String subject) {
        for(Observer o : observers){
            o.sendMessage(from, message, subject, sender);
        }
    }
}
