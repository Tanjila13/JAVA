
package day8;

import java.util.Scanner;


public class FactorialDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n,fact = 1;
        
        System.out.println("Enter any positive number: ");
        n = input.nextInt();
        
        for (int i = n; i>= 1; i--) {
            fact = fact*i;
            
        }
        System.out.println("Factorial: "+fact);
               
        
        
    }
    
}
