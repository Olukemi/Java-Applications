/*
 * Name: Kemi
 * Date: April 7th 2019.
 * Version: v0.01
 * Description: Calculates the investing values over a choosen year period, 
an interest rate and yearly investments given by the user.
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
        //OBJECTS: This is used for user input and formatting money values.
        Scanner input = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        //CONSTANTS: N/A

        //VARIABLES: Place holders for the values given form the user. Year starts at 1.
        int year = 1;
        int yearEnd;
        double interest;
        double interestRate;
        double yearlyInvestment;
        
        //SPLASH PAGE: Tells the user how the program works.
        System.out.println("Compound Investing\n");
        System.out.println("This program will print out a title table that will display the amount \n"
                + "of a yearly investment over a period of up to 15 years.\n");

        //INPUT: Inputs from the user for yearly investments, interest rate and length of time in years.
        System.out.format("%-16s %6s\n", "Enter the yearly investment ", ":");
        yearlyInvestment = input.nextDouble();
        System.out.format("%-16s %6s\n", "Enter the interest rate (%)", ":");
        interestRate = input.nextDouble();
        System.out.format("%-16s %6s\n", "Enter the number of years", ":");
        yearEnd = input.nextInt();
        System.out.println(" ");

        //PROCESSING && OUTPUT: If the input is less than zero the code won't run, if not, the code runs 
        //for as long as the inputed year length is. This code calcuates the yearly amount per year using 
        //the interest rate and adding the yaerly investment each time.
        if (interestRate <= 0 || yearEnd > 15 || yearEnd <= 0 || yearlyInvestment <= 0) {
            System.out.println("INVALID INPUT. All input must be greater than 0 and years must be less or equal to 15");
        } else {
            System.out.format("%-1s %18s %12s %12s\n", "Year", "Amount in Account", "Interest","Total");

            for (double yearlyAmount = 0, total = 0; year <= yearEnd; year++) {
                yearlyAmount = total + yearlyInvestment;
                interest = yearlyAmount * (interestRate / 100);
                total = yearlyAmount + interest;
                System.out.format("%-2s %16s %15s %14s\n", year, money.format( yearlyAmount ), money.format (interest), money.format (total));
            }
        }

    }

}
