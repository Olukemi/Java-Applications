/*
 * Name: Kemi
 * Date: April 28th 2019.
 * Version: v0.01
 * Decription: This programs tells the user if the two words or strings in a line are the same pattern through their
vowel and consonant order.
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
        //OBJECT: These are used to create, read and communicate data through input and output files.
        File outFile = new File("OUT21.txt");
        File inFile = new File("DATA21.txt");
        PrintWriter output = new PrintWriter(outFile);
        Scanner input = new Scanner(inFile);

        //CONSTANTS: N/A
        
        //VARIABLES: These variables are holders for where changes string in the file are stored and that can later be altered.
        String word1;
        String word2;
        
        //INPUT: N/A
        
        //PROCESSING && OUTPUT: Reads then converts letters into c and v (consonants and vowels) then compares the two strings.
        while (input.hasNext()) {
            StringTokenizer st = new StringTokenizer(input.nextLine(), " ");
            while (st.hasMoreTokens()) {
                word1 = st.nextToken();
                word2 = st.nextToken();
                String pattern1 = "";
                System.out.print("word1 ");
                for (int i = 0; i < word1.length(); i++) {
                    char character1 = word1.charAt(i);
                    if (character1 == 'a' || character1 == 'e' || character1 == 'i' || character1 == 'o' || character1 == 'u') {
                        character1 = 'v';
                        pattern1 = pattern1 + character1;
                    } else {
                        character1 = 'c';
                        pattern1 = pattern1 + character1;
                    }
                }
                System.out.print(pattern1);
                String pattern2 = "";
                System.out.print(" word2 ");
                for (int n = 0; n < word2.length(); n++) {
                    char character2 = word2.charAt(n);
                    if (character2 == 'a' || character2 == 'e' || character2 == 'i' || character2 == 'o' || character2 == 'u') {
                        character2 = 'v';
                        pattern2 = pattern2 + character2;
                    } else {
                        character2 = 'c';
                        pattern2 = pattern2 + character2;
                    }
                }
                System.out.print(pattern2);
                System.out.println(" ");
                if (pattern1.equals(pattern2)) {
                    output.println(" same ");
                } else {
                    output.println(" different ");
                }

            }
        }
        //CLOSING FILE This tells the program that the file is complete and can process any actions.
        output.close();
    }

}
