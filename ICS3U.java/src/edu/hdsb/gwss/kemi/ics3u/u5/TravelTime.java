/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.kemi.ics3u.u5;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author 1ODUJINRIKEM
 */
public class TravelTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("traveltime.txt");
        Scanner input = new Scanner(System.in);
        
        String flightTime = "03:01:01 10 0";
        int counter = 1;
        
        while (counter <= 5){
            StringTokenizer st = new StringTokenizer( flightTime, ": " );
            int hour = Integer.parseInt(flightTime.substring(0, 2));
            int min = Integer.parseInt(flightTime.substring(2, 4));
            int sec = Integer.parseInt(flightTime.substring(4, 6));
            int flightTimeLength = Integer.parseInt(flightTime.substring(6, 8));
            int timeZone = Integer.parseInt(flightTime.substring(8));
            int newHour = hour + flightTimeLength;
            System.out.println(Integer.toString(newHour));
            
            counter++;
        }
    }
    
}
