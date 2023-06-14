
package day11;

import java.util.Scanner;


public class PatternDemo2 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter row number: ");
       int n = input.nextInt();
    
    int row,col;
    
    for(row = 1;row<=n;row++){
    for(col = 1; col<= row;col++){
    System.out.print(" * ");
    }
    System.out.println();
    }
    
    
    
    }
    
}
