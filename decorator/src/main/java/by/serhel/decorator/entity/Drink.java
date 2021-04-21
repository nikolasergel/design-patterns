package by.serhel.decorator.entity;

public abstract class Drink {
    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
