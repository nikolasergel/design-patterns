package by.sergel.controllers;

import by.sergel.model.Observer;
import by.sergel.model.User;
import by.sergel.service.Publisher;
import by.sergel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {
    @Autowired
    private Publisher publisher;
    @Autowired
    private UserService userService;


    @GetMapping("/")
    public String greeting(@RequestParam(value = "message", defaultValue = "Hello") String message){
        return message;
    }

    @GetMapping("/send")
    public String sendMessages(@RequestParam String subject, @RequestParam String message){
        publisher.notifyObserver(message, subject);
        return "redirect:/";
    }

    @GetMapping("/add")
    public String addUser(@RequestParam String email, @RequestParam String name){
        userService.addUser(email, name);
        return "redirect:/?message=Successful";
    }

    @GetMapping("/unsubscribe")
    public List<Observer> unsubscribe(@RequestParam String email){
        publisher.removeObserver(userService.getUserByEmail(email));
        return publisher.getObservers();
    }

    @GetMapping("/subscribe")
    public List<Observer> subscribe(@RequestParam String email){
        publisher.addObserver(userService.getUserByEmail(email));
        return publisher.getObservers();
    }
}
