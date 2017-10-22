package com.pavolpluta;

public class Main {

    public static void main(String[] args) {

	    for (int i=2; i<=8; i++){
            System.out.println("10K at " + i + "% interest = " + String.format("%.2f",calculateInterestRate(10000.0,i )));
        }
        System.out.println("");
//        REVERSED
//        for (int i=8; i>=2; i--){
//            System.out.println("10K at " + i + "% interest = " + String.format("%.2f",calculateInterestRate(10000.0,i )));
//        }

        // COUNTING PRIMES
        int counter = 0;
        for (int i = 4; i <= 30; i++){
            if (isPrime(i)) {
                System.out.println(i + " is a prime.");
                counter ++;
            }
            if (counter == 5){
                break;
            }
        }
    }

    public static double calculateInterestRate(double amount, double interestRate){
        return (amount * (interestRate/100));
    }

    public static boolean isPrime(int n){
        if (n==1){
            return false;
        }

        for (int i=2; i <= (long) Math.sqrt(n); i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
}
