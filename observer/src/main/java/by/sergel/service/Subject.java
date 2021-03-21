package by.sergel.service;


import by.sergel.model.Observer;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver(String message, String subject);
}
