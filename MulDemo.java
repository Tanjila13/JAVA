
package day8;

import java.util.Scanner;


public class MulDemo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int m,n;
        
        System.out.println("Enter initial number: ");
        m = input.nextInt();
        
        System.out.println("Enter final number: ");
         n = input.nextInt();
         
         for (int i = n; i <= m; i++) {
             for (int j = 1; j<= 10; j++) {
              System.out.println(i+" x "+j +"="+i*j);   
             }
             
             System.out.println("\n");
          
        }
        
        
        
    }
        
    
}
