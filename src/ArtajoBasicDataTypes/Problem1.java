/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ArtajoBasicDataTypes;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a degree in Fahrenhiet");
        double fahrenheit = sc.nextDouble();
        
        double celcius = (fahrenheit - 32) * 5/9.0;
        System.out.println(" 212 If degree Fahrenheit is equal to 100.0 is Celcius");
        
        sc.close();
        
    }
    
}
