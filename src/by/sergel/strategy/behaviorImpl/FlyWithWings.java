package by.sergel.strategy.behaviorImpl;

import by.sergel.strategy.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with wings and I'm looking great!!!");
    }
}
