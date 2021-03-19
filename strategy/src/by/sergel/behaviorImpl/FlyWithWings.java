package by.sergel.behaviorImpl;

import by.sergel.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with wings and I'm looking great!!!");
    }
}
