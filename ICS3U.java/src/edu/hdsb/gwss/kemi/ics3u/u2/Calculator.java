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
        System.out.println("Once you have inputed your regular payment per month "
                + "this calculator will calculate the\n"
                + "total amount of money earned by the end of your chosen time. An alternative\n"
                + "to this calculator is calculating the required regular payment for a given\n"
                + "total amount of money from the user!\nLET'S BEGIN!");
        System.out.println("-----------------------------------------------------------------------------");
        
        //Constants:
        System.out.println("Please enter the length of time for each of your regular deposit:");
        System.out.println("Enter your length of time you want to allow your "
                + "regular payment:");
        System.out.println("Now enter the total amount of money you want at the end of your set period(#years):");
        System.out.println("Enter interest rate per annum");
        
        //Variables
        double regulartime_N;
        double fulltime_n;
        double totalamount_A;
        double interestrate_r;
        double interestrate_i;
       
        //Input:
        regulartime_N = input.nextDouble();
        fulltime_n = input.nextDouble();
        totalamount_A = input.nextDouble();
        interestrate_r = input.nextDouble();
        interestrate_i = input.nextDouble();
        
        //Prossecing:
        interestrate_i = interestrate_r / regulartime_N; 
        double regularpayment_R = (totalamount_A * interestrate_i) / Math.pow((1 + interestrate_i), fulltime_n);
        //Output:
        
        System.out.println("Your regualar time payment is "  + regulartime_N + " a year");
        System.out.println("Your total amount period is " + fulltime_n + "years");
    }
    
}
