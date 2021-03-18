package by.sergel.observer;

import java.util.LinkedList;
import java.util.List;

public class MailSender implements Subject {
    private List<Observer> observers;

    public MailSender() {
        observers = new LinkedList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer obs : observers){
            obs.update("TEST!");
        }
    }
}
