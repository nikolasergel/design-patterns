package by.sergel.service;

import by.sergel.model.Observer;
import by.sergel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import java.util.List;

public class Publisher implements Subject{
    @Autowired
    private JavaMailSender sender;
    @Value("mail.username")
    private String from;
    private List<Observer> observers;

    public Publisher(List<Observer> observers) {
        this.observers = observers;
    }

    @Override
    public void addObserver(Observer observer) {
        if(!observers.contains(observer)){
            observers.add(observer);
        }
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

    public List<Observer> getObservers(){
        return observers;
    }
}
