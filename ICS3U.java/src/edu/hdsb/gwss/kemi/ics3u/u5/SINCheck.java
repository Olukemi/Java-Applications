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
        int number = 0;
        //SPLASH PAGE 
        //PROCESSING
        for (int n = 1; n < sinNumber.length();) {
            String evenNumbers = sinNumber.substring(n, n + 1);
            int evenValue = (Integer.parseInt(evenNumbers)) * 2;
            number = evenValue + number;
            System.out.println(evenNumbers + " * 2 = " + evenValue);
            n = n + 2;
        }
        for (int i = 0; i < sinNumber.length();) {
            String oddNumbers = sinNumber.substring(i, i + 1);
            int oddValue = Integer.parseInt(oddNumbers);
            System.out.println(oddNumbers);
            i = i + 2;
        }

        //OUTPUT
    }

}
