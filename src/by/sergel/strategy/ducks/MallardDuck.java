package by.sergel.strategy.ducks;

import by.sergel.strategy.behaviorImpl.FlyWithWings;
import by.sergel.strategy.behaviorImpl.Quack;

public class MallardDuck extends Duck{
    public MallardDuck(){
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display(){
        System.out.println("I'm mallard duck!");
    }
}
