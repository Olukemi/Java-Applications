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
public class Counters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Code to count ten passes through a while loop
 
        // declare counter variable with the initial value 0
        int counter = 0;

        while (counter != 10) {
            counter += 1;         
            // incrementing the counter here
            System.out.println( counter );
        }
    }
    
}
