package com.pluralsight;

public class DiceRoller {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int roll1, roll2;
        int countTwo = 0, countFour = 0, countSix = 0, countSeven = 0;

        for (int x = 0; x < 100; x++) {
            roll1 = dice.roll();
            roll2 = dice.roll();

            System.out.printf("Roll %d:  %d - %d  Sum: 10\n", roll1, roll2, (roll1 + roll2));

            if ((roll1 + roll2) == 2) {
                countTwo++;
            } else if ((roll1 + roll2) == 4) {
                countFour++;
            } else if ((roll1 + roll2) == 6) {
                countSix++;
            } else if ((roll1 + roll2) == 7) {
                countSeven++;
            }
        }

        System.out.println("\n\t**** Craig's Casino ****");
        System.out.println("--------- Roll Summary ---------");


        System.out.printf("Number of times 2 was rolled: %02d%n", countTwo);
        System.out.printf("Number of times 4 was rolled: %02d%n", countFour);
        System.out.printf("Number of times 6 was rolled: %02d%n", countSix);
        System.out.printf("Number of times 7 was rolled: %02d%n", countSeven);
    }

}