/*
 * Name: Kemi
 * Date: Mar 2nd 2019
 * Version: v0.01
 * Description: Tenses of Digits
 */
package edu.hdsb.gwss.kemi.ics3u.u2;

/**
 *
 * @author kemij
 */
import java.util.Scanner;
public class Digits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a three digit number:");
        int number = input.nextInt();
        
        System.out.println("The Hundredth Place Digit is:");
        System.out.println("The Tens Place Digit is     :");
        System.out.println("The Ones Place Digit is     :");
    }
    
}
