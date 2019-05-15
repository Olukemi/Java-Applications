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
    // This asks for user time input and calls the two methods below that converts between standard and traditional and vice versa.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a Time:");
        String time = input.nextLine();
        if (time.substring(time.length()-2).toUpperCase().equals("AM") || time.substring(time.length()-2).toUpperCase().equals("PM")){
            convertToStandardTime(time);
        } else {
        convertToTraditional(time);
        } 

    }
 
    //This method converts standard time to traditional time(has AM or PM)and is coded to avoid mistakes while printing
    public static void convertToTraditional(String sTime) {
        StringTokenizer st = new StringTokenizer(sTime, ": ");
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int tHour;
        //invaild time
        if (min > 59 || min < 0 || hour >= 24 || sTime.length() <= 4) {
            System.out.println("invalid time");
        } else if (sTime.length() <= 5){
            System.out.print("Traditional Time: ");
            // time between 13 and 23:59(1pm to 11:59pm)
            if (hour > 12 && hour < 24) {
                tHour = hour - 12;
                if (min == 0) {
                    System.out.println(tHour + ":" + min + "0 PM ");
                } else if (min >= 1 && min <= 9) {
                    System.out.print(tHour + ":0" + min + " PM ");
                } else {
                    System.out.print(tHour + ":" + min + " PM ");
                }
                // time that is between 12 and 12:59(12pm to 12:59pm)
            } else if (hour == 12) {
                if (min == 0) {
                    System.out.println("12:" + min + "0 PM ");
                } else if (min >= 1 && min <= 9) {
                    System.out.print("12:0" + min + " PM ");
                } else {
                    System.out.print("12:" + min + " PM ");
                }
                //time that is between 00 and 00:59(12am to 12:59am)
            } else if (hour == 0) {
                if (min == 0) {
                    System.out.println("12:" + min + "0 AM ");
                } else if (min >= 1 && min <= 9) {
                    System.out.print("12:0" + min + " AM ");
                } else {
                    System.out.print("12:" + min + " AM ");
                }
            } else {
                //time that is between 01 and 11:59(1am to 11:59am)
                tHour = hour - 0;
                if (min == 0) {
                    System.out.println(tHour + ":" + min + "0 AM ");
                } else if (min >= 1 && min <= 9) {
                    System.out.print(tHour + ":0" + min + " AM");
                } else {
                    System.out.print(tHour + ":" + min + " AM");
                }
            }      
        } else {
            System.out.println("invalid time");
        }
    }

    //This method converts traditional time(has AM or PM) to standard time and is coded to avoid mistakes while printing.
    public static void convertToStandardTime(String tTime) {
        StringTokenizer st = new StringTokenizer(tTime, ":  ");
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        String amPm = st.nextToken();
        String caseamPm = amPm.toUpperCase();
        int sHour;
        //invalid time
        if (min > 59 || min < 0 || hour > 12 || hour <= 0|| tTime.length() <= 6) {
            System.out.println("invalid time");
        } else {
            //time that is between 12am and 12:59am (00 to 00:59)
            if (caseamPm.equals("AM") && hour == 12) {
                System.out.print("Standard Time: ");
                if (min == 00) {
                    System.out.println("00:" + min + "0");
                } else if (min >= 1 && min <= 9) {
                    System.out.print("00:0" + min);
                } else {
                    System.out.print("00:" + min);
                }
                //time that is between 12pm and 12:59pm (12 and 12:59)
            } else if (caseamPm.equals("PM") && hour == 12) {
                System.out.print("Standard Time: ");
                if (min == 0) {
                    System.out.println(hour + ":" + min + "0");
                } else if (min >= 1 && min <= 9) {
                    System.out.print(hour + ":0" + min);
                } else {
                    System.out.print(hour + ":" + min);
                }
                //time that is between 1am and 11:59am (01 to 11:59)
            } else if (caseamPm.equals("AM") && hour != 12) {
                System.out.print("Standard Time: ");
                if (min == 0) {
                    System.out.println(hour + ":" + min + "0");
                } else if (min >= 1 && min <= 9) {
                    System.out.print(hour + ":0" + min);
                } else {
                    System.out.print(hour + ":" + min);
                }
                //time that is between 1pm and 11:59pm (13 to 23:59)
            } else if (caseamPm.equals("PM") && hour != 12) {
                System.out.print("Standard Time: ");
                sHour = hour + 12;
                if (min == 0) {
                    System.out.println(sHour + ":" + min + "0");
                } else if (min >= 1 && min <= 9) {
                    System.out.print(sHour + ":0" + min);
                } else {
                    System.out.print(sHour + ":" + min);
                }
            } else {
                System.out.println("invaild time");
            }
        }
    }

}
