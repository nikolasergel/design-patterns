package by.sergel.repository;

import by.sergel.model.User;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserRepositoryImpl implements UserRepository{
    private List<User> users;
    public UserRepositoryImpl(){
        users = new LinkedList<>() {{
            add(new User(1L, "micro.belka19@gmail.com","Belka"));
            add(new User(2L,"aid405060@gmail.com","Pidor"));
            add(new User(3L,"jetbrains123@gmail.com","Brain"));
        }};
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public List<String> getAllEmails() {
        return users
                .stream()
                .map(user -> user.getEmail())
                .collect(Collectors.toList());
    }

    @Override
    public User getUserByEmail(String email) {
        return users.stream()
                .filter(user -> user.getEmail().equals(email))
                .findFirst()
                .get();
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
