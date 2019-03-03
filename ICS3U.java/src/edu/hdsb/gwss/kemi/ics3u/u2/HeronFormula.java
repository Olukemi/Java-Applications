/*
 * Name: Kemi
 * Date: Mar 2nd 2019
 * Version: v0.0.1
 * Description: Heron Formula
 */
package edu.hdsb.gwss.kemi.ics3u.u2;

/**
 *
 * @author kemij
 */
import java.util.Scanner;
public class HeronFormula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three sides of any triangle");
        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();
        
        double s = ((side1 + side2 + side3) / 2);
        
        double area = Math.sqrt();
        System.out.println(area);
        
        System.out.println("The area of your triangel is ");
    }
    
}
