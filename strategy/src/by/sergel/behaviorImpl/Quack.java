package by.sergel.behaviorImpl;

import by.sergel.behavior.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack(){
        System.out.println("Quack, quack...");
    }
}
