/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Vorakrajangthiti
 */
package Ex29;


import java.util.Scanner;
public class HandlingBadInput {
    public static void main(String[] Args) {
        boolean flag;
        String userVal;
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.print("What is the rate of return? ");
            userVal = scanner.nextLine();
            try {
                Integer.parseInt(userVal);
                flag = false;
            } catch (NumberFormatException ex) {
                System.out.println("Sorry. That's not a valid input");
                flag = true;
            }
        } while (flag);
        int RoR = Integer.parseInt(userVal);
        System.out.printf("It will take %d years to double your initial investment.", 72 / RoR);
    }
}