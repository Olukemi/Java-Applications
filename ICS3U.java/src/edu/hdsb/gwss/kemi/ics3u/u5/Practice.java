/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.kemi.ics3u.u5;

/**
 *
 * @author kemij
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "  ABC123XYZ789ABC123XYZ89  ";
        String t = "ABB23";       
        System.out.println(s.substring(4));
        System.out.println(s.toLowerCase());
        System.out.println(s.trim());
        System.out.println(s.trim().compareTo(t));
        System.out.println(s.charAt(1));
        System.out.println(s.indexOf("9", 5));
        System.out.println(s.replaceAll( "ABC", "abc"));
        System.out.println(s.lastIndexOf("9"));
        System.out.println(s.indexOf("fdas"));
        System.out.println(s.codePointAt(3));
        
                
          
    }
    
}
