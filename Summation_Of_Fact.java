
package assignment1;

import java.util.Scanner;


public class Summation_Of_Fact {
    public static void main(String[] args){
    
     Scanner input = new Scanner(System.in);
     System.out.print("Enter the number: ");
     int n = input.nextInt();
     
     int total = 0;
     int i = 1;
     while(i<=n){
     int fact = 1,j = 1;
     while(j<=i){
         fact = fact*j;
     j=j+1;
     
     }
     total = total + fact;
     i=i+1;
     
     }
    System.out.println("sum: " + total);
    
    }
    
}
