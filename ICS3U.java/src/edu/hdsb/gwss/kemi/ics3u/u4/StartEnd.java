/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.kemi.ics3u.u4;

/**
 *
 * @author 1ODUJINRIKEM
 */
import java.util.Scanner;
public class StartEnd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //CONSTANTS
        //VARIABLES
        int start;
        int end;
        //SPLASH PAGE
        //INPUT 
        System.out.println("Enter a start value:");
        start = input.nextInt();
        System.out.println("Enter an end value:");
        end = input.nextInt();
        //PROCESSING
        System.out.println(":");
        while (start <= end) {
            System.out.print(" " + start);
            start++;
        }
        //OUTPUT
        
    }
    
}
