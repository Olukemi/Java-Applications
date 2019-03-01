/*
 * Name: Kemi
 * Date: Feb 28th 2019
 * Version: v0.01
 * Description: Celcius to Fahrenheit
 */
package edu.hdsb.gwss.kemi.ics3u.u2;

/**
 *
 * @author 1ODUJINRIKEM
 */
import java.util.Scanner;
public class CelciusToFahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Formual (0°C × 9/5) + 32 = 32°
        
        // User inputs a celcius number 
        System.out.println("Enter a degree in Celcius: ");
        Scanner input = new Scanner(System.in);
        double numberc = input.nextDouble();
        // answer is input in the equation
        double answer = numberc * (9.0 /5) + 32;
        
        System.out.println(numberc + " Celcius is " + answer + " Fahrenheit");
        
        
        
        
    }
    
}
