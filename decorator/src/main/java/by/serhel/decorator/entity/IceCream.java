package by.serhel.decorator.entity;

public class IceCream extends CondimentDecorator{
    private Drink drink;

    public IceCream(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", ice cream mmm";
    }

    @Override
    public double cost() {
        return 0.99 + drink.cost();
    }
}
