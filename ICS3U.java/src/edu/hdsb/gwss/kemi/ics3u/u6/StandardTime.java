/*
 * Name: Kemi
 * Date: May 11th 2019
 * Version: v0.01
 * Description: This program changes the users input of standard time to traditional time and vice versa.
 */
package edu.hdsb.gwss.kemi.ics3u.u6;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author kemij
 */
public class StandardTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a Time:");
        String time = input.next();
        System.out.print("Traditional Time: ");
        convertToStandardTime(time);
    }

    public static void convertToTraditional(String sTime) {
        StringTokenizer st = new StringTokenizer(sTime, ": ");
        int hour = Integer.parseInt(st.nextToken());
        int tHour;
        if (hour > 12 && hour < 24) {
            tHour = hour - 12;
            System.out.print(tHour + ":" + st.nextToken() + " PM ");
        } else if (hour == 12) {
            System.out.print(" 12:" + st.nextToken() + " PM ");
        } else if (hour == 24 || hour == 0) {
            System.out.print(" 12:" + st.nextToken() + " AM ");
        } else {
            tHour = hour - 0;
            System.out.print(tHour + ":" + st.nextToken() + " AM");
        }
    }

    public static void convertToStandardTime(String tTime) {
        StringTokenizer st = new StringTokenizer(tTime, ": ");
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        String amPm = st.nextToken();
        int sHour;
        System.out.println(tTime);
        if (amPm.equals("AM") &&  hour == 12) {
            System.out.print("00:" + min);
        }else if (amPm.equals("PM") && hour == 12) {
            System.out.print(hour + ":" + min);
        }else if (amPm.equals("AM") && hour != 12) {
            System.out.print(hour + ":" + min);
        } else {
            sHour = hour + 12;
            System.out.print(sHour + ":" + min);
        }
    }

}
