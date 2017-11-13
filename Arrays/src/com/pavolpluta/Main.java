package com.pavolpluta;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myArray = getIntegers(5);
        printArray(myArray);

        int[] sortedArray = sortIntegers(myArray);

        printArray(sortedArray);
        printArray(myArray);

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " numbers:");
        int[] array = new int[number];
        try {
            for (int i = 0; i < number; i++) {
                array[i] = scanner.nextInt();
            }
        } catch (InputMismatchException e) {
            System.err.println("You are only allowed to enter the whole numbers!");
        }
        return array;
    }

    public static void printArray(int[] array){
        System.out.println(Arrays.toString(array));
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArr = new int[array.length];
        for(int i=0;i<array.length;i++){
            sortedArr[i] = array[i];
        }

        for(int i = 0; i < (sortedArr.length) ;i++){
            for(int j = 0;j< (sortedArr.length) - 1; j++){
                if (sortedArr[j] < sortedArr[j+1]){
                    int tmp = sortedArr[j];
                    sortedArr[j] = sortedArr[j+1];
                    sortedArr[j+1] = tmp;
                }
            }
        }
        return sortedArr;
    }
}
