package com.pavolpluta;

public class Vehicle {
    private int currentSpeed;
    private String type;
    private int currentDirection;

    public Vehicle(String type) {
        this.type = type;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");
    }

    public void move(int speed, int direction){
        currentSpeed = speed;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentSpeed + " in direction " + currentDirection);
    }

    public void stop(){
        this.currentSpeed = 0;
    }

//    public void increaseSpeed(int speed){
//        this.currentSpeed +=speed;
//        System.out.println("Vehicle speed increased by " + speed + ". Current speed: " + this.currentSpeed);
//    }
//
//    public void decreaseSpeed(int speed){
//        if (this.currentSpeed - speed > 0){
//            this.currentSpeed -=speed;
//            System.out.println("Vehicle speed decreased by " + speed + ". Current speed: " + this.currentSpeed);
//        }else{
//            System.out.println("Cannot decrease speed.");
//        }
//    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public String getType() {
        return type;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
