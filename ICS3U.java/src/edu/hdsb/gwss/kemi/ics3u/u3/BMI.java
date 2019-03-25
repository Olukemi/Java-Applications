/*
 * Name: Kemi
 * Date: March 25th 2019
 * Version: v0.01
 * Description: This program calculates a person's BMI and outputs an appropriate response, 
depending on their BMI. The user has the option to enter the weight and height 
in metric or imperial.
 */
package edu.hdsb.gwss.kemi.ics3u.u3;

/**
 *
 * @author 1ODUJINRIKEM
 */
import java.util.Scanner;
public class BMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
      //CONSTANTS
      //VARIABLES
      double rating = 0;
      //SPLASH PAGE
      //INPUT
        System.out.println("Enter 'M' for metric or 'I' if you want inmperial measurements:");
        String formula = input.next();
        
      //PROCESSING
      if (formula.equals("M")){
        System.out.println("Please enter your weight(m):");
        double weight = input.nextDouble();     
        System.out.println("Please enter your height(kg)");
        double height = input.nextDouble();
        rating = weight / ( height * height );
        System.out.println(rating);
      }
      else if (formula.equals("I")){
        System.out.println("Please enter your weight(in):");
        double weight = input.nextDouble();     
        System.out.println("Please enter your height(lbs)");
        double height = input.nextDouble();
        rating  = ( weight * 703 ) / ( height * height);
        System.out.println(rating);
      }
      
      if (rating < 16)
          System.out.println("Your BMI rating is Starvation");
      }
      else if(rating > 16 ^ rating < 18.5 )
      else if (rating > 40 || rating  > 40){
          System.out.println("Your BMI rating is Morbidly Obese");
      }
      //OUTPUT
      
      
        
    }
    
}
