/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.kemi.ics3u.u6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author 1ODUJINRIKEM
 */
public class RandomStrings2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File outfile = new File("RandomStrings.txt");
        PrintWriter output = new PrintWriter(outfile);
        File infile = new File("RandomStrings.txt");
        Scanner input = new Scanner(infile);
        for (int counter = 1; counter <= 100; counter++) {
            output.println(randomString(6));
        }
        while (input.hasNext()) {
            System.out.println(input.nextLine());
        }
        output.close();
    }

    public static String randomString(int length) {
        String str = "";
        char letter;
        for (int strCounter = 0; strCounter < length; strCounter++) {
            letter = (char) ((int) (Math.random() * 26) + 'A');
            str = str + letter;
        }
        return str;
    }

}
