package com.pavolpluta;

public class Car extends Vehicle {
    private int wheels;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String type, int wheels, int gears, boolean isManual) {
        super(type);
        this.wheels = wheels;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }


    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Current gear set to: " + currentGear);
    }

    public void changeSpeed(int speed, int direction){
        System.out.println("Car.changeSpeed(): Speed: " + speed + " Direction: " + direction);
        move(speed,direction);
    }



    public int getWheels() {
        return wheels;
    }

//    @Override
//    public void increaseSpeed(int speed) {
//        int currentCarSpeed = getCurrentSpeed();
//        currentCarSpeed += speed;
//        this.currentGear += 1;
//        System.out.println("Car speed increased by " + speed + ". Current speed: " + currentCarSpeed + " Current gear: " + this.currentGear);
//        setCurrentSpeed(currentCarSpeed);
//    }
//
//    @Override
//    public void decreaseSpeed(int speed) {
//        int currentCarSpeed = getCurrentSpeed();
//        if (currentCarSpeed - speed > 0){
//            currentCarSpeed -= speed;
//            this.currentGear -= 1;
//            System.out.println("Car speed decreased by " + speed + ". Current speed: " + currentCarSpeed + " Current gear: " + this.currentGear);
//            setCurrentSpeed(currentCarSpeed);
//        }else{
//            System.out.println("Cannot decrease speed.");
//        }
//    }


}
