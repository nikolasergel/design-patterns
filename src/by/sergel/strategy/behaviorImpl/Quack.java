package by.sergel.strategy.behaviorImpl;

import by.sergel.strategy.behavior.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack(){
        System.out.println("Quack, quack...");
    }
}
