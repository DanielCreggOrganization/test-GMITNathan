package ie.gmit.scannerpack;

/**
 * ScanFlow - Using monthMethod custom method called to print user entered numerical month as a string for the month
 */

import java.util.Scanner;

public class ScanFlow {
    static void monthMethod(int month) {
        if (month == 1) {
            System.out.println("January");
        } else if (month == 2) {
            System.out.println("February");
        } else if (month == 3) {
            System.out.println("March");
        } else if (month == 4) {
            System.out.println("April");
        } else if (month == 5) {
            System.out.println("May");
        } else if (month == 6) {
            System.out.println("June");
        } else if (month == 7) {
            System.out.println("July");
        } else if (month == 8) {
            System.out.println("August");
        } else if (month == 9) {
            System.out.println("September");
        } else if (month == 10) {
            System.out.println("October");
        } else if (month == 11) {
            System.out.println("November");
        } else if (month == 12) {
            System.out.println("December");
        } else {
            System.out.println("Not a valid month!");
        }
    }

    public static void main(String[] args) {
        System.out.print("Input Month You Were Born (1-12): ");
        Scanner inp = new Scanner(System.in);
        int month = inp.nextInt();
        System.out.print("The month you were born is: "); 
        monthMethod(month);
    }
}