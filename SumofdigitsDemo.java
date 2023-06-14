
package day9;

import java.util.Scanner;


public class SumofdigitsDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n, r,temp,sum = 0;
         
        System.out.println("Enter any number: ");
        n = input.nextInt();
        
        temp = n;
        while(temp!=0){
        r = temp%10;
        sum = sum+r;
        temp = temp/10;
        }
        System.out.println(+sum);
        
    }
    
}
