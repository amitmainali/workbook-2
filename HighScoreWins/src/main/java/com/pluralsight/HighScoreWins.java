package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a game score (format: Home:Visitor|21:9): ");
        String gameInput = input.nextLine().trim();

        String[] parts = gameInput.split("\\|");

        if (parts.length != 2) {
            System.out.println("Invalid format. Please use 'TeamA:TeamB|ScoreA:ScoreB'");
            return;
        }

        String[] teams = parts[0].split(":");

        String[] scores = parts[1].split(":");

        if (teams.length != 2 || scores.length != 2) {
            System.out.println("Invalid format. Make sure both teams and scores are separated by ':'");
            return;
        }

        String teamA = teams[0];
        String teamB = teams[1];

        int scoreA, scoreB;

        try {
            scoreA = Integer.parseInt(scores[0]);
            scoreB = Integer.parseInt(scores[1]);
        } catch (NumberFormatException e) {
            System.out.println("Scores must be valid integers.");
            return;
        }

        if (scoreA > scoreB) {
            System.out.println("Winner: " + teamA);
        } else if (scoreB > scoreA) {
            System.out.println("Winner: " + teamB);
        } else {
            System.out.println("It's a tie!");
        }
    }
}