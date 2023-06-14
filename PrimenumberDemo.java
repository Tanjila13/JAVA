
package day9;

import java.util.Scanner;


public class PrimenumberDemo {
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
