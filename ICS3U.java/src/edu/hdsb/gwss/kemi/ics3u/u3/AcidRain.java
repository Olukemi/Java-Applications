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
        //CONSTANTS
        
        //VARIABLES
   
        double acidity = 0;
        
        //SPLASH PAGE
        System.out.println("ACID RAIN");
        System.out.println("Acid Rain is an environmental problem.  "
                + "This program determines if the pH level in water is safe for fish.");
        System.out.println("---------------------------------------------------------");
        System.out.println("Enter the pH level:");
        
        //INPUT
        double pH = input.nextInt();
        
        if (pH > 7.5){
            acidity = 1;
        }
        else if (pH < 6.5){
            acidity = 2;
        }
        
        //PROCESSING
        //OUTPUT
        switch (acidityLevel){
            case 1 :
               System.out.println("TOO ALKALINE - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE");
               break;
            case 2 :
               System.out.println("TOO ACIDIC - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
               break;
            case 3:
               System.out.println("NEUTRAL - FISH IN STREAMS, RIVERS AND LAKES WILL SURVIVE.");
               break;
            default :
               System.out.println("INVALID");
        }
        
        
        
       
    }
    
}
