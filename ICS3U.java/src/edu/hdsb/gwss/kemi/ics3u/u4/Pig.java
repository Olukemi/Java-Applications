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
        int userDie;
        int compDie;
        boolean play = true;
        String quitOrPlay;
        String rollOrSkip;
        //SPLASH PAGE
        //INPUT: N/A
        //PROCESSING & OUTPUT
        userDie = 0;
        System.out.println("Your score is " + userDie);
        compDie = 0;
        System.out.println("The computer's score is " + compDie);
        for (int userScore = 0, compScore = 0, userRoll = 0; userScore <= 100 && compScore <= 100;) {
            while (play) {
                if (userDie != 1) {
                    userDie = (int) (Math.random() * 6) + 1;
                    System.out.println("Your die value is " + userDie);
                    userScore = userScore + userDie;
                    System.out.println("Your score is " + userScore);
                    System.out.println("Would you like to roll again or skip your turn? Enter 'R' for roll "
                            + "again or 'S' for skip turn");
                    rollOrSkip = input.next();
                    if (rollOrSkip == "R") {
                        userRoll++;
                        userDie = (int) (Math.random() * 6) + 1;
                        System.out.println("Your die value is " + userDie);
                        userScore = userScore + userDie;
                        System.out.println("Your score is " + userScore);
                    } 
                userDie = userDie;  
                    if (rollOrSkip == "S"){
                        System.out.println("Do you want to continue playing? Enter 'Y' or 'N'");
                        quitOrPlay = input.next();
                        if (quitOrPlay == "Y") {
                            System.out.println("It is the computer's turn");
                            for (int compRoll = 0, compRollNumber = (int) (Math.random() * 8) + 3; compRoll >= compRollNumber;) {
                                compDie = (int) (Math.random() * 6) + 1;
                                System.out.println("The computer's die value is " + compDie);
                                compScore = compScore + compDie;
                                System.out.println("The computer's score " + compScore);
                            }
                        } else if (quitOrPlay == "N") {
                            System.out.println("Thanks for playing!");
                            play = false;
                        }
                    }
                }
                if (userDie == 1) {
                    userScore = userScore;
                    System.out.println("Your score is " + userScore);
                    userDie = 0;
                    System.out.println("Do you want to continue playing? Enter 'Y' or 'N'");
                    quitOrPlay = input.next();
                    if (quitOrPlay == "Y") {
                        System.out.println("It is the computer's turn");
                    } else if (quitOrPlay == "N") {
                        System.out.println("Thanks for playing!");
                        play = false;
                    }
                    for (int compRoll = 0, compRollNumber = (int) (Math.random() * 8) + 3; compRoll >= compRollNumber;) {
                        compDie = (int) (Math.random() * 6) + 1;
                        System.out.println("The computer's die value is " + compDie);
                        compScore = compScore + compDie;
                        System.out.println("The computer's score " + compScore);
                    }

                }
                userScore = userScore;
            }
        }

    }

}
