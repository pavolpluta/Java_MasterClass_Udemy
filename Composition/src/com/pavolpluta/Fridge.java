package com.pavolpluta;

public class Fridge {
    private boolean freezerIncluded;
    private int degreesInside;
    private Food food;

    public Fridge(boolean freezerIncluded, int degreesInside, Food food) {
        this.freezerIncluded = freezerIncluded;
        this.degreesInside = degreesInside;
        this.food = food;
    }

    public boolean isFreezerIncluded() {
        return freezerIncluded;
    }

    public int getDegreesInside() {
        return degreesInside;
    }

    public Food getFood() {
        return food;
    }


    public void countFood(){
        int allFood = food.getVegetablesCount() + food.getMilkProducts();
        System.out.println("Food in the fridge: " + allFood);
    }
}
