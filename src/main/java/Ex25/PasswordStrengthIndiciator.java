/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Vorakrajangthiti
 */
package Ex25;

import java.util.Scanner;
import java.util.Arrays;
import java.util.*;


public class PasswordStrengthIndiciator {
    public static void main(String[] args) {
        System.out.print("Please enter a password\n");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        passwordValidator(password);
    }

    public static void passwordValidator(String password) {
        int x = password.length();
        boolean lower = false, upper = false, digit = false, special = false;
        Set<Character> set = new HashSet<>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '='));
        for (char i : password.toCharArray()) {
            if (Character.isLowerCase(i))
                lower = true;
            if (Character.isUpperCase(i))
                upper = true;
            if (Character.isDigit(i))
                digit = true;
            if (set.contains(i))
                special = true;
        }
        if (digit && lower && upper && special && (x >= 8)) {
            System.out.printf("The password '%s' is a very strong password", password);
        } else if ((lower || upper || special) && (x >= 5)) {
            System.out.printf("The password '%s' is a strong password", password);
        } else if ((lower || upper || special) && (x >= 3)) {
            System.out.printf("The password '%s' is a weak password", password);
        } else {
            System.out.printf("The password '%s' is a very weak password", password);
        }
    }
}
