package by.serhel.decorator.entity;

public class Cappuccino extends Drink{
    public Cappuccino() {
        this.description = "Cappuccino oh yeeeeah";
    }

    @Override
    public double cost() {
        return 4.5;
    }
}
