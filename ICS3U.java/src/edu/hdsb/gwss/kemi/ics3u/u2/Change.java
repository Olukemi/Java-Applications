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
public class Change {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
        System.out.println("Enter the change in cents less than a dollar:");
        int change = input.nextInt();
        
        double quarter = change / 25;
        double dime = Math.floor((change - (quarter * 25)) / 10);
        double nickel = Math.floor(((change - (quarter * 25)) - dime * 10) / 5);
        double penny = Math.floor(((change - (quarter * 25)) - dime * 10 - nickel * 5) / 1);
    
        System.out.println("The minimum number of coins is:");
        
        System.out.println("    Quarters: " + quarter);
        System.out.println("    Dimes: " + dime);
        System.out.println("    Nickels: " + nickel);
        System.out.println("    Pennies " + penny);
    }
    
}
