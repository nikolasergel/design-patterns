package by.serhel.decorator.entity;

import java.util.Objects;

public class Whip extends CondimentDecorator{
    private Drink drink;

    public Whip(Drink drink) {
        this.drink = drink;
    }

    @Override
    public int hashCode() {
        return Objects.hash(drink);
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", whip";
    }

    @Override
    public double cost() {
        return drink.cost() + 0.20;
    }
}
