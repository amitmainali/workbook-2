package com.pluralsight;

public class TestStatistics {
    public static void main(String[] args) {

        int[] testScores = {10,90,23,75,86,93,20,40,80,39};
        double sum = 0;

        for (int i = 0; i < testScores.length - 1; i++) {
            sum += testScores[i+1];
        }
        sum += testScores[0];
        double average = sum/(testScores.length);

        System.out.println("Average Score: " + average);

        int max = 0;

        for (int i = 0; i < testScores.length; i++) {
            if (max <= testScores[i]) {
                max = testScores[i];
        }
        }
        System.out.println("Highest Score: " + max);

        int min = testScores[0];

        for (int i = 0; i < testScores.length; i++) {
            if (min >= testScores[i]) {
                min = testScores[i];
            }
        }
        System.out.println("Lowest Score: " + min);
        
//        if (testScores.length%2 == 0) {
//
//        }
//        else {
//
//        }
    }
}