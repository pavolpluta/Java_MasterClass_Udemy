package com.pavolpluta;

public class DeluxeBurger extends Burger {
    private String drink;
    private boolean chips;

    @Override
    public String toString() {
        return "DeluxeBurger{" +
                " breadRoll= " + getBreadRoll() +
                " meat= " + '\''+ getMeat() + '\'' +
                " drink='" + drink + '\'' +
                ", chips=" + chips +
                '}';
    }

    public DeluxeBurger(BreadRoll breadRoll, String meat, String drink, Boolean chips) {
        super(breadRoll, meat);
        this.drink = drink;
        this.chips = chips;
        this.setMaxAdditions(0);
        this.setBasePrice(10);
        this.setTotalPrice(getBasePrice());
    }

    @Override
    public void showEverything() {
        System.out.println("\nBase burger: " + getBasePrice() +"\nAdditions: " + "drink: " + this.drink + ", chips: " + this.chips +
                "\nGrand Total: " +
                Math.round(getTotalPrice() * 100.0)/100.0 + "\n");
    }
}
