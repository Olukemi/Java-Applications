/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.kemi.ics3u.u5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author 1ODUJINRIKEM
 */
public class RandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("RandomNumbers.txt");
        PrintWriter output = new PrintWriter(file);
        Scanner input = new Scanner(file);
        

        for (int num = 0, counter = 1; counter <= 100; counter++) {
           num = (int) (Math.random() * 100) + 1;
           output.println(num);
        }
        

        output.close();
    }

}
