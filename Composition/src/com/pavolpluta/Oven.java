package com.pavolpluta;

public class Oven {
    private int temperature;
    private String type;

    public Oven(int temperature, String type) {
        this.temperature = temperature;
        this.type = type;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getType() {
        return type;
    }
}
