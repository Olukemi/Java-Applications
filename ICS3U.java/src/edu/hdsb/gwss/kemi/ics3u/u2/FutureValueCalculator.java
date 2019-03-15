/*
 * Name: Kemi
 * Date: Mar 8th 2019
 * Version: v0.03
 * Description: The application will prompt the user for the required input, 
                complete the calculation, and display the results. It is a future values calculator that calculates the regular deposits instead.
 *
 */
package edu.hdsb.gwss.kemi.ics3u.u2;

/**
 *
 * @author 1ODUJINRIKEM
 */
import java.util.Scanner;
public class FutureValueCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Variables: Future value parameters are in decimals if user wants to
        double regularTime_N;
        double fullTime_n;
        double totalAmount_A;
        double interestRate_r;
        double interestRate_i;
        double altInterestRate_i;
        double altInterestRate_r;
        
        //Splash Page: Introduction to calculator and instructions as well
        System.out.println("WELCOME TO THE FUTURE VALUES CALCULATOR!");
        System.out.println("Once you have entered the total amount of money you would like to have,this calculator will calculate the\n"
                + "regular payment per month needed to get that amount during your chosen lenght of time.\n"
                + "LET'S BEGIN!");
        System.out.println("-----------------------------------------------------------------------------");
        
        //Constants: N/A
        
        //Input: Input of user future value parameters
        System.out.println("Please enter the number of times per year for your regular deposit (max is 12):");
        regularTime_N = input.nextDouble();
        System.out.println("Enter the number of years you want to allow your regular payment:");
        fullTime_n = input.nextDouble() * 12;
        System.out.println("Now enter the total amount of money you want at the end of your set period(# of years):");
        totalAmount_A = input.nextDouble();
        System.out.println("Enter your lowest desired interest rate per year:");
        interestRate_r = input.nextDouble() / 100.0;
        System.out.println("Enter your alternate(hightest) interest rate to compare and view savings:");
        altInterestRate_r =  input.nextDouble() / 100.0;
        
        interestRate_i = interestRate_r / regularTime_N;
        altInterestRate_i = altInterestRate_r / regularTime_N;
      
        //Prossecing: Future values equation but instead solves for the regular deposit
        double regularPayment_R = ((totalAmount_A * interestRate_i) / (Math.pow((1 + interestRate_i), fullTime_n)-1));
        double altRegularPayment_R = ((totalAmount_A * altInterestRate_i) / (Math.pow((1 + altInterestRate_i), fullTime_n)-1));
        double savings = regularPayment_R - altRegularPayment_R;
        
        //Output: Prints the regular deposit and how much is saved after a specific interest rate of 7
        System.out.println("-------------------------------------------------------------------------------");
        System.out.format("Your regualar payment is "  + "$%.2f a month for " + fullTime_n + " months.\n" , regularPayment_R);
        System.out.format("Your alternate regualar payment is "  + "$%.2f a month for " + fullTime_n + " months.\n" , altRegularPayment_R);        
        System.out.format("KEEP IN MIND that you could have saved $%.2f per month if your rate was your highest value.\n" , savings);
        System.out.println("You could possibly save more if you increase your interest rate.");
    }
    
}
