/*
 * Name: Kemi
 * Date: May 10th 2019
 * Version: v0.01
 * Description: This program calculates the gross wage based on the hours and the amount paid per hour.
 */
package edu.hdsb.gwss.kemi.ics3u.u6;

import java.util.Scanner;

/**
 *
 * @author 1ODUJINRIKEM
 */
public class GrossWages {

    /**
     * @param args the command line arguments
     */
    //This method asks for input and calls on the method below, called hoursandWage
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of hours worked: ");
        double hours = input.nextDouble();
        System.out.println("Please enter the hourly wage:");
        double wage = input.nextDouble();
        hoursAndWage( hours, wage);

    }

    // This accounts for the math and calculation of the gross wage based on user input
    public static void hoursAndWage(double hours, double wage) {
        double remainingHours;
        double grossWage;
        if (hours > 40){
            remainingHours = hours - 40;
            grossWage = (40 * wage) + (remainingHours * 1.5 * wage);
        } else {
            grossWage = hours * wage;
        }
        System.out.format("Gross Wage: $%.2f", grossWage);
        
    }

}
