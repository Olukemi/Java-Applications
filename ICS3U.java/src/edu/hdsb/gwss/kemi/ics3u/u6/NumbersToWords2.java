/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    public static void inputNum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 999:");
        num = input.nextInt();
    }

    public static void hundreds() {
        int x = num / 100;
        if (x > 1) {
            System.out.println(" HUNDRED");
        }
    }

    public static void tens() {
        int x = num / 10;
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

    public static void ones() {
        int x;
        if (num < 100) {
            x = num % 10;
        } else {
            x = num / 100;
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

    public static void teens() {
        int x = num % 10;
        switch (x) {
            case 1:
                System.out.println("ELEVEN");
                break;
            case 2:
                System.out.println("TWELVE");
                break;
            case 3:
                System.out.println("THIRTEEN");
                break;
            case 5:
                System.out.println("FIFTEEN");
                break;
            default:
                System.out.print("TEEN");
        }

    }
    public static int num;

    public static void main(String[] args) {
        inputNum();
        if (num % 10 == 0) {
            tens();
        } else if (num % 100 == 0) {
            ones();
            hundreds();
        } else if (num > 12 && num <= 19 && num != 13 && num != 15) {
            ones();
            teens();
        } else if (num == 11 || num == 12 || num == 13 || num == 15) {
            teens();
        } else if (num % 100 > 0 && ((num % 100) % 10 == 0)) {
            ones();
            hundreds();
            tens();
        } else if (num > 112 && num < 119 && num != 113 && num != 115) {
            ones();
            hundreds();
            ones();
            teens();
        } else if (num == 111 || num == 112 || num == 113 || num == 115) {
            hundreds();
            teens();
        } else if (num < 10 && num > 0) {
            ones();
        } else if (num % 100 > 1 && num % 100 < 9) {
            ones();
            hundreds();
            ones();
        } else if (num < 1 || num > 999) {
            System.out.println("INVAILD NUMBER");
        } else if (num / 100 < 1){
            tens();
            ones();
        } else {
            ones();
            hundreds();
            tens();
            ones();
            
        }

    }

}
