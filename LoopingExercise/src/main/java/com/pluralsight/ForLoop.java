package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) {

        for(int x = 10; x >= 1; x--) {
            System.out.println(x);
            if(x == 1) {
                System.out.println("Launch!");
            }
        }

    }
}
