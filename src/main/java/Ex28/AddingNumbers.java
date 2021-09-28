/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Vorakrajangthiti
 */
package Ex28;
import java.util.Scanner;
public class AddingNumbers {
    public static void main(String[] Args)
    {
        int inputs = 6;
        int userInput;
        int userSum =0;
        for (int i=1; i<inputs; i++)
        {
            System.out.print("Enter a number: ");
            Scanner scanner = new Scanner(System.in);
            userInput = scanner.nextInt();
            userSum = userSum + userInput;
        }
        System.out.printf("The total is %d." ,userSum);
    }
}
