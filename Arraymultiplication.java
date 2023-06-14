
package day12;

import java.util.Scanner;


public class Arraymultiplication {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num[] = new int[2];
        int mul = 0;
        
        System.out.println("Enter any two number: ");
        for (int i = 0; i < 2; i++) {
            num[i] = input.nextInt();
           }
         for(int i=0;i<2;i++){
         mul = mul*num[i];
         }
         System.out.println("Result is= "+mul);
    }

}

    

