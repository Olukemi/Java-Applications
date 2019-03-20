/*
 * Name: Kemi
 * Date: March 19th 2019
 * Version: v0.01
 * Description: This program compares the cell plan between two different plans 
                and tells the user which is better
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
        int weekendMinCost_A = 20;
        
        int dayMinCost_B = 45;
        int eveningMinCost_B = 35;
        int weekendMinCost_B = 25; 
        
                
        //VARIABLES
        double costPlanA_Day = 0;
        double costPlanB_Day = 0;
        double costPlanA_Eve = 0;
        double costPlanB_Eve = 0;
        double costPlanA_Week = 0;
        double costPlanB_Week = 0;     
                 
        //SLASH PAGE
        System.out.println("WELCOME TO CELL SELL COMPARE APP!");
        System.out.println("We will carefully compare the prices of twwo cell/n "
                + "plans and respond in which of the two has the best offer");
        System.out.println("Please enter the following");
        System.out.println("--------------------------");
        
        //INPUT
        System.out.println("Number of daytime minutes:");
        int dayMin = input.nextInt();
        System.out.println("Number of evening minutes:");
        int eveMin = input.nextInt();
        System.out.println("Number of weekend minutes:");
        int weeMin = input.nextInt();
        
        //PROCESSING
        if (dayMin > 100){
            costPlanA_Day = costPlanA_Day + (dayMin - 100) * dayMinCost_A;
        }
        if (dayMin > 250 ){
            costPlanB_Day = costPlanB_Day + (dayMin - 250) * dayMinCost_B;
        }
        
        costPlanA_Day = costPlanA_Day / 100;
        costPlanB_Day = costPlanB_Day / 100;
        
        double costTotal_A = costPlanA_Day + costPlanA_Eve + costPlanA_Week;
        double costTotal_A = costPlanA_Day + costPlanA_Eve + costPlanA_Week;       
        
        //OUTPUT
        System.out.println("Plan A costs" + costPlanA_Day);
        System.out.println("Plan B costs" + costPlanB_Day);
        
        if (costPlanA_Day == costPlanB_Day){
            System.out.println("Plan A and B are the same price!");
        }
        else if (costPlanA_Day > costPlanB_Day){
            System.out.println("Plan B is the better deal!");
        }
        else 
            System.out.println("Plan A is the better deal!");
        
 
    }
    
}
