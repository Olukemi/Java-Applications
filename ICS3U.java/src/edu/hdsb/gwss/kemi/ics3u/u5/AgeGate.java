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
        //VARIABLES 

        //PROCESSING
        while (input.hasNext()) {
            String birth = input.nextLine();
            StringTokenizer st = new StringTokenizer(birth, "  ");
            System.out.println(birth);
        }

        // Close File
        input.close();

        //OUTPUT
    }

}
