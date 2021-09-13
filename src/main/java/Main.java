/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kaylee Laughner
 */
import java.util.Scanner;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        System.out.println("What is your current age?");
        Scanner input = new Scanner(System.in);
        int current = input.nextInt();

        System.out.println("At what age would you like to retire?");
        Scanner input2 = new Scanner(System.in);
        int retire = input2.nextInt();

        int years = retire - current;

        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        int retireYear = currentYear + years;

        System.out.println("You have " + years + " years left until you can retire.");
        System.out.println("It's " + currentYear + ", so you can retire in " + retireYear + ".");
    }
}