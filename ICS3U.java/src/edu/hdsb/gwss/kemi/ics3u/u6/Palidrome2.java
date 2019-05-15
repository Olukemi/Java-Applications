/*
 * Name: Kemi
 * Date:
 * Version:
 * Description:
 */
package edu.hdsb.gwss.kemi.ics3u.u6;

import java.util.Scanner;

/**
 *
 * @author 1odujinrikem
 */
public class Palidrome2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Palindrome");
        System.out.println("Words that are the same forwards"
                + " and backwards are called palindromes.  This program determine if a word is a palindrome.");
        System.out.println("Enter a Word: ");
        String word = input.nextLine();
        System.out.println(word + " backwards is " + IfPalidrome(word));
        if (word.equals(IfPalidrome(word))){
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

    }

    public static String IfPalidrome(String word) {
        String reverse = "";
        String reverseWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
            reverseWord = reverse + " ";
        }
        return reverseWord;
    }

}
