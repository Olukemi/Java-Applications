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
        System.out.println(" ");
        bubbleSort(numbers);
    }
    public static void bubbleSort(int numbers[]){
        for (int i = 0, j = i+1; i <= numbers.length; i++){
            if (numbers[i] >= numbers[j]){
                swap(numbers, i, j);
            } else if (numbers[i] <= numbers[j]){
                System.out.println(numbers[i]);
                System.out.println(numbers[i + 1]);
            }
        }
    }
    
    public static void swap(int numbers[], int i, int j){//i = 4, j = 2
        int holder = i;
        i = j;
        j = holder;
        System.out.println(numbers[i]);
        System.out.println(numbers[j]);

    }

}
