/*
 * Name: Kemi
 * Date: May 9th 2019
 * Version: v0.01
 * Description: This program will convert any number from 1 to 999 to its word representation.
 */
package edu.hdsb.gwss.kemi.ics3u.u6;

import java.util.Scanner;

/**
 *
 * @author kemij
 */
public class NumbersToWords2 {

    /**
     * @param args the command line arguments
     */
    public static void inputNum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 999:");
        num = input.nextInt();
    }
    // Accounts for any number that is divisable by 10.
    public static void tens() {
        int x = num / 10;
        
        if (x == 2){
            System.out.print("TWENTY ");
        }else if (x == 3){
            System.out.print("THIRTY ");
        }else if (x == 4){
            System.out.print("FORTY ");
        }else if (x == 5){
            System.out.print("FIFTY ");
        }else if (x == 6){
            System.out.print("SIXTY ");
        }else if (x == 7){
            System.out.print("SEVENTY ");
        }else if (x == 8){
            System.out.print("EIGHTY ");
        }else if (x == 9){
            System.out.print("NINETY ");
        } else if (x == 1){
            System.out.println("TEN");
        }
    }
    //Accounts for any number that is between 1 and 9
    public static void ones() {
        int x = num % 10;
        if (x == 1){
            System.out.print("0NE");
        }else if (x == 2){
            System.out.print("TW0");
        }else if (x == 3){
            System.out.print("THREE");
        }else if (x == 4){
            System.out.print("FOUR");
        }else if (x == 5){
            System.out.print("FIVE");
        }else if (x == 6){
            System.out.print("SIX");
        }else if (x == 7){
            System.out.print("SEVEN");
        }else if (x == 8){
            System.out.print("EIGHT");
        }else if (x == 9){
            System.out.print("NINE");
        }
        
    }
    // Accounts for numbers between 11 and 19
    public static void teens() {
        int x = num % 10;
        if (x == 1){
            System.out.print("ELEVEN");
        }else if (x == 2){
            System.out.print("TWELVE");
        }else {
            System.out.print("TEEN");
        }
    }
    
    public static void hundreds(){
        int x = num % 100;
        if (x >= 1){
            System.out.println(" HUNDRED");
        }
    }
    // Global variable can be used anywhere in the entire code
    public static int num;
    // Depending on the type of numeber, they use different method(s) to make a specific number in its relation to the number 10
    public static void main(String[] args) {
        inputNum();
        if(num % 10 == 0){
            tens();
        } else if (num > 12 && num <= 19){
            ones();
            teens();
        }else if (num == 11 || num ==12) {
            teens();
        }else if (num > 112 && num <119) {
            ones();
            hundreds();
            teens();
        }else if (num % 100 > 0 && ((num % 100) % 10 == 0)) {
            ones();
            hundreds();
            tens();
        }else if (num % 100 > 1 && num % 100 < 9) {
            ones();
            hundreds();
            ones();
        }else {
            tens();
            ones();
        }
        
    }
    
}
