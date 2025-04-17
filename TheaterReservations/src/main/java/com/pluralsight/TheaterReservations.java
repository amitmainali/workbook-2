package com.pluralsight;

import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Please enter your name: ");
        String fullName = input.nextLine().trim();


        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String date = input.nextLine().trim();


        System.out.print("How many tickets would you like? ");
        int ticketCount = input.nextInt();


        String[] nameParts = fullName.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[nameParts.length - 1];


        String ticketWord = (ticketCount == 1) ? "ticket" : "tickets";


        System.out.println(ticketCount + " " + ticketWord + " reserved for " + date + " under " + lastName + ", " + firstName);
    }
}