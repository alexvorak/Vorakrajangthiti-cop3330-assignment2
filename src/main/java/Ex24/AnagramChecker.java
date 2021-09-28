/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Vorakrajangthiti
 */
package Ex24;

import java.util.Scanner;
import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args)
    {
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.print("Enter the first string: ");
        Scanner scanner = new Scanner(System.in);
        String firstInput = scanner.nextLine();

        System.out.print("Enter the second string: ");
        Scanner scanner2 = new Scanner(System.in);
        String secondInput = scanner2.nextLine();

        isAnagram(firstInput,secondInput);
    }
    static void isAnagram(String firstInput, String secondInput)
    {
        String scl1 = firstInput.replaceAll("\\s","");
        String scl2 = secondInput.replaceAll("\\s","");
        boolean status = true;
        if (scl1.length() != scl2.length())
        {
            status = false;
        }
        else {
            char[]ArrayScl1 = scl1.toLowerCase().toCharArray();
            char[]ArrayScl2 = scl2.toLowerCase().toCharArray();
            Arrays.sort(ArrayScl1);
            Arrays.sort(ArrayScl2);
            status = Arrays.equals(ArrayScl1,ArrayScl2);
        }
        if(status)
        {
            System.out.printf("\"%s\" and \"%s\" are anagrams.", firstInput, secondInput);
        }
        else
        {
            System.out.printf("\"%s\" and \"%s\" are not anagrams.", firstInput, secondInput);
        }
    }

}


