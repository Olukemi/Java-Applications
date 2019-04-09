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
        int populationStart = 0;
        int populationEnd = 10;
        int foodSupplyStart = 0;
        int hour = 0;
        int foodSupplyEnd = 1000;

        //SPLASH PAGE
        System.out.println("Lab Animals\n");
        System.out.println("At present there are X animals in the lab and enough food for Y animals.  At the end of every hour \n"
                + "the population doubles, and enough food is added to support Z more animals. During any hour the \n"
                + "animals will eat enough food for only themselves. The program will determine when the population \n"
                + "will outgrow the food supply.\n");

        //INPUT
        System.out.format("%-16s %10s\n", "Enter the Initial Population  (X)", ":");
        //population = input.nextInt();
        System.out.format("%-16s %10s\n", "Enter the Initial Food Supply (Y)", ":");
        //foodSupply = input.nextInt();
        System.out.format("%-16s %2s\n", "Enter the Amount of Food to Add Each Hour", ":");
        //foodPerHour = input.nextInt();
        System.out.println(" ");

        System.out.print("Hour |");
        System.out.print(" Animals at Start |");
        System.out.print(" Food At Start |");
        System.out.print(" Food At End |");
        System.out.println(" Animals At End |");

        //PROCESSING & OUTPUT       
        while(!(populationEnd >= foodSupplyEnd)){
            hour++;
            populationStart = populationEnd;
            foodSupplyStart = foodSupplyEnd;
            foodSupplyEnd = foodSupplyEnd + 4000;
            populationEnd = populationEnd * 2;
            System.out.format("%-2s %14s %18s %14s %12s\n", hour, populationStart, foodSupplyStart, foodSupplyEnd, populationEnd);
        }


    }

}
