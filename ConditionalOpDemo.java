
package day_5;

import java.util.Scanner;


public class ConditionalOpDemo {
    public static void main(String[] args){
    
       Scanner input = new Scanner(System.in);
       int x,y,l; //l=large
       
       System.out.print("Enter two numbers: ");
       x = input.nextInt();
       y = input.nextInt();
       
       l= (x>y)? x:y;
       System.out.println("Large digit: "+l);
       
       
       
       
    }
    
}
