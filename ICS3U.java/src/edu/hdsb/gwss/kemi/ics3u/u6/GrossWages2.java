/*
 * Name: Kemi
 * Date: May 10th 2019
 * Version: v0.01
 * Description:
 */
package edu.hdsb.gwss.kemi.ics3u.u6;

import static edu.hdsb.gwss.kemi.ics3u.u6.GrossWages.hoursAndWage;
import java.util.Scanner;

/**
 *
 * @author 1ODUJINRIKEM
 */
public class GrossWages2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of hours worked: ");
        double hours = input.nextDouble();
        countryWage(hours);

    }
    public static void countryWage(double a) {
        double remainingHours;
        double grossWageCAN, grossWageUS;
        //canada & us
        if (a > 40){
            remainingHours = a - 40;
            grossWageCAN = (40 * 14) + (remainingHours * 1.5 * 14);
            grossWageUS = (40 * 15.84) + (remainingHours * 1.5 * 15.84);
        } else {
            grossWageCAN = a * 14;
            grossWageUS = a * 15.84;
        }
        System.out.println("Gross Wage: $" + grossWageCAN + grossWageUS);
        
        //others
        if (a > 40 || a < 40){
            grossWage = a * 0.15;
        }
        
    }
}
