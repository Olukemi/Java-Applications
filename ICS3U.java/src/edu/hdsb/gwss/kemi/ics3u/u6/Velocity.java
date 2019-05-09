/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    public static void collectedDistance(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the distance of the object(m): ");
        distance = input.nextInt();
        System.out.println("Enter the time of the object(s): ");
        time = input.nextInt();

    }
    public static int distance, time;
    public static void main(String[] args) {
        collectedDistance();
        double velocity = distance / time;
        System.out.println("The velocity of your object is " + velocity + "m/s");
    }

    
    
}
