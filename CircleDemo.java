
package day5;

import java.util.Scanner;


public class CircleDemo {
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        double a,r;
        
        System.out.println("Enter radius: ");
        r = input.nextDouble();
        
        a = 3.1416*r*r;
        System.out.println("area: "+a);
    
    }
            
    
}
