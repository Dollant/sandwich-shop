package com.pluralsight;

import java.util.Scanner;

public class POS_App {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

//        Prompt the user for the size of the sandwich (1 or 2):
//        a. 1: Regular: base price $5.45
//        b. 2: Large: base price $8.95
        System.out.println("Welcome to the sandwich shop!");
        System.out.println("Select a sandwich size: ");
        System.out.println("1 - Regular ($5.45)");
        System.out.println("2 - Large ($8.95)");
        System.out.print("Enter 1 or 2: ");
        int size = keyboard.nextInt();

        double basePrice = 0.0;

        if (size == 1) {
            basePrice = 5.45;
        } else if (size == 2) {
            basePrice = 8.95;
        } else {
            System.out.println("Invalid size selection. Defaulted to Regular ($5.25).");
            basePrice = 5.45;
        }
//        Prompt the user for their age:
//        a. Student (17 years old or younger) – receive a 10% discount
//        b. Seniors (65 years old or older) – receive a 20% discount
        System.out.print("Enter your age: ");
        int age = keyboard.nextInt();

        double discount = 0.0;
        String discountMessage = ("");
        if (age <= 17) {
            discount = 0.10;
            discountMessage = "Student discount applied: (10%)";
        } else if (age >= 65) {
            discount = 0.20;
            discountMessage = "Senior discount applied: (20%)";
        }

//        Display the cost of the sandwich to the screen
        double finalPrice = basePrice - (basePrice * discount);

        System.out.println("\n\t-Your Order-");
        System.out.println("Base Price: $" + basePrice);
        if (!discountMessage.isEmpty()) {
            System.out.println(discountMessage);
        }
        System.out.printf("Total cost: $%.2f%n", finalPrice);

        keyboard.close();
    }
}
