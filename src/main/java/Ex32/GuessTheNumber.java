/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Vorakrajangthiti
 */
package Ex32;

import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String args[]) {
        boolean flag = false;
        int userGuessNumber = 0;
        int secretNumber1 = (int) (Math.random() * 10);
        int secretNumber2 = (int) (Math.random() * 100);
        int secretNumber3 = (int) (Math.random() * 1000);

        System.out.println("Let's play Guess the Number!\n");
        do {
            System.out.print("Enter the difficulty (1, 2, or 3): ");
            Scanner difficulty = new Scanner(System.in);
            int difficulty2 = difficulty.nextInt();
            if (difficulty2 == 1) {
                int count = 0;
                System.out.print("I have my number. What's your guess? ");
                Scanner userInput = new Scanner(System.in);
                if (userInput.hasNextInt()) {
                    userGuessNumber = userInput.nextInt();
                    if (userGuessNumber == secretNumber1) {
                        count++;
                        System.out.printf("You got it in %d guesses", count);
                        break;
                    } else if (userGuessNumber < secretNumber1) {
                        System.out.println("Too low. Guess again.");
                        count++;
                        flag = true;
                    } else if (userGuessNumber > secretNumber1) {
                        System.out.println("Too high. Guess again.");
                        count++;
                        flag = true;
                    } else {
                        System.out.println("Enter a Valid Integer");
                        count++;
                        flag = true;
                        break;
                    }
                }
            }
        } while (userGuessNumber != secretNumber1);
    }
}


