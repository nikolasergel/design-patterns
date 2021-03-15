package by.sergel.strategy.behaviorImpl;

import by.sergel.strategy.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack(){
        System.out.println("Squeak, squeak...");
    }
}
