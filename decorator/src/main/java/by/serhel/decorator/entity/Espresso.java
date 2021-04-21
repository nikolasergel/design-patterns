package by.serhel.decorator.entity;

public class Espresso extends Drink{
    public Espresso() {
        this.description = "Espresso mmm";
    }

    @Override
    public double cost() {
        return 3;
    }
}
