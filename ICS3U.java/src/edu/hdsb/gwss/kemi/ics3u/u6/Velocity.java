/*
 * Name: Kemi
 * Date: May 8th 2019
 * Version: v0.01
 * Description: This program calculates the velocity from user input.
 */
package edu.hdsb.gwss.kemi.ics3u.u6;

import java.util.Scanner;

/**
 *
 * @author 1ODUJINRIKEM
 */
public class Velocity {

    /**
     * @param args the command line arguments
     */
    //Collects user data input, specifically distance and time.
    public static void distanceAndTime(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the distance of the object(m): ");
        distance = input.nextInt();
        System.out.println("Enter the time of the object(s): ");
        time = input.nextInt();

    }
    //Calculates for velocity using the data from the method above call distanceAndTime and prints 
    //the velocity.
    public static int distance, time;
    public static void main(String[] args) {
        distanceAndTime();
        double velocity = distance / time;
        System.out.println("The velocity of your object is " + velocity + "m/s");
    }

    
    
}
