/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haszeli.BasicCalc;

import java.util.Scanner;
import org.apache.commons.lang3.ArrayUtils;

/**
 *
 * @author apple
 */
public class main {

    /**
     * To receive 9 lines of number and do multiplication based on the pre-defined structures
     * @param args 
     */
    public static void main(String[] args) {
        // Application logic
        boolean valid = false;
        int[] arrI = {};
        Scanner sc;
        char c = ' ';
        
        System.out.println("Purpose of the program is to accept 9 integers in 9 lines\n"
                + "perform calculation and produce 4 rows of result calculating all\n"
                + "numbers (taking 2 numbers for each line and additional 2 lines for\n"
                + "subsequent lines");
        
        for (int i=0; i < 9; i++){
            System.out.println("Enter integer " + (i + 1) + ": ");
            while(!valid){
                try{
                   sc= new Scanner(System.in);
                   arrI = ArrayUtils.add(arrI, sc.nextInt());
                   valid = true;
                }catch (NumberFormatException ex) {
                   System.err.println("Invalid Integer. " + ex.getMessage());
                }
            }
            valid = false;
        }
        
        System.out.println("Choose your calculation method (only add (+), substract (-), multiplication (*) or divide (/) is accepted");
        System.out.println("Your choice: ");
        sc = new Scanner(System.in);
        while(!valid){
            try{
               c = sc.next().charAt(0);
               valid = (c == '+' || c == '-' || c == '*' || c == '/');
            }catch (Exception e) {
                System.err.println("Invalid Character. " + e.getMessage());
            }
        }
        
        main m = new main();
        System.out.println("Doing the computation based on selection: " + c);
        //do the calculation
        switch(c){
            case '+': 
                m.add(arrI); 
                break;
            case '-': 
                m.substract(arrI); 
                break;
            case '*': 
                m.multiply(arrI); 
                break;
            case '/': 
                m.divide(arrI); 
                break;
            default: 
                m.add(arrI); 
                break;
        }
      
    }
    
    /**
     * Perform the addition computation
     * @param arr 
     */
    private void add(int[] arr){
        int x = 0;
        int y = 2;
        int z = 0;
        
        for(int i = 0; i < 4; i++){
            System.out.println();
            while(x < y){
                System.out.print(arr[x]);
                System.out.print(x < y - 1 ? " + " : "");
                z = (x == 0 ? arr[x] : z + arr[x]);
                x++;
            }
            System.out.print(" = " + z);
            x = 0;
            y = y + 2;
            z = 0;
        }
    }
    
    /**
     * Perform the subtraction computation
     * @param arr 
     */
    private void substract(int[] arr){
        int x = 0;
        int y = 2;
        int z = 0;
        
        for(int i = 0; i < 4; i++){
            System.out.println();
            while(x < y){
                System.out.print(arr[x]);
                System.out.print(x < y - 1 ? " - " : "");
                z = (x == 0 ? arr[x] : z - arr[x]);
                x++;
            }
            System.out.print(" = " + z);
            x = 0;
            y = y + 2;
            z = 0;
        }
    }
    
    /**
     * Perform the multiplication computation
     * @param arr 
     */
    private void multiply(int[] arr){
        int x = 0;
        int y = 2;
        int z = 0;
        
        for(int i = 0; i < 4; i++){
            System.out.println();
            while(x < y){
                System.out.print(arr[x]);
                System.out.print(x < y - 1 ? " * " : "");
                z = (x == 0 ? arr[x] : z * arr[x]);
                x++;
            }
            System.out.print(" = " + z);
            x = 0;
            y = y + 2;
            z = 0;
        }

    }
    
    /**
     * Perform the division computation
     * @param arr 
     */
    private void divide(int[] arr){
        int x = 0;
        int y = 2;
        int z = 0;
        
        for(int i = 0; i < 4; i++){
            System.out.println();
            while(x < y){
                System.out.print(arr[x]);
                System.out.print(x < y - 1 ? " / " : "");
                z = (x == 0 ? arr[x] : z / arr[x]);
                x++;
            }
            System.out.print(" = " + z);
            x = 0;
            y = y + 2;
            z = 0;
        }
    }
}
