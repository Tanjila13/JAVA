
package day7;

import java.util.Scanner;


public class UserinputSumDemo {
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in); 
        int m,n;
        int sum = 0;
        
        System.out.println("Enter first number: ");
        m = input.nextInt();
        
        System.out.println("Enter second number: ");
        n = input.nextInt();
        
        
        
        for (int i = m; i <= n; i++) {
            sum = sum+i;
            System.out.println("Number: "+i);
            
            }
        System.out.println(sum);
        
    }
    
    
}
