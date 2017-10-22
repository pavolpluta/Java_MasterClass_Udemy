package com.pavolpluta;

public class Main {

    public static void main(String[] args) {
        int number = 5;
        int finalNumber = 20;
        int evenNumbers = 0;

        while (number <= finalNumber){
            if (!isEvenNumber(number)){
                number++;
                continue;
            }

            System.out.println("Even number " + number);
            evenNumbers ++;
            number++;

            if (evenNumbers == 5){
                System.out.println("Even numbers found: " + evenNumbers);
                break;
            }
        }

    }

    public static boolean isEvenNumber(int n){
        if (n%2 == 0){
            return true;
        }
        return false;
    }
}
