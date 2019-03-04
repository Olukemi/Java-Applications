/*
 * Name: Kemi
 * Date: Mar 2nd 2019
 * Version: v0.01
 * Description: Tip Calculator
 */
package edu.hdsb.gwss.kemi.ics3u.u2;

/**
 *
 * @author 1ODUJINRIKEM
 */
import java.util.Scanner;
public class TipCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal: ");
        System.out.println("Enter the gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble();
        double tax = subtotal * (gratuity / 100);
        double total = tax + subtotal;
        System.out.println("The gratuity is " + tax + " and total is " + total);
        
     
    }
    
}
