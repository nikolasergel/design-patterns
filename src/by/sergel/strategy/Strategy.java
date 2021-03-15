package by.sergel.strategy;

import by.sergel.strategy.ducks.*;

public class Strategy {
    public static void main(String[] args) {
        Duck duck1 = new DecoyDuck();
        Duck duck2 = new MallardDuck();
        Duck duck3 = new RedHeadDuck();
        Duck duck4 = new RubberDuck();

        System.out.println("Decoy duck:");
        duck1.display();
        duck1.performFly();
        duck1.performQuack();
        System.out.println("");

        System.out.println("Mallard duck:");
        duck2.display();
        duck2.performFly();
        duck2.performQuack();
        System.out.println("");

        System.out.println("Read head duck:");
        duck3.display();
        duck3.performFly();
        duck3.performQuack();
        System.out.println("");

        System.out.println("Rubber duck:");
        duck4.display();
        duck4.performFly();
        duck4.performQuack();
    }
}
