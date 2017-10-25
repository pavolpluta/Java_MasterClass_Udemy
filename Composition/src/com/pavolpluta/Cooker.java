package com.pavolpluta;

public class Cooker {
    private String type;
    private int platesCount;
    private boolean hasOven;
    private Oven oven;

    public Cooker(String type, int platesCount, Oven oven) {
        this.type = type;
        this.platesCount = platesCount;
        this.hasOven = true;
    }

    public Cooker(String type, int platesCount) {
        this.type = type;
        this.platesCount = platesCount;
        this.hasOven = false;
    }

    public void setPlatesOn(int plates){
        if (plates == 1){
            System.out.println(plates + " plate was set on.");
        }else if (plates > 1 && plates <= 4){
            System.out.println(plates + " plates was set on.");
        }else{
            System.out.println("There are only " + this.platesCount + " plates on this cooker!");
        }
    }

    public String getType() {
        return type;
    }

    public boolean isHasOven() {
        return hasOven;
    }


}
