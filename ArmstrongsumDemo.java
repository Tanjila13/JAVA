
package day10;

import java.util.Scanner;


public class ArmstrongsumDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num,temp,r,sum = 0;
        
        System.out.println("enter any int number: ");
        num = input.nextInt();
        
        temp = num;
        while(temp!=0){
        r = temp%10;
        sum = sum+r*r*r;
        temp = temp/10;
        
        }
        
        if(num == sum){
        System.out.println("Armstrong");
        }
        else{
        System.out.println("Not Armstrong");
        }    
        
    }
    
}
