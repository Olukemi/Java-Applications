/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
