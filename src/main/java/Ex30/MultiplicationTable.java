/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Vorakrajangthiti
 */
package Ex30;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i <= 12; i++)
        {
            for (int j = 1; j <= 12; j++) {
                System.out.printf("%-5d", i*j);
            }
        System.out.println();
        }
    }}