/*
 * Name: Kemi
 * Date: Mar 2nd 2019
 * Version: v0.01
 * Description: Cosine Law Calulator
 */
package edu.hdsb.gwss.kemi.ics3u.u2;

/**
 *
 * @author kemij
 */
import java.util.Scanner;
public class CosineLaw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 sides of a triangle and the contained angle:");
        int fside = input.nextInt();
        int sside = input.nextInt();
        int angle = input.nextInt();
        
        double tside = Math.sqrt((fside * fside) + (sside * sside) - ((2 * fside * sside) * Math.cos(angle)));
        System.out.println("The third side is " + tside);
                }
    
}
