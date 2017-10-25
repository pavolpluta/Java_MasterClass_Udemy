package com.pavolpluta;

public class Cupboard {
    private int juicesCount;
    private String color;

    public Cupboard(int juicesCount, String color) {
        this.juicesCount = juicesCount;
        this.color = color;
    }

    public void searchForFood(){
        System.out.println("Searching for food in the cupboard...");
    }

    public int getJuicesCount() {
        return juicesCount;
    }

    public String getColor() {
        return color;
    }
}
