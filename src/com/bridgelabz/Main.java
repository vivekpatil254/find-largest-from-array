package com.bridgelabz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i, large;
        int numbers[] = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int numberOfElementsInArray = scanner.nextInt();
        System.out.println("Enter " + numberOfElementsInArray + " elements in array");
        for (i = 0; i < numberOfElementsInArray; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Array Elements are : ");
        large = numbers[0];
        for (i = 1; i < numberOfElementsInArray; i++) {
            if (numbers[i] > large)
                large = numbers[i];
        }
        System.out.println("The Largest number from array is : " + large);
    }
}
