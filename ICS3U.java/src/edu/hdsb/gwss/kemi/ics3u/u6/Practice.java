/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.kemi.ics3u.u6;

/**
 *
 * @author 1ODUJINRIKEM
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        int z = 8;
        max(x, y, z);
    }
    
    public static  void max(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }
    
    public static void max(int a, int b, int c){
        int sum = a + b + c;
        System.out.println(sum);
    }
}
