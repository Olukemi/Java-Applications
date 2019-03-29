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
public class Accumulators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Code to add the EVEN numbers from 2 to 10 in a while loop

        int counter = 0;           // declare counter variable with the initial value 0
        int sum = 0;               // declare the accumulator variable with the initial value of 0
 
        while (counter != 10) {
            counter += 2;            // incrementing the counter here
            sum += counter;
        }

        System.out.println( "Sum of Even Values from 2-10: " + sum );
    }
    
}
