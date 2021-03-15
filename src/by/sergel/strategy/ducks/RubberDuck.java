package by.sergel.strategy.ducks;

import by.sergel.strategy.behaviorImpl.FlyNoWay;
import by.sergel.strategy.behaviorImpl.Squeak;

public class RubberDuck extends Duck{
    public RubberDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm really rubber duck!");
    }
}
