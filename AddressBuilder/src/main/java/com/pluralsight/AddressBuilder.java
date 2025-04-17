package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Please provide the following information:");

        System.out.print("Full name: ");
        String fullName = input.nextLine();

        System.out.print("Billing Street: ");
        String billingStreet = input.nextLine();

        System.out.print("Billing City: ");
        String billingCity = input.nextLine();

        System.out.print("Billing State: ");
        String billingState = input.nextLine();

        System.out.print("Billing Zip: ");
        String billingZip = input.nextLine();

        System.out.print("Shipping Street: ");
        String shippingStreet = input.nextLine();

        System.out.print("Shipping City: ");
        String shippingCity = input.nextLine();

        System.out.print("Shipping State: ");
        String shippingState = input.nextLine();

        System.out.print("Shipping Zip: ");
        String shippingZip = input.nextLine();


        StringBuilder addressOutput = new StringBuilder();

        addressOutput.append(fullName).append("\n");

        addressOutput.append("Billing Address:\n");
        addressOutput.append(billingStreet).append("\n");
        addressOutput.append(billingCity).append(", ")
                .append(billingState).append(" ")
                .append(billingZip).append("\n");

        addressOutput.append("Shipping Address:\n");
        addressOutput.append(shippingStreet).append("\n");
        addressOutput.append(shippingCity).append(", ")
                .append(shippingState).append(" ")
                .append(shippingZip);

        // Print final output
        System.out.println("\nCustomer Information:");
        System.out.println(addressOutput.toString());
    }
}
