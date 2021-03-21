package by.sergel.service;

import by.sergel.model.Observer;
import by.sergel.model.User;
import by.sergel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public long getNewId() {
        List<User> users = userRepository.getAllUsers();
        return users.get(users.size() - 1).getId() + 1;
    }

    @Override
    public List<Observer> getObservers() {
        return userRepository.getAllUsers()
                .stream()
                .map(user -> (Observer)user)
                .collect(Collectors.toList());
    }

    @Override
    public void addUser(String email, String name) {
        userRepository.addUser(new User(getNewId(), email, name));
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.getUserByEmail(email);
    }
}
