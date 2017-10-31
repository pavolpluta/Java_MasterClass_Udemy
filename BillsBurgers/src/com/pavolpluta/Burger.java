package com.pavolpluta;

import java.util.ArrayList;
import java.util.List;

public class Burger {
    private BreadRoll breadRoll;
    private String meat;
    private double basePrice;
    private double totalPrice;

    private double onionPrice = 0.75;
    private double cheddarPrice = 1;
    private double tomatoPrice = 0.75;
    private double lettucePrice = 0.5;
    private double picklePrice = 0.75;
    private double garlicSaucePrice = 0.3;

    private List<AdditionalIngredients> additions = new ArrayList<>();
    private int maxAdditions;

    public Burger(BreadRoll breadRoll, String meat) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.basePrice = 5;
        this.maxAdditions = 4;
        if (breadRoll == BreadRoll.SPECIAL){
            this.basePrice += 1;
        }
        setTotalPrice(getBasePrice());
    }

    public void addIngredient(AdditionalIngredients ingredient){

        if (additions.size() < maxAdditions){
            switch (ingredient){
                case ONION:
                    this.totalPrice += onionPrice;
                    this.additions.add(ingredient);
                    System.out.println(ingredient + " has been added. Price: " + this.totalPrice);
                    break;
                case TOMATO:
                    this.totalPrice += tomatoPrice;
                    this.additions.add(ingredient);
                    System.out.println(ingredient + " has been added. Price: " + this.totalPrice);
                    break;
                case CHEDDAR:
                    this.totalPrice += cheddarPrice;
                    this.additions.add(ingredient);
                    System.out.println(ingredient + " has been added. Price: " + this.totalPrice);
                    break;
                case LETTUCE:
                    this.totalPrice += lettucePrice;
                    this.additions.add(ingredient);
                    System.out.println(ingredient + " has been added. Price: " + this.totalPrice);
                    break;
                case PICKLE:
                    this.totalPrice += picklePrice;
                    this.additions.add(ingredient);
                    System.out.println(ingredient + " has been added. Price: " + this.totalPrice);
                    break;
                case GARLIC_SAUCE:
                    this.totalPrice += garlicSaucePrice;
                    this.additions.add(ingredient);
                    System.out.println(ingredient + " has been added. Price: " + this.totalPrice);
                    break;
                default:
                    System.out.println("Invalid ingredient");
                    break;
            }
        }else{
            System.out.println("Only " + maxAdditions + " additions can be added.");
        }
    }

    public void removeIngredient(AdditionalIngredients ingredient){
        if(additions.contains(ingredient)){
            switch (ingredient){
                case ONION:
                    this.totalPrice -= onionPrice;
                    break;
                case TOMATO:
                    this.totalPrice -= tomatoPrice;
                    break;
                case CHEDDAR:
                    this.totalPrice -= cheddarPrice;
                    break;
                case LETTUCE:
                    this.totalPrice -= lettucePrice;
                    break;
                case PICKLE:
                    this.totalPrice -= picklePrice;
                    break;
                case GARLIC_SAUCE:
                    this.totalPrice -= garlicSaucePrice;
                    break;
            }
            this.additions.remove(ingredient);
            System.out.println(ingredient + " has been removed. Price: " + this.totalPrice);
        }else{
            System.out.println("Ingredient not found!");
        }

    }

    public void showEverything(){

        System.out.println("\nBase burger: " + getBasePrice() +"\nAdditions: " + checkAdditionsPrices() + "\nGrand Total: " +
         Math.round(getTotalPrice() * 100.0)/100.0 + "\n");
    }

    ArrayList checkAdditionsPrices(){
        ArrayList<String> ingredientsArray = new ArrayList<String>();
       for (AdditionalIngredients ingredient : additions){
           switch (ingredient){
               case ONION:
                   ingredientsArray.add(ingredient + ": " + onionPrice);
                   break;
               case CHEDDAR:
                   ingredientsArray.add(ingredient + ": " + cheddarPrice);
                   break;
               case PICKLE:
                   ingredientsArray.add(ingredient + ": " + picklePrice);
                   break;
               case GARLIC_SAUCE:
                   ingredientsArray.add(ingredient + ": " + garlicSaucePrice);
                   break;
               case LETTUCE:
                   ingredientsArray.add(ingredient + ": " + lettucePrice);
                   break;
               case TOMATO:
                   ingredientsArray.add(ingredient + ": " + tomatoPrice);
                   break;
               default:
                   break;
           }
       }
        return ingredientsArray;
    }

    public int getMaxAdditions() {
        return maxAdditions;
    }

    public void setMaxAdditions(int maxAdditions) {
        this.maxAdditions = maxAdditions;
    }

    public void setTotalPrice(double price) {

        this.totalPrice = price;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public BreadRoll getBreadRoll() {
        return breadRoll;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setBreadRoll(BreadRoll breadRoll) {
        this.breadRoll = breadRoll;
    }
}
