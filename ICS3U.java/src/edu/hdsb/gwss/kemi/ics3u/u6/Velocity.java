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
    public static void main(String[] args) {
        int distance = collectedDistance();
        int time = collectedTime();
        
        double velocity = distance / time;
        System.out.println("The velocity of your object is " + velocity + "m/s");
    }
    
    public static int collectedDistance(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the distance of the object(m): ");
        int distance = input.nextInt();
        
        return distance;
        
        
    }
    public static int collectedTime(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the time of the object(s): ");
        int time = input.nextInt();
        
        return time;
    }
    
    
}
