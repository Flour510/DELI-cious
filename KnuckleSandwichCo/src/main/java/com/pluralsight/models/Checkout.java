package com.pluralsight.models;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class Checkout
{
    static Scanner userInput = new Scanner(System.in);
    double subtotal;
//    File folder = new File("C:\\Users\\florpreciado\\Pluralsight\\DELI-cious\\KnuckleSandwichCo\\receiptFile");



    public void display(Order order) {

        // display the checkout screen
        System.out.println();
        System.out.println("*".repeat(85));
        System.out.println();
        System.out.println("                                     Checkout \uD83D\uDED2 ");

        // checkout logic here
        subtotal = order.calculateTotal();
//        LocalDate date = LocalDate.now();
//        File myFile = new File(folder,date.toString());

        System.out.println("                                        Order Summary");
        for(Product prod:order.displayOrderDetails()){
            System.out.println(prod);
//
//            try (FileWriter fileWriter = new FileWriter(myFile, true); // try with resources
//                 PrintWriter writer = new PrintWriter(fileWriter);
//            ) {
//                writer.println(prod); // write the deposit information to the file
//                writer.flush();
//                System.out.println("Enjoy !");
//            } catch (IOException ex) {
//                System.out.println("Error occurred. Deposit did not go through. ");
//                ex.printStackTrace();
//            }

        }
        System.out.println();
        System.out.println();
        System.out.println("Your order total is: " + subtotal);




        System.out.println();
        System.out.println("               \uD83E\uDD24 Checkout complete. Get ready to unwrap happiness! \uD83D\uDE0B");
        System.out.println();
        System.out.println("*".repeat(85));
    }




}
