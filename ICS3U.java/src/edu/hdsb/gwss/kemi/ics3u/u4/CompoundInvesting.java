/*
 * Name: Kemi
 * Date: April 7th 2019
 * Version: v0.01
 * Description: 
 */
package edu.hdsb.gwss.kemi.ics3u.u4;

/**
 *
 * @author 1ODUJINRIKEM
 */
import java.text.NumberFormat;
import java.util.Scanner;

public class CompoundInvesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        //CONSTANTS

        //VARIABLES
        int year = 1;
        int yearEnd;
        double interest;
        double interestRate;
        double yearlyInvestment;
        //SPLASH PAGE
        System.out.println("Compound Investing\n");
        System.out.println("This program will print out a title table that will display the amount \n"
                + "of a yearly investment over a period of up to 15 years.\n");

        //INPUT
        System.out.format("%-16s %6s\n", "Enter the yearly investment ", ":");
        yearlyInvestment = input.nextDouble();
        System.out.format("%-16s %6s\n", "Enter the interest rate (%)", ":");
        interestRate = input.nextDouble();
        System.out.format("%-16s %6s\n", "Enter the number of years", ":");
        yearEnd = input.nextInt();
        System.out.println(" ");

        //PROCESSING && OUTPUT
        if (interestRate <= 0 || yearEnd > 15 || yearEnd <= 0 || yearlyInvestment <= 0) {
            System.out.println("INVALID INPUT. All input must be greater than 0 and years must be less or equal to 15");
        } else {
            System.out.format("%-1s %18s %12s %12s\n", "Year", "Amount in Account", "Interest","Total");

            for (double yearlyAmount = 0, total = 0; year <= yearEnd; year++) {
                yearlyAmount = total + yearlyInvestment;
                interest = yearlyAmount * (interestRate / 100);
                total = yearlyAmount + interest;
                System.out.format("%-1s %16s %15s %14s\n", year, money.format( yearlyAmount ), money.format (interest), money.format (total));
            }
        }

    }

}
