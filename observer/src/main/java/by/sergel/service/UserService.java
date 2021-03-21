package by.sergel.service;

import by.sergel.model.Observer;
import by.sergel.model.User;

import java.util.List;

public interface UserService {
    long getNewId();
    List<Observer> getObservers();
    void addUser(String email, String name);
    User getUserByEmail(String email);

}
