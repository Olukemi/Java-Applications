/*
 * Name: Kemi
 * Date: April 25th 2019
 * Version: v.0.01
 * Decription:
 */
package edu.hdsb.gwss.kemi.ics3u.u5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author 1ODUJINRIKEM
 */
public class AgeGate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        //OBJECTS
        File outFile = new File("OUT11.txt");
        File inFile = new File("DATA11.txt");
        PrintWriter output = new PrintWriter(outFile);
        Scanner input = new Scanner(inFile);

        //CONSTANTS
        String birth = input.nextLine();
        StringTokenizer st = new StringTokenizer(birth, "  ");
        //VARIABLES
        int month;
        int day;
        int year;

        //PROCESSING (04 25 2019)
        while (input.hasNext()) {
            output.println(input.nextLine());
//            while (st.hasMoreTokens()){
//                output.println(st.nextToken());
//            year = Integer.parseInt(st.nextToken(input.nextLine()));
//            year = 2019 - year;
//            if (year > 14){
//                System.out.println("old enough");
//            } else {
//                System.out.println("too young");
//            }
//            }
            

        }

        // Close File
        input.close();

        //OUTPUT
    }

}
