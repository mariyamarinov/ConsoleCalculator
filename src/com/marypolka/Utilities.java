package com.marypolka;

public class Utilities {

    public static void showMenu() {
        System.out.println("Console calculator");
        System.out.println("---------------------");
        System.out.println("Choose operation from the menu");
        System.out.println("*******************************");
        System.out.println("Menu");
        System.out.println("*******************************");
        System.out.println("1. Sum two numbers");
        System.out.println("----------------------");
        System.out.println("Enter the number of the desired operation.");
    }

    public static int sumNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
