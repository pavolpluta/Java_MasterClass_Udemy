package com.pavolpluta;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Default car");
        Lambo lambo = new Lambo("Lamborghini",200);
        Chevrolet chevy = new Chevrolet("Camaro",300);

        List<Car> cars = new ArrayList<>();
        cars.add(car);
        cars.add(lambo);
        cars.add(chevy);

        for(Car c:cars){
            System.out.println("====");
            c.startEngine();
            c.accelerate();
            c.brake();
        }

    }
}


// Classes SHOULD be declared in their own files, but for this example, I'll declare them here
class Car {
    private String name;  //protected pouzivat v krajnom pripade
    private String carStatus;
    private int wheels = 4;
    private int horsePower = 0;
    public Car() {
        this.carStatus = "Off";
    }

    public String getName() {
        return name;
    }

    public String getCarStatus() {
        return carStatus;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setCarStatus(String carStatus) {
        this.carStatus = carStatus;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public void startEngine(){
        System.out.println("CAR| Vrrm, vrrm....Engine of a " + this.name +  " has started.");
        carStatus = "Started";
    }

    public void accelerate(){
        System.out.println( "CAR| " + this.name + " accelerated");
        carStatus = "Running";
    }

    public void brake(){
        System.out.println("CAR|" + this.name + " has stopped.");
        carStatus = "Neutral";
    }
}

class Lambo extends Car{
    public Lambo(String name,int horsePower) {
        this.setName(name);
        this.setHorsePower(horsePower);
    }

    public void startEngine(){
        System.out.println("LAMBO| vrrrrrrm... " + getName() + " has started.");
    }

    public void accelerate(){
        System.out.println("LAMBO| " + getName() + " nastartovalo");
        setCarStatus("Running");
    }

}

class Chevrolet extends Car{

    public Chevrolet(String name,int horsePower) {
        this.setName(name);
        this.setHorsePower(horsePower);
    }


    public void accelerate(){
        System.out.println("CHEVROLET| " + getName() + " IS GOING ON.");
    }

    public void brake(){
        System.out.println("CHEVROLET| " + getName() + " IS DED.");
        setCarStatus("Neutral");
    }
}


