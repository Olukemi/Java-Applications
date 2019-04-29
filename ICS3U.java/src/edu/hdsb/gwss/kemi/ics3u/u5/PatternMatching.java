/*
 * Name: Kemi
 * Date: April 28th 2019.
 * Version: v0.01
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
public class PatternMatching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        //OBJECT: 
        File outFile = new File("OUT21.txt");
        File inFile = new File("DATA21.txt");
        PrintWriter output = new PrintWriter(outFile);
        Scanner input = new Scanner(inFile);

        //CONSTANTS:
//        String phrase = input.next();
        //VARIABLES:
        int i = 0;
        String word1;
        String word2;
        //INPUT: N/A
        //PROCESSING && OUTPUT:
        while (input.hasNext()) {
            StringTokenizer st = new StringTokenizer(input.nextLine(), "  ");

            word1 = st.nextToken();
            word2 = st.nextToken();
            char character1 = word1.charAt(i);
            char character2 = word2.charAt(i);
            while (i < word1.length()) {
                if (character1 == 'a' || character1 == 'e' || character1 == 'i' || character1 == 'o' || character1 == 'u') {
                    character1 = 'v';
                } else {
                    character1 = 'c';
                }
                if (character2 == 'a' || character2 == 'e' || character2 == 'i' || character2 == 'o' || character2 == 'u') {
                    character2 = 'v';
                } else {
                    character2 = 'c';
                }
            }
            String pattern1 = character1 + "";
            String pattern2 = character2 + "";
            System.out.print("word1" + pattern1);
            System.out.print("word2" + pattern2);

            if (pattern1.equals(pattern2)) {
                output.println(" same ");
            } else {
                output.println(" different ");
            }
            i++;

        }

        //CLOSING FILE This tells the program that the file is complete and can process any actions.
        output.close();
    }

}
