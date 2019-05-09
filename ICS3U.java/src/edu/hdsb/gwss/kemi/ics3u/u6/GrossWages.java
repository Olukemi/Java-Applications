/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.kemi.ics3u.u6;

import java.util.Scanner;

/**
 *
 * @author 1ODUJINRIKEM
 */
public class GrossWages {

    /**
     * @param args the command line arguments
     */
    public static void hoursAndWage() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of hours worked: ");
        hours = input.nextDouble();
        System.out.println("Please enter the hourly wage:");
        wage = input.nextDouble();

    }

    public static double hours, wage, grossWage;

    public static void main(String[] args) {
        hoursAndWage();
        double remainingHours;
        if (hours > 40){
            remainingHours = hours - 40;
            grossWage = (40 * 10) + (remainingHours * 1.5 * 10);
        } else {
            grossWage = hours * 10;
        }
        System.out.println("Gross Wage: $" + grossWage);
        
    }

}
