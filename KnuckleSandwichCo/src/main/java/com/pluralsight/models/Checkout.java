package com.pluralsight.models;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Checkout
{
    static Scanner userInput = new Scanner(System.in);
    double subtotal;

    public void display(Order order)
    {
        // display the checkout screen and order summary
        System.out.println();
        System.out.println("                                     Receipt \uD83D\uDCC3 ");
        System.out.println();
        System.out.println("*".repeat(85));
        System.out.println();
        System.out.println("                      K n u c k l e   S a n d w i c h   C o. ");
        System.out.println("                                 444 East Oakland ");
        System.out.println("                                   510-333-1234");
        System.out.println();
        System.out.println("C a s h i e r: Flower");
        System.out.println();
        System.out.println("-".repeat(85));
        System.out.println();

        subtotal = order.calculateTotal();
        for(Product prod:order.displayOrderDetails())
        {
            System.out.println(prod);
        }

        System.out.println();
        System.out.println("Order Total: $ " + subtotal);
        System.out.println("-".repeat(85));
        System.out.println();
        System.out.println("               T h a n k   Y o u!   C h e c k o u t   C o m p l e t e. ");
        System.out.println();
        System.out.println("          \uD83E\uDD24 G e t   r e a d y   t o   u n w r a p   h a p p i n e s s! \uD83D\uDE0B ");
        System.out.println();
        System.out.println("*".repeat(85));
    }

    public void createCsv(Order order)  {
        LocalDateTime now = LocalDateTime.now();
        String fileName = "receiptFile/" + now.format(DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss")) + ".txt";
        File file = new File(fileName);

        try(FileWriter receiptWriter = new FileWriter(file);
            PrintWriter writer = new PrintWriter(receiptWriter);
        )
        {
            for(Product prod:order.displayOrderDetails())
            {
                writer.println(prod);
            }
            writer.println("Subtotal: $ " + subtotal);
        }
        catch (IOException exception)
        {

        }
        System.exit(1);
    }
}
