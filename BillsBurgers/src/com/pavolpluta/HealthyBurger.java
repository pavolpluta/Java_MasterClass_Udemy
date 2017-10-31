package com.pavolpluta;

public class HealthyBurger extends Burger {

    public HealthyBurger(String meat){
        super(BreadRoll.BROWN_RYE,meat);
        this.setBasePrice(7);
        this.setTotalPrice(getBasePrice());
    }

    @Override
    public void addIngredient(AdditionalIngredients ingredient) {
        this.setMaxAdditions(6);
        super.addIngredient(ingredient);
    }


}
