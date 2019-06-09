/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.kemi.ics3u.u7;

import java.util.Scanner;

/**
 *
 * @author kemij
 */
public class StringSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] names;
        names = new String [6];
        for (int i = 0; i < names.length; i++){
            System.out.println("Enter a name:");
            String name = input.next();
            names[i] = name;   
        }
        display(names);
        bubbleStringSort(names);
        bubbleStringSort(names);
        display(names);
    }
    public static void bubbleStringSort(String names[]) {
        int swaps = 0;
        int comps = 0;
        boolean swapMade = true;
        // MULTIPLE PASSES
        for (int pass = 0; pass < names.length && swapMade; pass++) {
            swapMade = false;
            // PASS
            for (int index = 0; index < names.length - 1 - pass; index++) {
                if (names[index].compareTo(names[index + 1])>0) {
                    swap(names, index, index + 1);
                    swapMade = true;
                    swaps++;
                }
                comps++;
            }      
        }
        System.out.println("COMPS: " + comps );
        System.out.println("SWAPS: " + swaps );
    }
    
    public static void swap(String names[], int i, int j) {//i = 4, j = 2
        String extraHand = names[i];
        names[i] = names[j];
        names[j] = extraHand;

    }
    
    public static void display(String names[]) {
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println(" ");
    }
    
}
