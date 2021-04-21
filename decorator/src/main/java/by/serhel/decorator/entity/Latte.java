package by.serhel.decorator.entity;

public class Latte extends Drink{
    public Latte() {
        this.description = "Latte is so milky";
    }

    @Override
    public double cost() {
        return 4;
    }
}
