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
                for (int i = word.length() - 1; i >= 0; i--) {
                    reverse = reverse + word.charAt(i);
                    reverseWord = reverse + " ";
                    // This piece of code below accounts for the numbers that don't need to be rearranged/reversed. I have tried very hard
                    //to solve for it and I can't seem to get it, so this code works but without this part of code. Thank you.
//                    for (int n = 0, counter = 0; n <= word.length(); n++) {
//                        if (word.charAt(n) == '9' || word.charAt(n) == '8' || word.charAt(n) == '7' || word.charAt(n) == '6'
//                                || word.charAt(n) == '5' || word.charAt(n) == '4' || word.charAt(n) == '3' || word.charAt(n) == '2'
//                                || word.charAt(n) == '1' || word.charAt(n) == '0') {
//                            counter++;
//                        }
//                        if (counter == word.length()) {
//                            reverseWord = word;
//                        }
//                    }
                }
                reverseLine = reverseWord + " " + reverseLine;
            }
            output.println(reverseLine);
        }
        //CLOSING FILE: This tells the program that the file is complete and can process any actions.
        output.close();

    }

}
