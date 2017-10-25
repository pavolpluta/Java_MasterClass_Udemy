package com.pavolpluta;

public class Main {

    public static void main(String[] args) {
        Oven oven = new Oven(200,"gas");
        Fridge fridge = new Fridge(true,4,new Food(5,3,"chicken, pork"));
        Cupboard cupboard = new Cupboard(3,"brown");
        Cooker cooker = new Cooker("electric",4, oven);

        Kitchen kitchen = new Kitchen(fridge,cupboard,cooker);

        kitchen.getFridge().countFood();
        kitchen.turnOnPlates(4);
        kitchen.getCupboard().searchForFood();
    }
}
