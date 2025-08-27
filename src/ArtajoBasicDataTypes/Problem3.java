/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArtajoBasicDataTypes;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem3 {
    public static void main(String[] args) {
        int minutesInDay = 60*24;
        int dayInYear = 365;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of minutes ");
        int minutes = sc.nextInt();
        
        int years = minutes / minutes * dayInYear;
        int day = (minutes % (minutesInDay * dayInYear)) / minutesInDay;
        
        System.out.println(" Minutes is approximately " + years + " years " + day + " day ");
        
        
    }
}
