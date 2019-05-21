/*
 * Name: Kemi
 * Date: May 17th 2019
 * Version: v0.01
 * Description: This program will reduce any fraction into its lowest terms.
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
public class ReduceFraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File inFile = new File("ReduceInput.txt");
        File outFile = new File("ReduceOutput.txt");
        Scanner input = new Scanner(inFile);
        PrintWriter output = new PrintWriter(outFile);
        while (input.hasNext()) {
            String line = input.nextLine();
            output.println(stringToNumbers(line));
        }
        output.close();
    }

    public static String stringToNumbers(String line) {
        StringTokenizer st = new StringTokenizer(line, "/ ");
        int num = Integer.parseInt(st.nextToken());
        int den = Integer.parseInt(st.nextToken());
        String answer = greatestCommonDivisor(num, den);
        return answer;
    }

    public static String greatestCommonDivisor(int num, int den) {
        int reduceFrac;
        String reFrac = "";
        int answerNum, answerDen;
        int gcf = 1;
        if (den == 0) {
            reFrac = "undefined";
        } else if ((num % den) == 0) {
            reduceFrac = num / den;
            reFrac = Integer.toString(reduceFrac);
        } else if (num == 0) {
            reduceFrac = 0;
            reFrac = Integer.toString(reduceFrac);
        } else {
            for (int i = 2; i <= Math.abs(Math.min(num, den)); i++) {
                if (num % i == 0 && den % i == 0) {
                    gcf = i;
                }
            }
            answerNum = num / gcf;
            answerDen = den / gcf;
            if (answerNum < 0 && answerDen < 0) {
                answerNum = answerNum / -1;
                answerDen = answerDen / -1;
            } else if (answerDen < 0) {
                answerDen = answerDen / -1;
                answerNum = answerNum * -1;
            }
            reFrac = reFrac + Integer.toString(answerNum) + "/" + Integer.toString(answerDen);

        }

        return reFrac;
    }

}
