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
public class PowerTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int table[][]; 
        table = new int [15][5];
        System.out.print("NUMBER");
        System.out.println("                    POWER");
        for(int i = 0, num = 1; i < 15; i++, num++)
        {
            System.out.print(num + "                       ");
            table [i][0] = i + 1;
            for (int j=1; j<5; j++)
            {
                table [i][j] = table [i][j-1] * (i + 1);
                System.out.print(table[i][j] + " ");
            }
            System.out.println("");
            
        }
    }
    
}
