package com.pavolpluta;

public class Kitchen {
    private Fridge fridge;
    private Cupboard cupboard;
    private Cooker cooker;

    public Kitchen(Fridge fridge, Cupboard cupboard, Cooker cooker) {
        this.fridge = fridge;
        this.cupboard = cupboard;
        this.cooker = cooker;
    }

    public void turnOnPlates(int number){
        cooker.setPlatesOn(3);
    }

    public Fridge getFridge() {
        return fridge;
    }

    public Cupboard getCupboard() {
        return cupboard;
    }

}
