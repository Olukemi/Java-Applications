/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.kemi.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author 1ODUJINRIKEM
 */
public class PictureFramming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //VARIABLES
        int m, n, p, q;

        //INPUT
        System.out.println("Enter a value for the length of your picture:");
        m = 3;//input.nextInt();
        System.out.println("Enter a value for the width of your picture:");
        n = 4;//input.nextInt();
        System.out.println("Enter a value for the width of your mat:");
        p = 1; //input.nextInt();
        System.out.println("Enter a value for the width of your frame:");
        q = 2; //input.nextInt();

        //PROCESSING
        //TOP
        for (int r = 0; r < q; r++) {
            for (int i = 0; i < (2 * q + 2 * p + n); i++) {
                System.out.print("#");
            }
            System.out.println("");
        }
        
        for (int r = 0; r < p; r++) {
            // LEFT FRAME
            for (int i = 0; i < (q); i++) {
                System.out.print("#");
            }
            
            // MATTE
            for (int i = 0; i < ( 2 * p + n); i++) {
                System.out.print("+");
            }
            
            // RIGHT FRAME
            for (int i = 0; i < (q); i++) {
                System.out.print("#");
            }
            System.out.println("");
        }
        
        
        
        for (int r = 0; r < p; r++) {
            // LEFT FRAME
            for (int i = 0; i < (q); i++) {
                System.out.print("#");
            }
            
            // MATTE
            for (int i = 0; i < ( 2 * p + n); i++) {
                System.out.print("+");
            }
            
            // RIGHT FRAME
            for (int i = 0; i < (q); i++) {
                System.out.print("#");
            }
            System.out.println("");
        }
        
        //BOTTOM
        for (int r = 0; r < q; r++) {
            for (int i = 0; i < (2 * q + 2 * p + n); i++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }

}
