/*
 * Name: Kemi
 * Date: April 4th 2019.
 * Version: v0.01
 * Description: A loop that demonstratse that the result of adding the numbers 
1, 1/2, 1/4, 1/8, 1/16, ... and so on gets closer and closer to 2 without becoming 2 

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
        //CONSTANTS: N/A
        
        //VARIABLES: This extends the length of the decimal numbers so that the value doesn't
        //print the number in scientific notation.
        long num2 = 1;
        
        //SPLASH PAGE: Tells the user what the program does.
        System.out.println("Closer to Two");
        System.out.println("This program demonstrates that the result of adding the numbers 1, 1/2, 1/4, 1/16, ... \n" +
"and so on gets closer to 2 without becoming 2.");
        //INPUT: N/A
        
        //PROCESSING & OUTPUT : This loop does the math and replaces number 1 and 2 each time with the previous number
        //and divides number 2 in half. The code continues until the value is 2 and num1 isn't.
        for(double num1 = 0, value = 0; value < 2; num1 = value, num2 = num2 * 2){
           value = num1 + (1.0 / num2);
           System.out.println(num1 + " + 1/" + num2 + " = " + value);
    
        }
        
    }
    
}
