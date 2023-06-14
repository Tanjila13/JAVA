
package day8;

import java.util.Scanner;


public class SeriesDemo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n,sum =  1;
        
        System.out.println("Enter last number: ");
        n = input.nextInt();
        
        for (int i = 1; i<= n; i=i+2) {
             System.out.print( i+"X"+i+" " );
            sum = sum*i;
            
        }
        System.out.println(" ");
        System.out.println(sum);
        
        
        
        
    
    }
    
}
