/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.kemi.ics3u.u5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author 1ODUJINRIKEM
 */
public class RandomStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("RandomStrings.txt");
        PrintWriter output = new PrintWriter(file);

        int str;
        for (int counter = 1; counter <= 100; counter++) {
            str = (char) ((int) (Math.random() * 26) + 'A');
            for (int strCounter = 0; strCounter <= 6; strCounter++){
                output.print(str);
            }
            output.println(str);
        }

        output.close();
    }

}
