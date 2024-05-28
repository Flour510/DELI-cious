package com.pluralsight.services;

import java.util.Scanner;

public class Checkout
{
    static Scanner userInput = new Scanner(System.in);

    public void display() {

        // display the checkout screen
        System.out.println();
        System.out.println("*".repeat(85));
        System.out.println();
        System.out.println("                                     Checkout \uD83D\uDED2 ");

        // checkout logic here

        System.out.println();
        System.out.println("               \uD83E\uDD24 Checkout complete. Get ready to unwrap happiness! \uD83D\uDE0B");
        System.out.println();
        System.out.println("*".repeat(85));
    }
}
