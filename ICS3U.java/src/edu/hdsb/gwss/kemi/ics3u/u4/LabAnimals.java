/*
 * Name: Kemi
 * Date: April 6th 2019
 * Version: v0.01
 * Description: 
 */
package edu.hdsb.gwss.kemi.ics3u.u4;

/**
 *
 * @author 1ODUJINRIKEM
 */
import java.util.Scanner;

public class LabAnimals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //CONSTANTS

        //VARIABLES
        int populationStart;
        int foodSupplyStart;
        int hour = 0;
        int foodSupplyEnd = 0;
        int foodPerHour;

        //SPLASH PAGE
        System.out.println("Lab Animals\n");
        System.out.println("At present there are X animals in the lab and enough food for Y animals.  At the end of every hour \n"
                + "the population doubles, and enough food is added to support Z more animals. During any hour the \n"
                + "animals will eat enough food for only themselves. The program will determine when the population \n"
                + "will outgrow the food supply.\n");

        //INPUT
        System.out.format("%-16s %10s\n", "Enter the Initial Population  (X)", ":");
        populationStart = input.nextInt();
        System.out.format("%-16s %10s\n", "Enter the Initial Food Supply (Y)", ":");
        foodSupplyStart = input.nextInt();
        System.out.format("%-16s %2s\n", "Enter the Amount of Food to Add Each Hour", ":");
        foodPerHour = input.nextInt();
        System.out.println(" ");
        
        //PROCESSING & OUTPUT 
        System.out.print("Hour |");
        System.out.print(" Animals at Start |");
        System.out.print(" Food At Start |");
        System.out.print(" Food At End |");
        System.out.println(" Animals At End |");

        if (populationStart <= 0 || foodSupplyStart <= 0 || foodPerHour <= 0) {
            System.out.println("INVALID INPUT. All input must be greater than 0");
        } else {
            int populationEnd = populationStart;
            while (populationEnd <= foodSupplyStart) {
                hour++;
                populationStart = populationEnd;
                foodSupplyEnd = (foodSupplyStart + foodPerHour) - populationStart;
                populationEnd = populationStart * 2;
                System.out.format("%-2s %14s %18s %14s %12s\n", hour, populationStart, foodSupplyStart, foodSupplyEnd, populationEnd);
                foodSupplyStart = foodSupplyEnd;

            }
        }

    }

}
