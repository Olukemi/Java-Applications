/*
 * Name: Kemi
 * Date: April 10th 2019.
 * Version: v0.01
 * Description: This program plays the game Pig which inviles the user and the computer.
 */
package edu.hdsb.gwss.kemi.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author kemij
 */
public class Pig {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //OBJECTS: This allows the user to input an answer.
        Scanner input = new Scanner(System.in);

        //CONSTANTS: N/A
        //VARIABLES: These temporaly holds the values of the components of the game that changes throughout.
        int userDie;
        int compDie;
        int userScore = 0;
        int compScore = 0;
        boolean play = true;
        boolean skip = true;
        boolean playAgain = false;
        String quitOrPlay;
        String rollOrSkip;
        String playAgainYN;

        //SPLASH PAGE: Introduces the game.
        System.out.println("WELCOME TO THE PIG GAME!");
        System.out.println("You will be playing a game or as many games as you want with the computer.");
        System.out.println("LET'S BEGIN!");
        System.out.println(" ");

        //PROCESSING && OUTPUT: The code on a loop that plays the game pig.
        System.out.println("Do you want to play?");
        quitOrPlay = input.next();
        if (quitOrPlay.equals("N")) {
            System.out.println("That's too bad. Maybe next time.");
            play = false;
        } else {
            play = true;
        }
        while (play == true || playAgain == true) {
            for (int compRoll = 0, compRollNumber = 0; userScore <= 100 && compScore <= 100;) {
                userDie = (int) (Math.random() * 6) + 1;
                if (userDie == 1) {
                    userDie = 0;
                    userScore = userScore + userDie;
                    System.out.println("You don't get to add to your score because your die score was " + userDie);
                    System.out.println("Your score is " + userScore);
                    System.out.println("It's the computer's turn");
                    do {
                        compRollNumber = (int) (Math.random() * 8) + 3;
                        compDie = (int) (Math.random() * 6) + 1;
                        if (compDie == 1) {
                            compDie = 0;
                            compScore = compScore + compDie;
                            System.out.println("The computer's score " + compScore);
                            System.out.println("It's your turn");
                            compRoll = 9;
                        } else {
                            System.out.println("The computer's die value is " + compDie);
                            compScore = compScore + compDie;
                            System.out.println("The computer's score " + compScore);
                            compRoll++;
                        }
                    } while (compRoll <= compRollNumber);
                } else {
                    System.out.println("Your die value is " + userDie);
                    userScore = userScore + userDie;
                    System.out.println("Your score is " + userScore);
                    System.out.println("Would you like to roll again or skip your turn? Enter 'R' for roll "
                            + "again or 'S' for skip turn");
                    rollOrSkip = input.next();
                    if (rollOrSkip.equals("R")) {
                        play = false;
                    } else {
                        System.out.println("It's the computer's turn");
                        do {
                            compRollNumber = (int) (Math.random() * 8) + 3;
                            compDie = (int) (Math.random() * 6) + 1;
                            if (compDie == 1) {
                                compDie = 0;
                                compScore = compScore + compDie;
                                System.out.println("The computer's score " + compScore);
                                System.out.println("It's your turn");
                                compRoll = 9;
                            } else {
                                System.out.println("The computer's die value is " + compDie);
                                compScore = compScore + compDie;
                                System.out.println("The computer's score " + compScore);
                                compRoll++;
                            }
                        } while (compRoll <= compRollNumber);
                    }
                }
            }

        }
        if (userScore >= 100) {
            System.out.println("YOU WIN!");
            System.out.println("Do you want to play again? Enter 'Y' for Yes or 'N' for No");
            playAgainYN = input.next();
            if (playAgainYN.equals("Y")) {
                playAgain = true;
            } else {
                play = false;
                System.out.println("Thanks for playing!");
            }
        } else if (compScore >= 100) {
            System.out.println("You Lose! Better luck next time.");
        }

    }

}
