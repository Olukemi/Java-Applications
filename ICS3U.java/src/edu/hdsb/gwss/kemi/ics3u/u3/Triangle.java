/*
 * Name: Kemi
 * Date: March 25th 2019
 * Version: v0.01
 * Description: This program tells the user whether their side make of is a vaild triangle and if so 
tells them if it's an actual right angle triangle. 
This program has the user enter three lengths of sides and determines whether the 
figure is a triangle or not.  If a triangle can be formed, it will determine if it is a right-triangle.
 */
package edu.hdsb.gwss.kemi.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author 1ODUJINRIKEM
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //CONSTANTS: N/A
        
        //VARIABLES: N/A
        double sideLenght1;
        double sideLenght2;
        double sideLenght3;
                
        //SPLASH PAGE: Tells the users the characteristics that make a triangle and a right angle triangle
        System.out.println("TRIANGLES\nThree numbers represent the side lengths "
                + "\nof a triangle when the sum of any two sides is greater than the third side.");
        System.out.println("RIGHT TRIANGLES\nA right-angled triangle has the "
                + "\nproperty that when the values of the lengths of the sides are "
                + "\nsquared, the sum of two smaller values is equal to the larger value.");
        System.out.println("--------------------------------------------------------------------");

        //INPUT: Asks the user for 3 sides
        System.out.println("Enter side length #1(cm):");
        sideLenght1 = input.nextDouble();
        System.out.println("Enter side length #2(cm):");
        sideLenght2 = input.nextDouble();
        System.out.println("Enter side length #3(cm):");
        sideLenght3 = input.nextDouble();
        
        
        //PROCESSING & //OUTPUT: Determines if the input can make a triangle and tells the user if so if it can make
        // a right angle triangle 
        double sum1 = sideLenght1 + sideLenght2;
        double sum2 = sideLenght1 + sideLenght3; 
        double sum3 = sideLenght3 + sideLenght2;

        if (sideLenght3 < sum1 && sideLenght2 < sum2 && sideLenght1 < sum3){
            System.out.println("These sides CAN make a triangle!");
        }
        else {
            System.out.println("These sides CANNOT make a triangle;(");
        }
       
        if (sideLenght1 == Math.sqrt((sideLenght2 * sideLenght2) + (sideLenght3 * sideLenght3))){
            System.out.println("These sides CAN make a RIGHT ANGLE triangle!");
        }
        else if (sideLenght2 == Math.sqrt((sideLenght1 * sideLenght1) + (sideLenght3 * sideLenght3))){
            System.out.println("These sides CAN make a RIGHT ANGLE triangle!");
        }
        else if (sideLenght3 == Math.sqrt((sideLenght2 * sideLenght2) + (sideLenght1 * sideLenght1))){
            System.out.println("These sides CAN make a RIGHT ANGLE triangle!");
        }
        else {
            System.out.println("These sides CANNOT make a RIGHT ANGLE triangle:(");
        }
    
        
        
    }
    
}
