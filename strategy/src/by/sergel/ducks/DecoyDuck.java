package by.sergel.ducks;

import by.sergel.behaviorImpl.FlyNoWay;
import by.sergel.behaviorImpl.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck(){
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
    }

    @Override
    public void display(){
        System.out.println("Oh NOOOOOOOO, I'm decoy duck((((");
    }
}
