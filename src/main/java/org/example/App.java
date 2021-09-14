package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Anh Pham
 *
 */
public class App 
{
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        int drivingAge = 16;
        String ageString = myApp.readInput("What is your age? ");
        int age = myApp.convertString(ageString);
        String outputString = myApp.generateOutputString(age, drivingAge);
        myApp.printOutputString(outputString);
    }

    private void printOutputString(String outputString) {
        System.out.println(outputString);
    }

    private String generateOutputString(int age, int drivingAge) {
        String outputString = age >= drivingAge
                ? "You are old enough to legally drive."
                : "You are not old enough to legally drive.";
        return outputString;
    }

    private String readInput(String str) {
        System.out.print(str);
        String input = in.nextLine();
        return input;
    }

    private int convertString(String ageString) {
        int num = Integer.parseInt(ageString);
        return num;
    }
}