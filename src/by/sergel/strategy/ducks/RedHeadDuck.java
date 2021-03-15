package by.sergel.strategy.ducks;

import by.sergel.strategy.behavior.QuackBehavior;
import by.sergel.strategy.behaviorImpl.FlyWithWings;
import by.sergel.strategy.behaviorImpl.Quack;

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
