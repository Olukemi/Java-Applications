/*
 * Name: Kemi
 * Date: April 28th 2019
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
public class Arablish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        //OBJECTS
        File outFile = new File("OUT31.txt");
        File inFile = new File("DATA31.txt");
        PrintWriter output = new PrintWriter(outFile);
        Scanner input = new Scanner(inFile);

        //CONSTANTS
        //VARIABLES
        //PROCESSING && OUTPUT:
        while (input.hasNext()) {
            StringTokenizer st = new StringTokenizer(input.nextLine(), "  ");
            int numberOfTokens = st.countTokens();
            while (st.hasMoreTokens()) {
                String word = st.nextToken();
                String reverse = "";
                for (int i = word.length() - 1; i >= 0; i--) {
                    reverse = reverse + word.charAt(i);
                }
                String reverseWord = reverse + " ";
                System.out.println(reverseWord);
            }
        }

        //CLOSING 
        output.close();

    }

}
