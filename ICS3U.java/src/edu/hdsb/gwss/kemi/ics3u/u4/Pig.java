/*
 * Name: Kemi
 * Date: April 9th 2019
 * Version: v0.01
 * Description: This is a game program that the user plays with the computer. 
The point of the game is to get to 100 but there rules the code follows
 */
package edu.hdsb.gwss.kemi.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author 1ODUJINRIKEM
 */
public class Pig {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //CONSTANTS
        //VARIABLES
        int die;
        boolean play = true;
        String quitOrPlay;
        //SPLASH PAGE
        //INPUT: N/A
        //PROCESSING & OUTPUT
        for (int userScore = 0, compScore = 0, userRoll = 0, compRoll = 0; userScore <= 100 && compScore <= 100;) {
            while (play) {
                die = (int) (Math.random() * 6) + 1;
                System.out.println(die);
                if (die != 1) {
                    userScore = userScore + die;
                    userRoll++;
                } else if (die == 1){
                    userScore = userScore;
                    play = false;
                    System.out.println("Do you want to continue playing? Enter 'Y' or 'N'");
                    quitOrPlay = input.next();
                }
            }
        }

    }

}
