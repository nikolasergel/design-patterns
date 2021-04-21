package by.serhel.decorator;


import by.serhel.decorator.entity.*;

public class Main {
    public static void main(String[] args) {
        Drink drink = new Espresso();
        drink = new Mocha(drink);
        drink = new Whip(drink);

        Drink drink1 = new Latte();
        drink1 = new Whip(drink1);
        drink1 = new IceCream(drink1);
        drink1 = new Whip(drink1);

        System.out.println(drink.getDescription() + ", cost " + drink.cost() + "$");
        System.out.println(drink1.getDescription() + ", cost " + drink1.cost() + "$");
    }
}
