/*
 * Name: Kemi
 * Date: April 25th 2019.
 * Version: v0.01
 * Decription: This program takes birth dates of students from a file and then determines 
wheteher the birth dates of these students makes them old enough for a constest or too young.
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
        //OBJECTS: These are used to create, read and communicate data through input and output files.
        File outFile = new File("OUT11.txt");
        File inFile = new File("DATA11.txt");
        PrintWriter output = new PrintWriter(outFile);
        Scanner input = new Scanner(inFile);

        //CONSTANTS: N/A

        //VARIABLES: These are variables for the birth date inputs.
        int month;
        int day;
        int year;
        String birthDate;

        //INPUT: N/A

        //PROCESSING && OUTPUT: The input was tokenized and then turned to integers that can be compared in an
        //if else statement and is print an output that determines if the students are old enough of too young.
        while (input.hasNext()) {
            birthDate = input.nextLine();
            StringTokenizer st = new StringTokenizer(birthDate, "  ");
            while (st.hasMoreTokens()) {
                month = Integer.parseInt(st.nextToken());
                day = Integer.parseInt(st.nextToken());
                year = Integer.parseInt(st.nextToken());
                year = 2019 - year;
                if (year == 14 && day > 25 ) {
                    output.println("too young");
                } else if (year >= 14 && day <= 25){
                    output.println("old enough");
                } else {
                    output.println("too young");
                }
            }

        }

        // CLOSING FILE: This tells the program that the file is complete and can process any actions.
        output.close();

    }

}
