/*
 * Name: Kemi
 * Date: March 25th 2019
 * Version: v0.01
 * Description: This program calculates a person's BMI and outputs an appropriate 
response, depending on their BMI. The user has the option to enter the weight and height 
in metric or imperial.
 */
package edu.hdsb.gwss.kemi.ics3u.u3;

/**
 *
 * @author 1ODUJINRIKEM
 */
import java.util.Scanner;

public class BMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //CONSTANTS: N/A
        
        //VARIABLES: This is a holder for the calculated value of BMI that has its own index
        double rating = 0;
        
        //SPLASH PAGE: Inroduces program and tells the user its purpose and function
        System.out.println("Welcome to the Body Mass Index");
        System.out.println("Body Mass Index (BMI) is a measure of the weight of "
                + "\na person scaled according to their height. BMI is defined as "
                + "\nthe individual's body weight divided by the square of their height. "
                + "\nIt is almost always expressed in the unit kg/m2.");
        System.out.println("------------------------------------------------------------");
        
        //INPUT: One of the input that askes the user which TYPE of measurement they want 
        System.out.println("Enter 'M' for metric or 'I' if you want inmperial measurements:");
        String typeOfFormula = input.next();

        //PROCESSING: The different versions of the same code. If the user chose 
        //M or I they have their own formula and code regardless of the number(rating) 
        //the value works on the output below(reasoing to only one rating variable). 
        //It also askes for weight and height for both formula
        switch (typeOfFormula){
            case "M":
                System.out.println("Please enter your weight(kg):");
                double weight_M = input.nextDouble();
                System.out.println("Please enter your height(m):");
                double height_M = input.nextDouble();
                rating = Math.round(weight_M / (height_M * height_M));
                System.out.println(rating);
                break;
            case "I" :
                System.out.println("Please enter your weight(lbs):");
                double weight_I = input.nextDouble();
                System.out.println("Please enter your height(in):");
                double height_I = input.nextDouble();
                rating = Math.round((weight_I * 703) / (height_I * height_I));
                System.out.println(rating); 
                break;
            default:
                System.out.println("INVAILD ANSWER");
                break;
        }
        
        //OUTPUT: Finally, depending on the numeber one of these if statements 
        //will output the BMI depending on the users inputs
        if (typeOfFormula.equals("M") || typeOfFormula.equals("I")){
            if (rating < 16){
            System.out.println("Your BMI is Starvation.");
            }
            else if (rating > 16 && rating < 18.5){
                System.out.println("Your BMI is Underweight.");
            }
            else if (rating > 18.5 && rating < 25){
                System.out.println("Your BMI is Ideal.");
            }
            else if (rating > 25 && rating < 30){
                System.out.println("Your BMI is Overweight.");
            }
            else if (rating > 30 && rating < 40){
                System.out.println("Your BMI is Obese.");
            }
            else if (rating > 40){
                System.out.println("Your BMI is Morbidly Obese.");
            }
        }
         
    }

}
