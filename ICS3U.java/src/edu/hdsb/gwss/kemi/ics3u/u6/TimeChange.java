/*
 * Name: Kemi
 * Date: May 17th 2019
 * Version: v0.01
 * Description: This program will
 */
package edu.hdsb.gwss.kemi.ics3u.u6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author kemij
 */
public class TimeChange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File outFile = new File("TimeOutput.txt");
        File inFile = new File("TimeInput.txt");
        PrintWriter output = new PrintWriter(outFile);
        Scanner input = new Scanner(inFile);
        while (input.hasNext()) {
            String time = input.nextLine();
            if (time.substring(time.length() - 2).toUpperCase().equals("AM") || time.substring(time.length() - 2).toUpperCase().equals("PM")) {
                output.println(convertToStandardTime(time));
            } else {
                output.println(convertToTraditional(time));
            }
        }
        output.close();
    }

    //This method converts standard time to traditional time(has AM or PM)and is coded to avoid mistakes while printing
    public static String convertToTraditional(String sTime) throws FileNotFoundException {
        StringTokenizer st = new StringTokenizer(sTime, ": ");
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int tHour;
        String time = "";
        //invaild time
        if (min > 59 || min < 0 || hour >= 24 || sTime.length() <= 4) {
            time = "invalid time";
        } else if (sTime.length() <= 5) {
            // time between 13 and 23:59(1pm to 11:59pm)
            if (hour > 12 && hour < 24) {
                tHour = hour - 12;
                if (min == 0) {
                    time = time + tHour + ":" + min + "0 PM ";
                } else if (min >= 1 && min <= 9) {
                    time = time + tHour + ":0" + min + " PM ";
                } else {
                    time = time + tHour + ":" + min + " PM ";
                }
                // time that is between 12 and 12:59(12pm to 12:59pm)
            } else if (hour == 12) {
                if (min == 0) {
                    time = time + "12:" + min + "0 PM ";
                } else if (min >= 1 && min <= 9) {
                    time = time + "12:0" + min + " PM ";
                } else {
                    time = time + "12:" + min + " PM ";
                }
                //time that is between 00 and 00:59(12am to 12:59am)
            } else if (hour == 0) {
                if (min == 0) {
                    time = time + "12:" + min + "0 AM ";
                } else if (min >= 1 && min <= 9) {
                    time = time + "12:0" + min + " AM ";
                } else {
                    time = time + "12:" + min + " AM ";
                }
            } else {
                //time that is between 01 and 11:59(1am to 11:59am)
                tHour = hour - 0;
                if (min == 0) {
                    time = time + tHour + ":" + min + "0 AM ";
                } else if (min >= 1 && min <= 9) {
                    time = time + tHour + ":0" + min + " AM";
                } else {
                    time = time + tHour + ":" + min + " AM";
                }
            }
        } else {
            time = "invalid time";
        }
        return time;
    }

    //This method converts traditional time(has AM or PM) to standard time and is coded to avoid mistakes while printing.
    public static String convertToStandardTime(String tTime) throws FileNotFoundException {
        String newTTime;
        if (tTime.substring(tTime.length() - 2).equals("AM")) {
            newTTime = tTime.replace("AM", " AM");
        } else if (tTime.substring(tTime.length() - 2).equals("am")){
            newTTime = tTime.replace("am", " am");
        } else if (tTime.substring(tTime.length() - 2).equals("PM")){
            newTTime = tTime.replace("PM", " PM");
        }else {
            newTTime = tTime.replace("pm", " pm");
        }
        StringTokenizer st = new StringTokenizer(newTTime, ": ");
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        String amPm = st.nextToken();
        String caseamPm = amPm.toUpperCase();
        int sHour;
        String time = "";
        //invalid time
        if (min > 59 || min < 0 || hour > 12 || hour <= 0 || tTime.length() <= 6) {
            time = "invalid time";
        } else {
            //time that is between 12am and 12:59am (00 to 00:59)
            if (caseamPm.equals("AM") && hour == 12) {
                if (min == 00) {
                    time = time + "00:" + min + "0";
                } else if (min >= 1 && min <= 9) {
                    time = time + "00:0" + min;
                } else {
                    time = time + "00:" + min;
                }
                //time that is between 12pm and 12:59pm (12 and 12:59)
            } else if (caseamPm.equals("PM") && hour == 12) {
                if (min == 0) {
                    time = time + hour + ":" + min + "0";
                } else if (min >= 1 && min <= 9) {
                    time = time + hour + ":0" + min;
                } else {
                    time = time + hour + ":" + min;
                }
                //time that is between 1am and 11:59am (01 to 11:59)
            } else if (caseamPm.equals("AM") && hour != 12) {
                if (min == 0) {
                    time = time + hour + ":" + min + "0";
                } else if (min >= 1 && min <= 9) {
                    time = time + hour + ":0" + min;
                } else {
                    time = time + hour + ":" + min;
                }
                //time that is between 1pm and 11:59pm (13 to 23:59)
            } else if (caseamPm.equals("PM") && hour != 12) {
                sHour = hour + 12;
                if (min == 0) {
                    time = time + sHour + ":" + min + "0";
                } else if (min >= 1 && min <= 9) {
                    time = time + sHour + ":0" + min;
                } else {
                    time = time + sHour + ":" + min;
                }
            } else {
                time = "invaild time";
            }
        }
        return time;
    }
}
