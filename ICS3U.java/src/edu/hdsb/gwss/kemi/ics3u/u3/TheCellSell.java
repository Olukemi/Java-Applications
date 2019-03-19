/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.kemi.ics3u.u3;

/**
 *
 * @author 1ODUJINRIKEM
 */
import java.util.Scanner;
public class TheCellSell {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //CONSTANTS
        int dayMinCost_A = 25;
        int eveningMinCost_A = 15;
        int weekendMin_A = 20;
        
        int dayMinCost_B = 45;
        int eveningMin_B = 35;
        int weekendMin_B = 25; 
        
                
        //VARIABLES
        int costPlanA = 0;
        int costPlanB = 0;
        
        int dayMin = input.nextInt();
        int eveMin = input.nextInt();
        int weeMin = input.nextInt();
                 
        //SLASH PAGE
        System.out.println("WELCOME TO CELL SELL COMPARE APP!");
        System.out.println("We will carefully compare the prices of twwo cell/n "
                + "plans and respond in which of the two has the best offer");
        
        //INPUT
        
        
        //PROCESSING
        if (dayMin > 100){
            costPlanA = costPlanA + (dayMin - 100) * dayMinCost_A;
        }
        if (dayMin > 250 ){
            costPlanB = costPlanB + (dayMin - 250) * dayMinCost_B;
         }
        
        //OUTPUT
    }
    
}
