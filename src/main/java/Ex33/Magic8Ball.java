/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Vorakrajangthiti
 */
package Ex33;

import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[] Args)
    {

        Scanner scanner = new Scanner(System.in);
        Random response = new Random();
        String input;
        int selection;
            selection = response.nextInt(4)+1;
            System.out.print("What is your question?\n");
            input = scanner.nextLine();
        if (selection == 1){
            System.out.print("\nYes.");}
        else if (selection == 2){
            System.out.print("\nNo.");}
        else if (selection == 3){
           System.out.print("\nMaybe.");}
        else if (selection == 4){
            System.out.print("\nAsk again later.");}
    }
}

