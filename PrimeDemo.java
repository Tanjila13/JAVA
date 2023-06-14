
package day9;

import java.util.Scanner;


public class PrimeDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m,n,count=0;
        
        System.out.println("enter initial number: ");
        m = input.nextInt();
        
        System.out.println("enter final number: ");
        n = input.nextInt();
        
        for (int i = m; i <= n; i++) {
            for (int j = 2; j <= i-1; j++) {
                if(i%j==0)
                {
                count++;
                break;
                }
              }
            if(count==0)
             System.out.println("Prime number are: "+i);
             count = 0;
             
            
        }
        
        
        
    }
    
}
