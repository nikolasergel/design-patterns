package by.sergel.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "LOL") String name){
        return name;
    }
}
