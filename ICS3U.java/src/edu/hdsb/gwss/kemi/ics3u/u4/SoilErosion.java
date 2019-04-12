/*
 * Name: Kemi 
 * Date: April 5th 2019.
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
        //CONSTANTS: N/A
        
        //VARIABLES: These variables are in response to the value of topsoil per 
        //year and the years it takes the topsoil to equal to 10cm.
        double topsoil = 30;
        int year = 0;
        int yearItHits = 0;
        
        //SPLASH PAGE: Background informationa about topsoil and a question that the code answers. 
        System.out.println("Topsoil Erosion\n");
        System.out.println("Careless land management causes approximately 1.25% of the topsoil to erode each year. \n"
                + "It is then lost forever since it takes nature approximately 400 years to produce 2.5cm of topsoil.  \n"
                + "At 10cm, the topsoil is so shallow the crops cannot grow on a large scale. \n"
                + "If Canada has about 30cm of topsoil, how many years will it take for the depths to be\n"
                + "reduced to 10cm?\n");
        
        //INPUT : N/A
        
        //PROCESSING: As long as the topsoil value is greater that 10 
        //this code run and will stop once the while statement is not true. As this is going, the year increases but one.
        while (topsoil >= 10) {
            topsoil = (topsoil / 1.0125) + (2.5 / 400);
            year++;
        }
        //OUTPUT: Displays the number of years it takes for the soil to decrease to a point corps cannot grow.
        System.out.println("It will take " + year + " years for the soil to erode to a depth such that crops will not grow.");


    }

}
