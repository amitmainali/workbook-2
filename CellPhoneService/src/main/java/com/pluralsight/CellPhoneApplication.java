package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone phone = new CellPhone();

        System.out.println("What is the serial number?");
        phone.setSerialNumber(scanner.nextInt());
        scanner.nextLine();

        System.out.println("What model is the phone?");
        phone.setModel(scanner.nextLine());

        System.out.println("Who is the carrier?");
        phone.setCarrier(scanner.nextLine());

        System.out.println("What is the phone number?");
        phone.setPhoneNumber(scanner.nextLine());

        System.out.println("Who is the owner of the phone?");
        phone.setOwner(scanner.nextLine());

        phone.printCellInfo();
        scanner.close();



    }

}