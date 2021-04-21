package by.serhel.decorator.entity;

public class Mocha extends CondimentDecorator{
    private Drink drink;

    public Mocha(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.description + ", mocha";
    }

    @Override
    public double cost() {
        return 0.49 + drink.cost();
    }
}
