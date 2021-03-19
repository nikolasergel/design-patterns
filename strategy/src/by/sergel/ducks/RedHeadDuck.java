package by.sergel.ducks;

import by.sergel.behavior.QuackBehavior;
import by.sergel.behaviorImpl.FlyWithWings;
import by.sergel.behaviorImpl.Quack;

public class RedHeadDuck extends Duck {
    public RedHeadDuck(){
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm read head duck!");
    }
}
