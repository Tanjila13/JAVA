
package fibonaccidemo;

import java.util.Scanner;


public class FibonacciDemo {

    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        System.out.println("Enter any number: ");
       int n = input.nextInt();
       
        int fibo;
        int first = 0;
        int second = 1;
        System.out.print(first+" "+second);
        
        for (int i = 3; i <= n; i++) {
            
            fibo = first+second;
             System.out.print(" "+fibo);
             
            first = second;
            second = fibo;
            
        }
    }
    
}
