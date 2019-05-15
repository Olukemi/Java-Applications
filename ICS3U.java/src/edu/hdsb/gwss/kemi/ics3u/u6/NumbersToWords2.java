/*
 * Name: Kemi
 * Date: May 11th 2019.
 * Version: v0.01
 * Description: This program that converts any number from 1 to 999 from its digit representation to its word representation.
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
    //This asks for user number input between 1 and 999.
    public static void inputNum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 999:");
        num = input.nextInt();
    }
    
    // Accounts for any number that is perfectly divisable by 100.
    public static void hundreds() {
        int x = Math.round(num / 100);
        switch (x) {
            case 1:
                System.out.print("ONE HUNDRED ");
                break;
            case 2:
                System.out.print("TWO HUNDRED ");
                break;
            case 3:
                System.out.print("THREE HUNDRED ");
                break;
            case 4:
                System.out.print("FOUR HUNDRED ");
                break;
            case 5:
                System.out.print("FIVE HUNDRED ");
                break;
            case 6:
                System.out.print("SIX HUNDRED ");
                break;
            case 7:
                System.out.print("SEVEN HUNDRED ");
                break;
            case 8:
                System.out.print("EIGHT HUNDRED ");
                break;
            case 9:
                System.out.print("NINE HUNDRED ");
                break;
        }
    }
    
    // Accounts for any number that is divisable by 10.
    public static void tens() {
        int x;
        if (num < 100) {
            x = num / 10;
        } else {
            x = (num % 100) / 10;
        }
        switch (x) {
            case 1:
                System.out.print("TEN ");
                break;
            case 2:
                System.out.print("TWENTY ");
                break;
            case 3:
                System.out.print("THIRTY ");
                break;
            case 4:
                System.out.print("FORTY ");
                break;
            case 5:
                System.out.print("FIFTY ");
                break;
            case 6:
                System.out.print("SIXTY ");
                break;
            case 7:
                System.out.print("SEVENTY ");
                break;
            case 8:
                System.out.print("EIGHTY ");
                break;
            case 9:
                System.out.print("NINETY ");
                break;
        }
    }
    
    //Accounts for any number that is between 1 and 9.
    public static void ones() {
        int x = 0;
        if (num < 100) {
            x = num % 10;
        } else if (num % 100 >= 1 && num % 100 <= 9 ){
            x = num % 100;
        } else {
            x = (num % 100) % 10;
        }
        switch (x) {
            case 1:
                System.out.print("ONE");
                break;
            case 2:
                System.out.print("TWO");
                break;
            case 3:
                System.out.print("THREE");
                break;
            case 4:
                System.out.print("FOUR");
                break;
            case 5:
                System.out.print("FIVE");
                break;
            case 6:
                System.out.print("SIX");
                break;
            case 7:
                System.out.print("SEVEN");
                break;
            case 8:
                System.out.print("EIGHT");
                break;
            case 9:
                System.out.print("NINE");
                break;
        }
    }
    // Accounts for numbers between 11 and 19(more specifically 11, 12, 13, 15).
    public static void teens() {
        int x = num % 10;
        switch (x) {
            case 1:
                System.out.print("ELEVEN");
                break;
            case 2:
                System.out.print("TWELVE");
                break;
            case 3:
                System.out.print("THIRTEEN");
                break;
            case 5:
                System.out.print("FIFTEEN");
                break;
            default:
                System.out.print("TEEN");
        }
    }
    // Global variable can be used anywhere in the entire code.
    public static int num;
    
    // Depending on the type of numeber, they use different method(s) to make a specific number in its relation to the number 10 and 100.
    // Also checks for invaild numbers.
    public static void main(String[] args) {
        inputNum();
        if (num >= 1 && num <= 99) {
            if (num % 10 == 0) {
                tens();
            } else if (num > 12 && num <= 19 && num != 13 && num != 15) {
                ones();
                teens();
            } else if (num == 11 || num == 12 || num == 13 || num == 15) {
                teens();
            } else if (num < 10 && num > 0) {
                ones();
            } else if (num / 100 < 1) {
                tens();
                ones();
            }
        } else if (num >= 100 && num <= 999) {
            if (num % 100 == 0) {
                hundreds();
            } else if (num % 100 > 12 && num % 100 <= 19 && num % 100 != 13 && num % 100 != 15) {
                hundreds();
                ones();
                teens();
            } else if (num % 100 > 0 && ((num % 100) % 10 == 0)) {
                hundreds();
                tens();
            } else if (num % 100 == 11 || num % 100 == 12 || num % 100 == 13 || num % 100 == 15) {
                hundreds();
                teens();
            } else if (num % 100 > 1 && num % 100 < 9) {
                hundreds();
                ones();
            } else {
                hundreds();
                tens();
                ones();
            }
        } else if (num < 1 || num > 999) {
            System.out.println("INVAILD NUMBER");
        }
    }

}
