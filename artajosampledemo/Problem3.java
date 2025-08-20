/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package artajosampledemo;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number:");
          int num1 = sc.nextInt();
        
        System.out.print("Enter 2nd number:");
          int num2 = sc.nextInt();
        System.out.print("Enter 3rd number:");
          int num3 = sc.nextInt();
        sc.close();
        int greatest = Math.max(Math.max(num1, num2), num3);
       System.out.println("The greatest :" + greatest);}
        
}
