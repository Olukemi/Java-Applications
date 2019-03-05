/*
 * Name: Kemi
 * Date: Mar 4th 2019
 * Version: v0.01
 * Decription: Calculating Hall Cost
 */

package edu.hdsb.gwss.kemi.ics3u.u2;

/**
 *
 * @author 1ODUJINRIKEM
 */
import java.util.Scanner;
public class HallCost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int guestnumber = input.nextInt();
        double dinnercost = input.nextDouble();
        
        double intial = 350;
        double finalcost = intial + dinnercost; 
        
        System.out.println("Enter your name:");
        System.out.println("Enter the number of guests you have:");
        System.out.println("Enter the cost per person for dinner");
        
        System.out.println("Your name is " + "and your total cost is $" + finalcost + " at the local banquet hall");
        
        
    }
    
    
}
