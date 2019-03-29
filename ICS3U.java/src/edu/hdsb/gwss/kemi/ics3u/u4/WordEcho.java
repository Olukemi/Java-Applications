/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.kemi.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author 1ODUJINRIKEM
 */
public class WordEcho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //CONSTANTS
        //VARIABLES
        String word;
        int characters;
        int wordLength;
        //SPLASH PAGE
        //INPUT
        System.out.println("Enter a word:");
        word = input.next();
        wordLength=word.length();
        characters = wordLength;
        //PROCESSING
        while (word.length() <= characters){
            System.out.println("The word " + word + " has a lenght of " + characters + " characters");
            System.out.print(word + " ");
            wordLength++;
        }
        //OUTPUT
    }
    
}
