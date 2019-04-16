/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.kemi.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author 1ODUJINRIKEM
 */
public class CountingVowels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;

        System.out.println("Counting Vowel");
        System.out.println("The Program counts the number of vowels in a sentence.");
        System.out.println("Enter a sentence:");
        String sentence = input.nextLine();

        for (int i = 0; i < sentence.length();) {
            char vowels = sentence.charAt(i);
            if (vowels == 'a' || vowels == 'e' || vowels == 'i' || vowels == 'o' || vowels == 'u' ){
                number++;
            }
        }
        System.out.println("There are " + number + "vowels in the sentence.");
    }

}
