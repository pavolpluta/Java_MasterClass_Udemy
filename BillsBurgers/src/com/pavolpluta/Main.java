package com.pavolpluta;

public class Main {

    public static void main(String[] args) {
        Burger basic = new Burger(BreadRoll.BASIC,"beef");
        HealthyBurger healthy = new HealthyBurger("chicken");
        DeluxeBurger deluxe = new DeluxeBurger(BreadRoll.BASIC,"pork","Sprite",true);

        healthy.addIngredient(AdditionalIngredients.ONION);
        healthy.addIngredient(AdditionalIngredients.TOMATO);
        healthy.addIngredient(AdditionalIngredients.LETTUCE);
        healthy.addIngredient(AdditionalIngredients.GARLIC_SAUCE);
        healthy.addIngredient(AdditionalIngredients.GARLIC_SAUCE);
        healthy.addIngredient(AdditionalIngredients.GARLIC_SAUCE);
        healthy.removeIngredient(AdditionalIngredients.ONION);

        basic.showEverything();
        healthy.showEverything();
        deluxe.showEverything();

}
}
