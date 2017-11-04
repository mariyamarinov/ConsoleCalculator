package com.marypolka;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Utilities.showMenu();
        int userInput = scanner.nextInt();
        selectOperation(userInput);

    }

    private static void selectOperation(int userInput) {
        switch (userInput) {
            case 1:
                System.out.print("You choose to sum two digits. Please enter the first one: ");
                int firstNumber = scanner.nextInt();
                System.out.println();
                System.out.print("Please enter the second one: ");
                int secondNumber = scanner.nextInt();
                System.out.println();
                System.out.println("The result is: " + Utilities.sumNumbers(firstNumber, secondNumber));
                break;
            default:
                System.out.println("Invalid operation!");
        }
    }
}
