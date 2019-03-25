/*
 * Name: Kemi
 * Date: March 22st 2019
 * Version: v0.01
 * Description: 
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
        //CONSTANTS
        
        //VARIABLES
        
        //SPLASH PAGE
        System.out.println("Leap Year Calculator");
        
        //INPUT
        System.out.println("Please enter a year:");
        int year = input.nextInt();
        
        //PROCESSING
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0){
            System.out.println("The year " + year + " IS NOT a leap year:(");
        }
        else if (year % 4 == 0 && year % 100 == 0 && year % 400 != 0){
            System.out.println("The year " + year + " IS a leap year!");
        }
        else if (year % 4 != 0){
            System.out.println("The year " + year + " IS NOT a leap year:(");
        }
        //OUPUT
    }
    
}
