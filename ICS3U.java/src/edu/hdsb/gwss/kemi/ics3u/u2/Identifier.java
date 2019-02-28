/*
 * Name: Kemi
 * Date: Feb 28th 2019
 * Version: v0.01
 * Description: Identifiers
 */
package edu.hdsb.gwss.kemi.ics3u.u2;

/**
 *
 * @author 1ODUJINRIKEM
 */
public class Identifier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // PRIMATIVE DATA TYPES
        int age = 33; // nummber with no decimals
        long realBigNumber = 8447481;
        double winnipegPercent = 0.5; // number with decimals
        char middleInitial = 'A'; // single character
        boolean doYouLikeThisClass = true; //true or false only
        
        
        //OTHER DATA TYPE (not primative)
        String yourFirstName = "Kemi";
        
        
        //DISPLAY OUTPUT
        System.out.println("Hello " + yourFirstName + "!");
        System.out.println("Wow! " + age + " is so old");
        System.out.println("What does " + middleInitial + " stand for?");
        System.out.println("Do you like this class? " + doYouLikeThisClass);
        
    }
    
}
