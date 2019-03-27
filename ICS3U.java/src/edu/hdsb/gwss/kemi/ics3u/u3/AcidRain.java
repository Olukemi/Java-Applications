/*
 * Name: Kemi
 * Date: March 21st 2019
 * Version: v0.01
 * Description: This program determines if the pH level in water is safe for fish.
 */
package edu.hdsb.gwss.kemi.ics3u.u3;

/**
 *
 * @author 1odujinrikem
 */
import java.util.Scanner;
public class AcidRain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //CONSTANTS: N/A
        final int resultInvalid = 0;
        final int resultAlkaline = 1;
        final int resultAcidic = 2;
        final int resultNeutral = 3;
     
        //VARIABLES: Acidity numeber starts at 0 but changes through code to match cases
        int acidity = 0;
        
        //SPLASH PAGE: Visual and description of code with function and instruction
        System.out.println("ACID RAIN");
        System.out.println("Acid Rain is an environmental problem. "
                + "This program determines if the pH level in water is safe for fish.");
        System.out.println("------------------------------------------------------------------------------------------------------");
        
        //INPUT: Only input for user which is the pH of rain the user found
        System.out.println("Enter the pH level:");
        double pH = input.nextDouble();

        //PROCESSING: The different ranges of pH that depending on input matches one of the lines below
        if (pH <= 1 || pH >= 10){
            acidity = resultInvalid ;
        }
        else if (pH > 7.5){
            acidity = resultAlkaline;
        }
        else if (pH < 6.5){
            acidity = resultAcidic;
        }
        else {
            acidity = resultNeutral;
        }
        
        //OUTPUT: This tells the user the pH of the rain they collected and works 
        //depending on the adicity ranges that is either 1, 2, 3, or 0 and prints out the acidity of the rain
        switch (acidity){
            case resultAlkaline :
               System.out.println("TOO ALKALINE - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE");
               break;
            case resultAcidic :
               System.out.println("TOO ACIDIC - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
               break;
            case resultNeutral:
               System.out.println("NEUTRAL - FISH IN STREAMS, RIVERS AND LAKES WILL SURVIVE.");
               break;
            case resultInvalid :
               System.out.println("INVALID pH");

        }
        
        
        
       
    }
    
}
