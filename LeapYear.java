/* Program: LeapYear v1.0
 * Author: Samuel Cho
 * Description: Determine whether user inputted year
 * is leap year.
 */

import java.util.Scanner; // enable user input
public class LeapYear {
    public static void main(String[] args) {

        int year; // number to determine whether leap year
        boolean leap; // whether leap year or not

        // setup scanner
        Scanner scnr = new Scanner(System.in);

        // read in value
        System.out.print("Enter year: ");
        year = scnr.nextInt();

        // FINISH ME

        System.out.println("Leap year? " + leap);
    }
}