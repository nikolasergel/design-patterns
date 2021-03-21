package by.sergel.repository;

import by.sergel.model.User;

import java.util.List;

public interface UserRepository {
    List<User> getAllUsers();
    List<String> getAllEmails();
//    User getUserByEmail(String email);
//    void removeUser(User user);
    User getUserByEmail(String email);
    void addUser(User user);
}
