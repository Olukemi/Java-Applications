/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.kemi.ics3u.u7;

/**
 *
 * @author 1ODUJINRIKEM
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numbers[] = {20, 77, 41, 834, 196, 2, 111, 508, 16, 27};
        display(numbers);
        selectionSort(numbers);
        display(numbers);
        selectionSort(numbers);
    }
    public static void selectionSort(int numbers[]) {
        int swaps = 0;
        int comps = 0;
        boolean swapMade = true;
        // MULTIPLE PASSES
        for (int pass = 0; pass < numbers.length && swapMade; pass++) {
            swapMade = false;
            // PASS
            int maxIndex =  0;
            for (int i = 1; i < numbers.length - 1 - pass; i++) {
                int max = numbers[0];
                if (numbers[i] > max) {
                    max = numbers[i];
                    comps++;
                    maxIndex = i;
                }
                swap(numbers, maxIndex, numbers.length -1);
                    swapMade = true;
                    swaps++;
                    
                
            }
            
        }
        System.out.println("COMPS: " + comps );
        System.out.println("SWAPS: " + swaps );
    }

    public static void swap(int numbers[], int i, int j) {//i = 4, j = 2
        int extraHand = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = extraHand;

    }

    public static void display(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(" ");
    }
}
