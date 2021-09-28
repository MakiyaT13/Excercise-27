/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Makiya Thomas
 */
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String fn = input.nextLine();

        System.out.print("Enter the last name: ");
        String ln = input.nextLine();

        System.out.print("Enter the ZIP code: ");
        int zip = input.nextInt();

        System.out.print("Enter the employee ID: ");
        String id = input.nextLine();

        int fn_length = fn.length();
        int ln_length = ln.length();

        if (fn_length < 2) {
            System.out.print("The first name must be at least 2 characters long.");
        }
        if (ln_length < 2) {
            System.out.print("TThe last name must be at least 2 characters long.");
        }
        if (fn.equals("")) {
            System.out.print("The first name must be filled in.");
        }
        if (ln.equals("")) {
            System.out.print("The last name must be filled in.");
        }

        if (zip < 9999) {
            System.out.print("The zipcode must be a 5 digit number.");
        }
    }
}