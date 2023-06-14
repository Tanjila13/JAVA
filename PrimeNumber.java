/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Scanner;

/**
 *
 * @author Tanzila
 */
public class PrimeNumber {
    
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a,count = 0;
        
        System.out.println("Enter any positive number: ");
        a = input.nextInt();
        
        for (int i = 2; i < a; i++) {
            if(a%i==0){
                
                count++;
                break;
         }
           
        }
        if(count==0){
         System.out.println("Prime number");
        }   
            else{
        System.out.println("Not prime");
        }
            
        
        
       
        
        
    }
    
}


    

