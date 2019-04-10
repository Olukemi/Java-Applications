/*
 * Name: Kemi
 * Date: April 5th 2019
 * Version: v0.01
 * Description: This program calculates in time when the soil erosion 
has been decreased to 10 cm. It print an  output in years.
 */
package edu.hdsb.gwss.kemi.ics3u.u4;

/**
 *
 * @author 1ODUJINRIKEM
 */
public class SoilErosion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONSTANTS
        //VARIABLES
        double topsoil = 30;
        int year = 0;
        int yearItHits = 0;
        //SPLASH PAGE
        System.out.println("Topsoil Erosion\n");
        System.out.println("Careless land management causes approximately 1.25% of the topsoil to erode each year. \n"
                + "It is then lost forever since it takes nature approximately 400 years to produce 2.5cm of topsoil.  \n"
                + "At 10cm, the topsoil is so shallow the crops cannot grow on a large scale. \n"
                + "If Canada has about 30cm of topsoil, how many years will it take for the depths to be\n"
                + "reduced to 10cm?\n");
        //INPUT : N/A
        //PROCESSING && OUTPUT
        while (topsoil >= 10) {
            topsoil = (topsoil / 1.0125) + (2.5 / 400);
            year++;
            System.out.println(year + " " + topsoil);
        }

        System.out.println("It will take " + year + " years for the soil to erode to a depth such that crops will not grow.");


    }

}
