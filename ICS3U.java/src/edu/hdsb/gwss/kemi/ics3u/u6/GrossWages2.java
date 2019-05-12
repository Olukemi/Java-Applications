/*
 * Name: Kemi
 * Date: May 10th 2019
 * Version: v0.01
 * Description: This program calculates the gross wage based on the hours and the amount paid per hour but also dependent 
on the country listed.
 */
package edu.hdsb.gwss.kemi.ics3u.u6;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author 1ODUJINRIKEM
 */
public class GrossWages2 {

    /**
     * @param args the command line arguments
     */
    // This is the main method that prints the header and calls the second method below and gives the parameter/argumment
    //hours to use in calculating the gross wage per country.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of hours worked: ");
        double hours = input.nextDouble();
        System.out.format("%-16s %10s %18s\n", "Country", "Hourly Wage", "Gross Wage");
        countryWage(hours);

    }
    // This method calculates the gross wage per country with sub parts. Canada and US have an overtime hourly wage 
    //while the 4 other countries listed don't and don't have any additional calculations. This method also prints the
    // country name, hourly wage and gross wage because if it was put in main the method it, grossWage## doesn't exist.
    public static void countryWage(double a) {
        double remainingHours;
        double grossWageCAN, grossWageUS, grossWageBG, grossWageCH, grossWageDR, grossWageHT;
        NumberFormat money = NumberFormat.getCurrencyInstance();
        //canada & us
        if (a > 40) {
            remainingHours = a - 40;
            grossWageCAN = (40 * 14) + (remainingHours * 1.5 * 14);
            grossWageUS = (40 * 15.84) + (remainingHours * 1.5 * 15.84);
        } else {
            grossWageCAN = a * 14;
            grossWageUS = a * 15.84;
        }
        //others
        grossWageBG = a * 0.15;
        grossWageCH = a * 1.77;
        grossWageDR = a * 1.60;
        grossWageHT = a * 0.55;

        System.out.format( "%-18s %9s %18s\n", "Canada", "$14.00", money.format(grossWageCAN));
        System.out.format( "%-18s %9s %18s\n", "USA", "$15.84", money.format(grossWageUS));
        System.out.format( "%-18s %9s %18s\n", "Bangladesh", "$0.15", money.format(grossWageBG));
        System.out.format( "%-18s %9s %18s\n", "China", "$1.77", money.format(grossWageCH));
        System.out.format( "%-18s %9s %18s\n", "Dominican Republic", "$1.60", money.format(grossWageDR));
        System.out.format( "%-18s %9s %18s\n", "Haiti", "$0.55", money.format(grossWageHT));

    }
}
