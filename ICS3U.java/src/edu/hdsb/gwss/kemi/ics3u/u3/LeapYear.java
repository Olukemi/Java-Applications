/*
 * Name: Kemi
 * Date: March 22st 2019
 * Version: v0.01
 * Description: Determines whether a year input is a leap year or not.
 */
package edu.hdsb.gwss.kemi.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author kemij
 */
public class LeapYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //CONSTANTS: N/A
        
        //VARIABLES: N/A
        
        //SPLASH PAGE: Displays Leap Year Calculator 
        System.out.println("LEAP YEAR CALCULATOR");
        
        //INPUT: Asks for input(any year)
        System.out.println("Please enter a year:");
        int year = input.nextInt();
        
        //PROCESSING & //OUPUT: Prints out if input is a leap year or not depending 
        //on the if statements below
        if (year % 100 == 0 && year % 400 != 0){
            System.out.println("The year " + year + " IS NOT a leap year:(");
        }
        else if (year % 4 == 0 || (year % 400) == 0){
            System.out.println("The year " + year + " IS a leap year!");
        }
        else if (year % 4 != 0 ){
            System.out.println("The year " + year + " IS NOT a leap year:(");
        }
    }
    
}
