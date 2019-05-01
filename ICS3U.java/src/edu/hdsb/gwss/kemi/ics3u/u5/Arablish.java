/*
 * Name: Kemi
 * Date: April 28th 2019
 * Version: v.0.01
 * Decription: This program converts arablish to english by reversing the order of words in a sentences and the letters in a word. 
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
        //OBJECTS: These are used to create, read and communicate data through input and output files.
        File outFile = new File("OUT31.txt");
        File inFile = new File("DATA31.txt");
        PrintWriter output = new PrintWriter(outFile);
        Scanner input = new Scanner(inFile);

        //CONSTANTS: N/A
        
        //VARIABLES: N/A (They are in processing and they cannot move because it ruins the code).
        
        //PROCESSING && OUTPUT: Reverses the words' order and their letters but keeps the number string as they are.
        while (input.hasNextLine()) {
            StringTokenizer st = new StringTokenizer(input.nextLine(), "  ");
            int numberOfTokens = st.countTokens();
            String reverseLine = "";
            while (st.hasMoreTokens()) {
                String word = st.nextToken();
                String reverseWord = "";
                String reverse = "";
                boolean ifNum;
                int counter = 0;
                for (int i = word.length() - 1; i >= 0; i--) {
                    if ((word.codePointAt(i) >= 48) && (word.codePointAt(i) <= 57)) {
                        counter++;
                    }
                    if (counter == word.length()) {
                        reverseWord = word;
                    } else {
                        reverse = reverse + word.charAt(i);
                        reverseWord = reverse + " ";
                    }
                }
                reverseLine = reverseWord + " " + reverseLine;
            }
            output.println(reverseLine);
        }
        //CLOSING FILE: This tells the program that the file is complete and can process any actions.
        output.close();

    }

}
