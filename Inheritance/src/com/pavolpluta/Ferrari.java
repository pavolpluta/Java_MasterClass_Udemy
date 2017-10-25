package com.pavolpluta;

public class Ferrari extends Car {
    private int yearOfProduction;

    public Ferrari(int gears, int yearOfProduction) {
        super("Ferrari", 4, gears, false);
        this.yearOfProduction = yearOfProduction;
    }

    public void accelerate(int rate){
        int newSpeed = getCurrentSpeed() + rate;

        if(newSpeed == 0){
            stop();
            changeGear(1);
        }else if(newSpeed > 0 && newSpeed <= 30){
            changeGear(1);
        }else if(newSpeed > 30 && newSpeed <= 50){
            changeGear(2);
        }else if(newSpeed > 50 && newSpeed < 80){
            changeGear(3);
        }else{
            changeGear(4);
        }
        if (newSpeed > 0) {
            changeSpeed(newSpeed,getCurrentDirection());
        }
    }

    //    @Override
//    public void increaseSpeed(int speed) {
//        System.out.println("Ferrari speed increased.");
//        super.increaseSpeed(speed);
//
//
//    }
//
//    @Override
//    public void decreaseSpeed(int speed) {
//        super.decreaseSpeed(speed);
//        System.out.println("Ferrari speed decreased");
//    }

}
