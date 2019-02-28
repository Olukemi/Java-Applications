/*
 * Name:
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
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a degree in Celcius: ");
        double numberc = input.nextDouble();
        
        int answerf = numberc * (9.0 /5) + 32; 
       
        
        
        System.out.println(numberc + "Celcius is" + answerf + "Fahrenheit");
        
        
        
        
    }
    
}
