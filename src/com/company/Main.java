package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100 + 1);
        System.out.println("Try to guess the number: ");
        boolean hasWon = false;

        for (int i = 10; i > 0; i--) {
            System.out.println("You have " + i + " guess(es) left. Choose again.");
            int guessedNumber = in.nextInt();

            if (randomNumber == guessedNumber) {

                hasWon = true;
                break;
            } else if (randomNumber < guessedNumber) {
                System.out.println("The number is lesser than your guess");
            } else {
                System.out.println("The number is greater than your guess");
            }
        }
        if(hasWon) {
            System.out.println("This is correct !!!.\nCongratulation You Won");
        } else {
            System.out.println("Game Over, You ran out of guesses");
        }

	// write your code here
    }
}
