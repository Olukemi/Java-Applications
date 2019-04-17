/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.kemi.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author 1ODUJINRIKEM
 */
public class SINCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //OBJECTS
        Scanner input = new Scanner(System.in);
        //VARIABLES
        String sinNumber = "130692544";
        //SPLASH PAGE 
        //PROCESSING
        for (int n = 0; n < sinNumber.length();){
            String numbers = sinNumber.substring(n);
            n = n + 2;
            System.out.println(sinNumber);
        }
        //OUTPUT
    }
    
}
