
package day11;

import java.util.Scanner;


public class PatternDemo3 {
    
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter row number: ");
       int n = input.nextInt();
    
    int row,col;
    
    for(row = 1;row<=n;row++){
        System.out.print(" ");
    for(col = 1; col<= row;col++){
    System.out.print(" * ");
    }
    System.out.println();
    }
    
    
    
    }
    
}
