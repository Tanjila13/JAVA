
package day10;


import java.util.Scanner;


public class PalindromeDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int r,num,temp,sum =0;
        
        System.out.println("Enter any number: ");
        num = input.nextInt();
        
        temp = num;
        while(temp%10!=0){
        r = temp%10;
        sum = sum*10+r;
        temp = temp/10;
      }
        
       if(num==sum){
       System.out.println("palindrome");
       
       }
       else{
       System.out.println("Not palindrome");
       }
        
        
    }
    
}
