/*
 * Name: Kemi
 * Date: Mar 8th 2019
 * Version: v0.01
 * Description: The application will prompt the user for the required input, 
                complete the calculation, and display the results.
 *
 */
package edu.hdsb.gwss.kemi.ics3u.u2;

/**
 *
 * @author 1ODUJINRIKEM
 */
import java.util.Scanner;
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Splash Page:
        System.out.println("WELCOME TO THE FUTURE VALUES CALCULATOR!");
        System.out.println("Once you have entered the total amount of money you would like to have\n "
                + "this calculator will calculate the\n"
                + "the regular payment per month needed to get that amount during your chosen lenght of time.\n"
                + "total amount of money from the user!\nLET'S BEGIN!");
        System.out.println("-----------------------------------------------------------------------------");
        
        //Constants:
        System.out.println("Please enter the length of time for each of your regular deposit:");
        System.out.println("Enter the number of years you want to allow your "
                + "regular payment:");
        System.out.println("Now enter the total amount of money you want at the end of your set period(# of years):");
        System.out.println("Enter your desired interest rate per year:");
        
        //Variables
        double regulartime_N;
        double fulltime_n;
        double totalamount_A;
        double interestrate_r;
        double interestrate_i;
       
        //Input:
        regulartime_N = input.nextDouble();
        fulltime_n = input.nextDouble() * 12;
        totalamount_A = input.nextDouble();
        interestrate_r = input.nextDouble() / 100.0;
    
        
        //Prossecing:
        interestrate_i = interestrate_r / regulartime_N; 
        double regularpayment_R = Math.round((totalamount_A * interestrate_i) / (Math.pow((1 + interestrate_i), fulltime_n)-1));
        //Output:
        
        System.out.println("Your regualar payment is "  + regularpayment_R + " a month for " + fulltime_n + " months");
        
    }
    
}
