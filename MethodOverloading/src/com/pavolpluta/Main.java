package com.pavolpluta;

public class Main {

    public static void main(String[] args) {
        double cen = calcFeetAndInchesToCentimeters(13);
        System.out.println(cen + " cm");
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet >=0) && (inches >= 0 && inches <= 12)){
            double cm = feet * 30.48;
            cm += inches * 2.54;
            return cm;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if ((inches >= 0)){
            if (inches <= 12){
                return inches * 2.54;
            }
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println("Feet: " + feet);
            System.out.println("Inches: " + remainingInches);
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
        return -1;
    }
}
