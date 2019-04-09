/*
 * Name: Kemi
 * Date: April 4th 2019
 * Version: v0.01
 * Description: Use a loop to demonstrate that the result of adding the numbers 
1, 1/2, 1/4, 1/8, 1/16, ... and so on gets closer and closer to 2 without becoming 

 */
package edu.hdsb.gwss.kemi.ics3u.u4;

/**
 *
 * @author 1ODUJINRIKEM
 */
public class CloserToTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONSTANTS
        //VARIABLES
        long num2 = 1;
        //SPLASH PAGE
        System.out.println("Closer to Two");
        System.out.println("This program demonstrates that the result of adding the numbers 1, 1/2, 1/4, 1/16, ... \n" +
"and so on gets closer to 2 without becoming 2.");
        //INPUT: N/A
        //PROCESSING & OUTPUT : i is the starting value, n is 2

        for(double num1 = 0, value = 0; value < 2; num1 = value, num2 = num2 * 2){
           value = num1 + (1.0 / num2);
           System.out.println(num1 + " + 1/" + num2 + " = " + value);
    
        }
        
    }
    
}
