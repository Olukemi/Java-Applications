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
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numbers[] = {20, 77, 41, 834, 196, 2, 111, 508, 16, 27};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        bubbleSort(numbers);
    }
    public static int bubbleSort(int numbers[]){
        int max = numbers[0];
        for (int counter = 0; counter < numbers.length; counter++)
    }

}
