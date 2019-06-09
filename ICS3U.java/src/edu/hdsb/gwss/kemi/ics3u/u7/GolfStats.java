/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.kemi.ics3u.u7;

import java.util.Scanner;

/**
 *
 * @author 1ODUJINRIKEM
 */
public class GolfStats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] data = new int[4];
        for (int i = 0; i < data.length; i++) {
            System.out.println("Enter score:");
            data[i] = input.nextInt();
        }

        for (int index = 0; index < data.length; index++) {
            System.out.println(data[index]);
        }
        System.out.print("Total Score:");
        System.out.println(totalValue(data));
        System.out.print("Highest Score:");
        System.out.println(maxValue(data));
        System.out.print("Lowest Score:");
        System.out.println(minValue(data));

    }

    public static int maxValue(int data[]) {
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    public static int minValue(int data[]) {
        int min = data[3];
        for (int i = 1; i < data.length; i--) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }
    public static int totalValue(int data[]) {
        int total = 0;
        for (int i = 1; i < data.length; i++) {
            total = total + data[i];
        }
        return total;
    }
    
}
