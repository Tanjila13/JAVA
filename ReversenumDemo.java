
package day10;

import java.util.Scanner;


public class ReversenumDemo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int r, temp,n,sum=0;
        
        System.out.println("enter any number: ");
        n = input.nextInt();
        
        temp = n;
        while(temp!=0){
        r = temp%10;
        sum = sum*10+r;
        temp = temp/10;
        
       }
        System.out.println(sum);
        
        
        
    }
    
    
}
