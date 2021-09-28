/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Vorakrajangthiti
 */
package Ex26;

import java.util.Scanner;
import java.lang.*;

import static Ex26.PaymentCalculator.calculateMonthsUntilPaidOff;

public class MonthsToPayCreditCard {
    public static void main(String[] args)
    {
        System.out.print("What is your balance? ");
        Scanner scanner = new Scanner(System.in);
        double balance = scanner.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        Scanner scanner2 = new Scanner(System.in);
        double APR = scanner2.nextDouble();

        System.out.print("What is the monthly payment you can make? ");
        Scanner scanner3 = new Scanner(System.in);
        double monthly = scanner3.nextDouble();

       double monthsleft = calculateMonthsUntilPaidOff(balance,APR,monthly);
       int months3 = (int)Math.ceil(monthsleft);
        System.out.printf("It will take you " + months3 + " months to pay off this card. ");

    }
}
class PaymentCalculator {

    public static double calculateMonthsUntilPaidOff (double balance, double APR, double monthly) {
        double APRnew = APR/100.00;
        double APRDaily = APRnew/365.00;
        double monthspart1 = -1.00*(1.00/30.00);
        double BalMon = balance/monthly;
        double monthspart2 = (1+BalMon*(1-(Math.pow(1+APRDaily,30))));
        double months2 =  (monthspart1) * (Math.log(monthspart2));
        double monthspart3 = months2/(Math.log(1+APRDaily));
        return monthspart3;

    }
}
