package com.pavolpluta;

public class Food {
    private int vegetablesCount;
    private int milkProducts;
    private String meats;

    public Food(int vegetablesCount, int milkProducts, String meats) {
        this.vegetablesCount = vegetablesCount;
        this.milkProducts = milkProducts;
        this.meats = meats;
    }

    public int getVegetablesCount() {
        return vegetablesCount;
    }

    public int getMilkProducts() {
        return milkProducts;
    }

    public String getMeats() {
        return meats;
    }


}
