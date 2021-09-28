/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Vorakrajangthiti
 */
package Ex34;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeListRemoval {
    public static void main(String[] Args)
    {
        ArrayList<String>arrlist= new ArrayList<String>(5);
        arrlist.add("John Smith");
        arrlist.add("Jackie Johnson");
        arrlist.add("Chris Jones");
        arrlist.add("Amanda Cullen");
        arrlist.add("Jeremy Goodwin");

        System.out.print("There are 5 employees:\n");
        for (String list : arrlist)
        {System.out.println(list);}

        System.out.print("\nEnter an employee name to remove: ");
        Scanner scanner = new Scanner(System.in);
        String removal = scanner.nextLine();
        arrlist.remove(removal);
        System.out.print("There are "+ arrlist.size()+ " employees:\n");
        for (String list : arrlist)
        {System.out.println(list);}

    }
}
