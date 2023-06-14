    
package day12;

import java.util.Scanner;
public class Arrysummation {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    double number[]= new double[5];
    double sum=0;
    System.out.println("enter any five numbers: ");
    
    for(int i=0;i<5;i++){
    number[i]=input.nextDouble();
    }
    
    for(int i =0;i<5;i++){
   sum = sum+number[i];
    }
    
    /*number[0]=input.nextDouble();
    number[1]=input.nextDouble();
    number[2]=input.nextDouble();
    number[3]=input.nextDouble();
    number[4]=input.nextDouble();*/
   //double sum = number[0]+number[1]+number[2]+number[3]+number[4];summation
    
    System.out.println("result= "+sum);
    
    double avg = sum/5;
    System.out.println("average= "+avg);
    
    }
    
}
