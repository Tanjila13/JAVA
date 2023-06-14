
package day12;

import java.util.Scanner;
public class MaxMinArray {
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    int x[]=new int[5];
    
    System.out.println("Enter any five numbers: ");
    
    for(int i=0;i<5;i++){
    x[i] =input.nextInt();
    }
    
    int max =x[0];
   for(int i=1;i<5;i++){
     if(max<x[i]){
   max=x[i];
   }
    }
      System.out.println("Maximum is= "+max);
  
      int min = x[0];
      for(int i =1;i<5;i++){
      if(min>x[i]){
      min = x[i];
      }
      }
    System.out.println("minimun is= "+min);
}
    
}
