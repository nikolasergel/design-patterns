package by.sergel.behaviorImpl;

import by.sergel.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack(){
        System.out.println("Squeak, squeak...");
    }
}
